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
public class ControladorAnalizador {
    
        private Analizador analizador = new Analizador();

    public ControladorAnalizador() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese las cadenas a analizar (Presione la tecla ENTER "
                + "después de cada cadena)");
        System.out.println("El conjunto de bases adyacentes de mayor tamaño es: "
                + analizador.analizar(scanner.nextLine(), scanner.nextLine()));
    }
    
    

        
        
}
