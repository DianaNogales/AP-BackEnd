/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.mgb.Dto;

import jakarta.validation.constraints.NotBlank;


public class dtoExperiencia {
    @NotBlank
    private String nombrE;
    @NotBlank
    private String descripcionE;
    @NotBlank
    private String titlE;
    @NotBlank
    private String typE;
    @NotBlank
    private String datE;
    
    public String getNombrE;
    
    //contructor

    public dtoExperiencia() {
    }

    public dtoExperiencia(String nombrE, String descripcionE, String titlE, String typE, String datE) {
        this.nombrE = nombrE;
        this.descripcionE = descripcionE;
        this.titlE = titlE;
        this.typE = typE;
        this.datE = datE;
    }

    public String getNombrE() {
        return nombrE;
    }

    public void setNombrE(String nombrE) {
        this.nombrE = nombrE;
    }

    public String getDescripcionE() {
        return descripcionE;
    }
    public void setTitlE(String titlE) {
        this.titlE = titlE;
    }
    public String getTitlE() {
        return titlE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
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
