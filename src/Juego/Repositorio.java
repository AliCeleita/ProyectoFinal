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
import Database.DBManager;
import java.util.ArrayList;

public class Repositorio {
	
    private static DBManager database = new DBManager();
    static Statement sentencia;
    static ResultSet resultado;
    
    public static void crear (Persona persona) {
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

    }
    
    public static ArrayList<Persona> obtenerTodos() {
        ArrayList<Persona> personas = new ArrayList<Persona>();

        try {
            String query = "SELECT * FROM registro;";
            PreparedStatement sentenciaP = database.open().prepareStatement(query);
            ResultSet resultado = sentenciaP.executeQuery();

            while (resultado.next()) {
                personas.add(Persona.crear(resultado.getInt("id"), resultado.getInt("doc"), resultado.getString("nom"),resultado.getString("ape"),resultado.getInt("edad"),resultado.getDate("fecNac"),resultado.getTimestamp("fecReg")));
            }

            sentenciaP.close();
            database.close();

            return personas;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return personas;
    }
}