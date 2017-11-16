/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;

import java.sql.Date;
import java.sql.Timestamp;

/**
 *
 * @author AliCeleita
 */
public class Persona {

    
    private int doc,id;
    private int edad;
    private Timestamp fecSeg;
    private String nom;
    private String ape;
    private Date fecNac;

public Persona(int id,int doc,String nom,String ape,int edad,Date fecNac,Timestamp fecSeg){
        this.id=id;
        this.doc=doc;
        this.nom=nom;
        this.ape=ape;
        this.fecNac=fecNac;
        this.edad=edad;
        this.fecSeg=fecSeg; 
    }

    public int getDoc() {
        return doc;
    }
    
    public void setDoc(int doc) {
        this.doc = doc;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Timestamp getFecSeg() {
        return fecSeg;
    }

    public void setFecSeg(Timestamp fecSeg) {
        this.fecSeg = fecSeg;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getApe() {
        return ape;
    }

    public void setApe(String ape) {
        this.ape = ape;
    }

    public Date getFecNac() {
        return fecNac;
    }

    public void setFecNac(Date fecNac) {
        this.fecNac = fecNac;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public static Persona crear(int id,int doc,String nom,String ape,int edad,Date fecNac,Timestamp fecSeg) {
        return new Persona(id,doc,nom,ape,edad,fecNac,fecSeg);
    }
    static Persona crear2(int id,int doc,String nom,String ape,int edad,Date fecNac,Timestamp fecSeg) {
        return new Persona(id,doc,nom,ape,edad,fecNac,fecSeg);
    }

    static Persona crear3(int id,int doc,String nom,String ape,int edad,Date fecNac,Timestamp fecSeg) {
        return new Persona(id,doc,nom,ape,edad,fecNac,fecSeg);
    }
}

    

