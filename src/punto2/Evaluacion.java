/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto2;

/**
 *
 * @author Daniel
 */
public class Evaluacion {
    private double calificion;
    private String aportes; 
    private String comentarios; 

    public Evaluacion(double calificion, String aportes, String comentarios) {
        this.calificion = calificion;
        this.aportes = aportes;
        this.comentarios = comentarios;
    }

    public double getCalificion() {
        return calificion;
    }

    public void setCalificion(double calificion) {
        this.calificion = calificion;
    }

    public String getAportes() {
        return aportes;
    }

    public void setAportes(String aportes) {
        this.aportes = aportes;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }
    
    
}
