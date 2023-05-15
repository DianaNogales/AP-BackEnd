/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.mgb.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 *
 * @author samab
 */
@Entity
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreE;
    private String descripcionE;
    private String titlE;
    private String typE;
    private String datE;
    
    //contructores

    public Experiencia() {
    }

    public Experiencia(String nombrE, String descripcionE, String titlE, String typE, String datE) {
        this.nombreE = nombrE;
        this.descripcionE = descripcionE;
        this.titlE = titlE;
        this.typE = typE;
        this.datE = datE;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombrE() {
        return nombreE;
    }

    public void setNombrE(String nombrE) {
        this.nombreE = nombrE;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }
    
    public String getTitlE() {
        return titlE;
    }

    public void setTitlE(String titlE) {
        this.titlE = titlE;
    }
    
    public String getTypE() {
        return typE;
    }
    public void setTypE(String typE) {
        this.typE = typE;
    }
    
    public String getDatE() {
        return datE;
    }
    public void setDatE(String datE) {
        this.datE = datE;
    }
}
