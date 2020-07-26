/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.Scanner;
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
        Scanner scanner = new Scanner(System.in);
        Analizador analizador = new Analizador();
        System.out.println("Ingrese las cadenas a analizar (Presionando enter después de cada cadena)");
        System.out.println("El conjunto de bases adyacentes de mayor tamaño es: "
                + analizador.analizar(scanner.nextLine(), scanner.nextLine()));
    }
    
}
