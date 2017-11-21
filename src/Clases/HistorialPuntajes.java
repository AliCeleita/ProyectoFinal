/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.Timestamp;

/**
 *
 * @author Brayan
 */
public class HistorialPuntajes {
    
    private String nombre;
    private int puntos,id;
    private Timestamp fecSeg;
    
    public HistorialPuntajes(int id,String nombre, int puntos, Timestamp fecSeg){
        this.id=id;
        this.nombre=nombre;
        this.puntos=puntos;
        this.fecSeg=fecSeg;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
    
    public Timestamp getFecSeg() {
        return fecSeg;
    }

    public void setFecSeg(Timestamp fecSeg) {
        this.fecSeg = fecSeg;
    }
    
    public static HistorialPuntajes crear(int id,String nombre,int puntos,Timestamp fecSeg) {
        return new HistorialPuntajes(id,nombre,puntos,fecSeg);
    }
}
