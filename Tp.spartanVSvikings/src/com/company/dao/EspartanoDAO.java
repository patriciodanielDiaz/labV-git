package com.company.dao;
import com.company.domain.Espartano;
import com.company.domain.Human;

import java.sql.*;

import static com.company.Main.*;

public
class EspartanoDAO {

   /* private Connection con;

    public EspartanoDAO() throws ClassNotFoundException, SQLException{

        Class.forName(DATABASE_DRIVER);
        con =DriverManager.getConnection(DATABASE_URL,USERNAME,PASSWORD);
        con.setAutoCommit(false);
    }

    public
    Espartano addEspartano (Espartano e) {

        try {
            PreparedStatement ps = con.prepareStatement("insert into humano(name, age, weight) values (?,?,?)", Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, e.getName());
            ps.setInt(2, e.getAge());
            ps.setFloat(3, e.getWeight());
            ps.executeUpdate();
            e.setIdHuman(getAutoIncrement(ps));

            PreparedStatement psE = con.prepareStatement("insert into spartan(id_human, extra_tolerance) values (?,?)", Statement.RETURN_GENERATED_KEYS);
            psE.setInt(2, e.getToleranciaExtra());
            psE.setInt(1, e.getIdHuman());
            psE.executeUpdate();
            e.setId(getAutoIncrement(ps));

            ps.close();
            psE.close();
            con.commit();

        }
        catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
        return e;
    }



    private int getAutoIncrement(PreparedStatement ps) throws SQLException {
        ResultSet rs = ps.getGeneratedKeys();
        rs.next();
        int autoIncrement = rs.getInt(1);
        rs.close();
        return autoIncrement;
    }*/
}
