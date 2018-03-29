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
public class Articulo {
    private int codigo;
    private String titulo; 
    private String resumen;
    private String contenido; 

    public Articulo(int codigo, String titulo, String resumen, String contenido) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.resumen = resumen;
        this.contenido = contenido;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    
}

