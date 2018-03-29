/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class Docente {
    
    private String nombre;
    private String apellido;
    private int codigo;
    private ArrayList<Evaluacion> evaluado;

    public Docente(String nombre, String apellido, int codigo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigo = codigo;
        this.evaluado = new ArrayList();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public Evaluacion evaluar (Articulo articulo,double calificacion, String aportes, String comentarios){
        
        Evaluacion evaluacion1 = new Evaluacion(calificacion, aportes, comentarios);
        this.evaluado.add(evaluacion1);
        return evaluacion1;    
    }
    public double promediorevisados (){
        double promedo = 0.0;
        for (Evaluacion evaluacion : evaluado) {
            promedo += evaluacion.getCalificion();
        }
        promedo /= evaluado.size();
        return promedo;
    }
    
}
