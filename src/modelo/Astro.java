/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.swing.ImageIcon;

/**
 *
 * @author camilortte
 */
public class Astro {
    
    private String nombre;
    private String id;
    private double masa;
    private double volumen;
    private double densidad;
    private double area;
    private double radio;
    private double gravedad;
    private double velocidad_escape;
    private double periodo_de_rotacion;
    private double presion;
    private ImageIcon fot;

    
    public Astro(String nombre,String id,double masa,double volumen,
            double densidad,double area,double radio,double gravedad,
            double velocidad_escape,double perido_rotacion,double presion){
        this.nombre=nombre;
        this.id=id;
        this.masa =masa;
        this.volumen =volumen;
        this.densidad =densidad;
        this.area =area;
        this.radio=radio;
        this.gravedad =gravedad;
        this.velocidad_escape =velocidad_escape;
        this.periodo_de_rotacion =periodo_de_rotacion;
        this.presion =presion;
    }
    
    public Astro(){
        this.nombre="";
        this.id="";
        this.masa =0.0;
        this.volumen =0.0;
        this.densidad =0.0;
        this.area =0.0;
        this. radio=0.0;
        this.gravedad =0.0;
        this.velocidad_escape =0.0;
        this.periodo_de_rotacion =0.0;
        this.presion =0.0;
    }
    
    public String getNombre() {
        return nombre;       
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getMasa() {
        return masa;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public double getDensidad() {
        return densidad;
    }

    public void setDensidad(double densidad) {
        this.densidad = densidad;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getGravedad() {
        return gravedad;
    }

    public void setGravedad(double gravedad) {
        this.gravedad = gravedad;
    }

    public double getVelocidad_escape() {
        return velocidad_escape;
    }

    public void setVelocidad_escape(double velocidad_escape) {
        this.velocidad_escape = velocidad_escape;
    }

    public double getPeriodo_de_rotacion() {
        return periodo_de_rotacion;
    }

    public void setPeriodo_de_rotacion(double periodo_de_rotacion) {
        this.periodo_de_rotacion = periodo_de_rotacion;
    }

    public double getPresion() {
        return presion;
    }

    public void setPresion(double presion) {
        this.presion = presion;
    }
    
    
    
    
    
}
