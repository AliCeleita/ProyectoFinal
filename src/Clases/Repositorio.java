/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Clases.Persona;
import Interfaz.Inicio;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import Database.DBManager;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Repositorio {
	
    private static DBManager database = new DBManager();
    static Statement sentencia;
    static ResultSet resultado;
    
    public static void crear (Persona persona) {
        try {
            String query = "INSERT INTO registrom (doc, nom, ape, edad, fecNac, fecReg) VALUES (?, ?, ?, ?, ?, ?);";
            PreparedStatement sentenciaP = database.open().prepareStatement(query);
            sentenciaP.setInt(1,persona.getDoc());
            sentenciaP.setString(2, persona.getNom());
            sentenciaP.setString(3, persona.getApe());
            sentenciaP.setInt(4,persona.getEdad());
            sentenciaP.setDate(5,persona.getFecNac());
            sentenciaP.setTimestamp(6,persona.getFecSeg());
            sentenciaP.executeUpdate();
            database.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        /*
        Se ingresaran las personas INFANTILES a una tabla en PhpMyAdmin
        ingresaran por un registro que se les realizara al inicio del juego
        */
    }
    
    public static void crear2 (Persona persona) {
        try {
            String query = "INSERT INTO registro (doc, nom, ape, edad, fecNac, fecReg) VALUES (?, ?, ?, ?, ?, ?);";
            PreparedStatement sentenciaP = database.open().prepareStatement(query);
            sentenciaP.setInt(1,persona.getDoc());
            sentenciaP.setString(2, persona.getNom());
            sentenciaP.setString(3, persona.getApe());
            sentenciaP.setInt(4,persona.getEdad());
            sentenciaP.setDate(5,persona.getFecNac());
            sentenciaP.setTimestamp(6,persona.getFecSeg());
            sentenciaP.executeUpdate();
            database.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        /*
        Se ingresaran las personas JUVENILES a una tabla en PhpMyAdmin
        ingresaran por un registro que se les realizara al inicio del juego
        */
    }
    
    public static void crear3 (Persona persona) {
        try {
            String query = "INSERT INTO registroc (doc, nom, ape, edad, fecNac, fecReg) VALUES (?, ?, ?, ?, ?, ?);";
            PreparedStatement sentenciaP = database.open().prepareStatement(query);
            sentenciaP.setInt(1,persona.getDoc());
            sentenciaP.setString(2, persona.getNom());
            sentenciaP.setString(3, persona.getApe());
            sentenciaP.setInt(4,persona.getEdad());
            sentenciaP.setDate(5,persona.getFecNac());
            sentenciaP.setTimestamp(6,persona.getFecSeg());
            sentenciaP.executeUpdate();
            database.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        /*
        Se ingresaran las personas ADULTAS a una tabla en PhpMyAdmin
        ingresaran por un registro que se les realizara al inicio del juego
        */
    }
    
    public static void crear4 (Persona persona) {
        try {
            String query = "INSERT INTO registrotodos (doc, nom, ape, edad, fecNac, fecReg) VALUES (?, ?, ?, ?, ?, ?);";
            PreparedStatement sentenciaP = database.open().prepareStatement(query);
            sentenciaP.setInt(1,persona.getDoc());
            sentenciaP.setString(2, persona.getNom());
            sentenciaP.setString(3, persona.getApe());
            sentenciaP.setInt(4,persona.getEdad());
            sentenciaP.setDate(5,persona.getFecNac());
            sentenciaP.setTimestamp(6,persona.getFecSeg());
            sentenciaP.executeUpdate();
            database.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        /*
        Se ingresaran las personas TODOS a una tabla en PhpMyAdmin
        ingresaran por un registro que se les realizara al inicio del juego
        */
    }
    
    public static void crear5 (HistorialPuntajes pun) {
        try {
            String query = "INSERT INTO registrojuego (nom, puntaje, fecSeg) VALUES (?, ?, ?);";
            PreparedStatement sentenciaP = database.open().prepareStatement(query);
            sentenciaP.setString(1,pun.getNombre());
            sentenciaP.setInt(2, pun.getPuntos());
            sentenciaP.setTimestamp(3, pun.getFecSeg());
            sentenciaP.executeUpdate();
            database.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        /*
        Se ingresa el historial de juego
        */
    }
    
    public static ArrayList<HistorialPuntajes> obtenerTodos4() {
        ArrayList<HistorialPuntajes> historial = new ArrayList<HistorialPuntajes>();

        try {
            String query = "SELECT * FROM registrojuego;";
            PreparedStatement sentenciaP = database.open().prepareStatement(query);
            ResultSet resultado = sentenciaP.executeQuery();

            while (resultado.next()) {
                historial.add(HistorialPuntajes.crear(resultado.getInt("id"),resultado.getString("nom"),resultado.getInt("puntaje"),resultado.getTimestamp("fecReg")));
            }

            sentenciaP.close();
            database.close();

            return historial;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return historial;
        
        /*
        Se creara un ArrayList para obtener a las personas INFANTILES que se registraran en una de las
        tablas que se crearon en una base de datos en PhpMyAdmin
        */
    }
    
    public static ArrayList<Persona> obtenerTodos() {
        ArrayList<Persona> personasP = new ArrayList<Persona>();

        try {
            String query = "SELECT * FROM registrom;";
            PreparedStatement sentenciaP = database.open().prepareStatement(query);
            ResultSet resultado = sentenciaP.executeQuery();

            while (resultado.next()) {
                personasP.add(Persona.crear(resultado.getInt("id"), resultado.getInt("doc"), resultado.getString("nom"),resultado.getString("ape"),resultado.getInt("edad"),resultado.getDate("fecNac"),resultado.getTimestamp("fecReg")));
            }

            sentenciaP.close();
            database.close();

            return personasP;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return personasP;
        
        /*
        Se creara un ArrayList para obtener a las personas INFANTILES que se registraran en una de las
        tablas que se crearon en una base de datos en PhpMyAdmin
        */
    }
    
    public static ArrayList<Persona> obtenerTodos2() {
        ArrayList<Persona> personasM = new ArrayList<Persona>();

        try {
            String query = "SELECT * FROM registro;";
            PreparedStatement sentenciaP = database.open().prepareStatement(query);
            ResultSet resultado = sentenciaP.executeQuery();

            while (resultado.next()) {
                personasM.add(Persona.crear2(resultado.getInt("id"), resultado.getInt("doc"), resultado.getString("nom"),resultado.getString("ape"),resultado.getInt("edad"),resultado.getDate("fecNac"),resultado.getTimestamp("fecReg")));
            }

            sentenciaP.close();
            database.close();

            return personasM;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return personasM;
        
        /*
        Se creara un ArrayList para obtener a las personas JUVENILES que se registraran en una de las
        tablas que se crearon en una base de datos en PhpMyAdmin
        */
    }
    
    public static ArrayList<Persona> obtenerTodos3() {
        ArrayList<Persona> personasA = new ArrayList<Persona>();

        try {
            String query = "SELECT * FROM registroc;";
            PreparedStatement sentenciaP = database.open().prepareStatement(query);
            ResultSet resultado = sentenciaP.executeQuery();

            while (resultado.next()) {
                personasA.add(Persona.crear3(resultado.getInt("id"), resultado.getInt("doc"), resultado.getString("nom"),resultado.getString("ape"),resultado.getInt("edad"),resultado.getDate("fecNac"),resultado.getTimestamp("fecReg")));
            }

            sentenciaP.close();
            database.close();

            return personasA;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return personasA;
        /*
        Se creara un ArrayList para obtener a las personas ADULTAS que se registraran en una de las
        tablas que se crearon en una base de datos en PhpMyAdmin
        */
    }
    
    public static ArrayList <String> combo(){
        ArrayList<String> rec = new ArrayList<String>();
        try {
            String query = "SELECT * FROM registrotodos;";
            PreparedStatement sentenciaP = database.open().prepareStatement(query);
            ResultSet resultado = sentenciaP.executeQuery();
            while(resultado.next()){
                rec.add(resultado.getString("nom")+" "+resultado.getString("ape"));
            }
            sentenciaP.close();
            database.close();
            return rec;
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return rec;
    }
    
    public static int Comparar(int documento) {
        int b=0,b1=0;
        try {
            String query = "SELECT * FROM registrotodos WHERE doc = '"+documento+"';";
            PreparedStatement sentenciaP = database.open().prepareStatement(query);
            ResultSet resultado = sentenciaP.executeQuery();
            while (resultado.next()) {
                JOptionPane.showMessageDialog(null,"Documento ya registrado");
                b=1;
                Inicio.main(null);
                
            }
            
            sentenciaP.close();
            database.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return b;
    }
}