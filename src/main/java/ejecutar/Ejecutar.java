/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejecutar;

import modelo.Analizador;

/**
 *
 * @author DANIEL
 */
public class Ejecutar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Analizador analizador = new Analizador();
        analizador.setCadenas("ctgggccttgaggaaaactg", "gtaccagtactgatagt ");
        System.out.println(analizador.analizar());
    }
    
}
