/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.Scanner;
import modelo.Analizador;

/**
 * Clase Controlador, intermediaria entre la clase main y el objeto Analizador
 * @author DANIEL
 */
public class ControladorAnalizador{
    
    private Analizador analizador = new Analizador();

    /**
     * Crea un nuevo objeto Controlador
     */
    public ControladorAnalizador() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese las cadenas a analizar (Presione la tecla ENTER "
                + "después de cada cadena)");
        System.out.println(analizador.analizar(scanner.nextLine(), scanner.nextLine()));
    }
    
 
        
}
