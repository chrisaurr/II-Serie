/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.serie2;

/**
 *
 * @author Chris
 */
public class Alumno {

    /**
     * @return the codEstudiante
     */
    public String getCodEstudiante() {
        return codEstudiante;
    }

    /**
     * @param codEstudiante the codEstudiante to set
     */
    public void setCodEstudiante(String codEstudiante) {
        this.codEstudiante = codEstudiante;
    }

    /**
     * @return the primerNombre
     */
    public String getPrimerNombre() {
        return primerNombre;
    }

    /**
     * @param primerNombre the primerNombre to set
     */
    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    /**
     * @return the segundoNombre
     */
    public String getSegundoNombre() {
        return segundoNombre;
    }

    /**
     * @param segundoNombre the segundoNombre to set
     */
    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    /**
     * @return the primerApellido
     */
    public String getPrimerApellido() {
        return primerApellido;
    }

    /**
     * @param primerApellido the primerApellido to set
     */
    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    /**
     * @return the segundoApellido
     */
    public String getSegundoApellido() {
        return segundoApellido;
    }

    /**
     * @param segundoApellido the segundoApellido to set
     */
    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    /**
     * @return the facultad
     */
    public String getFacultad() {
        return facultad;
    }

    /**
     * @param facultad the facultad to set
     */
    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    /**
     * @return the prom
     */
    public float getProm() {
        return prom;
    }

    /**
     * @param prom the prom to set
     */
    public void setProm(float prom) {
        this.prom = prom;
    }

    public Alumno(String codEstudiante, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, String facultad, float prom) {
        this.codEstudiante = codEstudiante;
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.facultad = facultad;
        this.prom = prom;
    }

    public Alumno() {
    }
    
    private String codEstudiante;
    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private String facultad;
    private float prom;

    @Override
    public String toString() {
        return "Alumno{" + "codEstudiante=" + codEstudiante + ", primerNombre=" + primerNombre + ", segundoNombre=" + segundoNombre + ", primerApellido=" + primerApellido + ", segundoApellido=" + segundoApellido + ", facultad=" + facultad + ", prom=" + prom + '}';
    }
    
    
}
