package com.company.dao;

import com.company.domain.BeberVikingoImp;
import com.company.domain.Espartano;
import com.company.domain.OrinarVikingoImp;
import com.company.domain.Vikingo;

import java.sql.*;
import java.util.ArrayList;

import static com.company.Main.*;

public
class VikingoDAO {

    private Connection con;

    public VikingoDAO() throws ClassNotFoundException, SQLException {

        Class.forName(DATABASE_DRIVER);
        con = DriverManager.getConnection(DATABASE_URL,USERNAME,PASSWORD);
        con.setAutoCommit(false);
    }

    public
    Vikingo addVikingo (Vikingo v) {

        try {
            PreparedStatement ps = con.prepareStatement("insert into human(name, age, weight) values (?,?,?)", Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, v.getName());
            ps.setInt(2, v.getAge());
            ps.setFloat(3, v.getWeight());
            ps.executeUpdate();
            v.setIdHumano(getAutoIncrement(ps));

            PreparedStatement psE = con.prepareStatement("insert into spartan(id_human, extra_tolerance) values (?,?)", Statement.RETURN_GENERATED_KEYS);
            psE.setInt(2, v.getBebedorProfesional());
            psE.setInt(1, v.getIdHumano());
            psE.executeUpdate();
            v.setId(getAutoIncrement(psE));

            ps.close();
            psE.close();
            con.commit();

        }
        catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
        return v;
    }

    private int getAutoIncrement(PreparedStatement ps) throws SQLException {
        ResultSet rs = ps.getGeneratedKeys();
        rs.next();
        int autoIncrement = rs.getInt(1);
        rs.close();
        return autoIncrement;
    }

    public
    ArrayList<Vikingo> getAll(){


        ArrayList<Vikingo> lista=new ArrayList<>();
        try{
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT s.id_spartan,s.id_human,s.extra_tolerance,h.name,h.age,h.weight FROM spartan s inner join human h on h.id_human=s.id_human");
            while (rs.next()) {


                BeberVikingoImp bvi=new BeberVikingoImp();
                OrinarVikingoImp ovi=new OrinarVikingoImp();
                Vikingo v= new Vikingo(rs.getString("h.name"), rs.getInt("h.age"), rs.getFloat("h.weight"),ovi,bvi ,rs.getInt("extra_tolerance"));
                v.setIdHumano(rs.getInt("s.id_human"));
                lista.add(v);
            }
            return lista;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}
