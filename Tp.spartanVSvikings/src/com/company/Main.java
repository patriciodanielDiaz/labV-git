package com.company;


import com.company.dao.EspartanoDAO;
import com.company.dao.VikingoDAO;
import com.company.domain.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public  static final String DATABASE_DRIVER = "com.mysql.cj.jdbc.Driver";
    public  static final String DATABASE_URL = "jdbc:mysql://localhost:3306/spartanvikings";
    public  static final String USERNAME = "root";
    public  static final String PASSWORD = "";

    public static void main(String[] args) {

        /*BeberVikingoImp bvi=new BeberVikingoImp();
        OrinarVikingoImp ovi=new OrinarVikingoImp();
        Vikingo v1=new Vikingo("pedro",25,70.2f,ovi,bvi,2);
        Vikingo v2=new Vikingo("ramon",35,79f,ovi,bvi,2);
        Vikingo v3=new Vikingo("mario",31,75f,ovi,bvi,2);

        ArrayList<Vikingo> lista2= new ArrayList<Vikingo>();
        lista2.add(v1);
        lista2.add(v2);
        lista2.add(v3);*/

        try {
            VikingoDAO vikingoDAO =new VikingoDAO();

        ArrayList<Vikingo> lista2= vikingoDAO.getAll();
        EquipoVikingo equipoVikingo=new EquipoVikingo(lista2);
        int litros2=equipoVikingo.consumeCerveza();
        System.out.println("Vikingos = " +litros2+" litros");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        /*try {
            VikingoDAO vikingodDAO=new VikingoDAO();
            vikingodDAO.addVikingo(v1);
            vikingodDAO.addVikingo(v2);
            vikingodDAO.addVikingo(v3);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }*/
        //------------------------------------------------------------------------------------
        BeberEspartanoImp bei= new BeberEspartanoImp();
        OrinarEspartanoImp oei=new OrinarEspartanoImp();
        Espartano e1= new Espartano("juan",23,70f,oei,bei,2);
        Espartano e2= new Espartano("pepe",30,80f,oei,bei,2);
        Espartano e3= new Espartano("luis",28,90f,oei,bei,2);

        ArrayList<Espartano> lista=new ArrayList<>();
        lista.add(e1);
        lista.add(e2);
        lista.add(e3);
        EquipoEspartano equipoEspartano=new EquipoEspartano(lista);

        int litros=equipoEspartano.consumeCerveza();
        System.out.println("Espartanos = " +litros+" litros");



    }
}
