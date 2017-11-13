/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author AliCeleita
 */
public class Persona {
    private int doc,id;
    private int edad;
    private LocalDateTime fecSeg;
    private String nom;
    private String ape;
    private LocalDate fecNac;

public Persona(int id,int doc,String nom,String ape,LocalDate fecNac,int edad,LocalDateTime fecSeg){
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

    public LocalDateTime getFecSeg() {
        return fecSeg;
    }

    public void setFecSeg(LocalDateTime fecSeg) {
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

    public LocalDate getFecNac() {
        return fecNac;
    }

    public void setFecNac(LocalDate fecNac) {
        this.fecNac = fecNac;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public static Persona crear(int id,int doc,String nom,String ape,LocalDate fecNac,int edad,LocalDateTime fecSeg) {
        return new Persona(id,doc,nom,ape,fecNac,edad,fecSeg);
    }
}

    

