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
public class Punto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Docente docente1 = new Docente("Mario", "Navidad", 12);
        Docente docente2 = new Docente("Sonia", "Jerez", 13);
        Articulo art1 = new Articulo(01, "Art1", "lalala", "didedede");
        Articulo art2 = new Articulo(02, "Art2", "lololo", "dadadada");
        docente1.evaluar(art2, 3.2, "lalala", "lalalalalala");
        docente1.evaluar(art1, 3.4, "lololo", "relololo");
        docente2.evaluar(art1, 5.0, "lalala", "lalala");
        docente2.evaluar(art2, 4.5, "lalala", "lalala");
        System.out.println("Promedio articulos cientificos revisados docente 1: "+docente1.promediorevisados());
        System.out.println("Promedio articulos cientificos revisados docente 2: "+docente2.promediorevisados());
       
        
    }
    
}
