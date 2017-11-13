/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import Database.DBManager;

public class Repositorio {
	
    private static DBManager database = new DBManager();
    static Statement sentencia;
    static ResultSet resultado;
    
    public static void crear (Persona persona) {
        try {
            String query = "INSERT INTO personas (doc, nom, ape,fecNac,edad,fecReg) VALUES (?, ?, ?, ?, ?, ?);";
            PreparedStatement sentenciaP = database.open().prepareStatement(query);
            sentenciaP.setInt(1,persona.getDoc());
            sentenciaP.setString(2, persona.getNom());
            sentenciaP.setString(3, persona.getApe());
            sentenciaP.setDate(4, (java.sql.Date) Date.from(persona.getFecNac().atStartOfDay(ZoneId.systemDefault()).toInstant()));
            sentenciaP.setString(5, String.valueOf(persona.getEdad()));
            sentenciaP.setDate(6,(java.sql.Date)Date.from(persona.getFecSeg().atZone(ZoneId.systemDefault()).toInstant()));
            sentenciaP.executeUpdate();
            sentenciaP.close();
            database.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }



   /* public static Persona obtener(int id) {
        try {
            String query = "SELECT * FROM personas WHERE id = ?;";
            PreparedStatement sentenciaP = database.open().prepareStatement(query);
            sentenciaP.setInt(1, id);

            ResultSet resultado = sentenciaP.executeQuery();

            sentenciaP.close();
            database.close();

            while (resultado.next()) {
                return Persona.crear(resultado.getInt("id"),resultado.getInt("documento"), resultado.getString("nombre"),resultado.getString("ape"),resultado.getDate("fecNac"),resultado.getInt("edad"),resultado.getString("cargo"),resultado.getDate("fecReg"));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return null;
    }
    
    
    public static Persona buscar(String documento) {
        try {
            String query = "SELECT * FROM personas WHERE documento = ?;";
            PreparedStatement sentenciaP = database.open().prepareStatement(query);
            sentenciaP.setString(1, documento);

            ResultSet resultado = sentenciaP.executeQuery();

            while (resultado.next()) {
                return Persona.crear(resultado.getInt("ide"), Integer.parseInt(resultado.getString("documento")), resultado.getString("nombre"),resultado.getString("apellido"),Integer.parseInt(resultado.getString("edad")), resultado.getString("fecha"),resultado.getString("tipo"),resultado.getString("fechaSeguridad"));
            }
            
            sentenciaP.close();
            database.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return null;
    }

    public static ArrayList<Persona> obtenerTodos() {
        ArrayList<Persona> personas = new ArrayList<Persona>();

        try {
            String query = "SELECT * FROM personas;";
            PreparedStatement sentenciaP = database.open().prepareStatement(query);
            ResultSet resultado = sentenciaP.executeQuery();

            while (resultado.next()) {
                personas.add(Persona.crear(resultado.getInt("ide"), Integer.parseInt(resultado.getString("documento")), resultado.getString("nombre"),resultado.getString("apellido"),Integer.parseInt(resultado.getString("edad")), resultado.getString("fecha"),resultado.getString("tipo"),resultado.getString("fechaSeguridad")));
            }

            sentenciaP.close();
            database.close();

            return personas;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return personas;
    }
    public static ArrayList<Evento> obtenerTodos1() {
        ArrayList<Evento> evento = new ArrayList<Evento>();

        try {
            String query = "SELECT * FROM evento;";
            PreparedStatement sentenciaP = database.open().prepareStatement(query);
            ResultSet result = sentenciaP.executeQuery();

            while (result.next()) {
                evento.add(Evento.crear(result.getInt("id"),result.getString("fechaEvento"),result.getString("horaInicio"),result.getString("horaFin"), result.getString("nombreEvento"),result.getString("descripcion"),Integer.parseInt(result.getString("recreador")),result.getString("fechaSeg")));
            }

            sentenciaP.close();
            database.close();

            return evento;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return evento;
    }*/
}

