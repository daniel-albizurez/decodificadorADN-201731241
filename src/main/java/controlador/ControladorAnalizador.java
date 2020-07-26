/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.JOptionPane;
import modelo.Analizador;
import vista.JFrmAnalizador;

/**
 * Clase Controlador, intermediaria de la interaz gráfica y el objeto Analizador
 * @author DANIEL
 */
public class ControladorAnalizador implements ActionListener{
    
    private Analizador analizador = new Analizador();
    private JFrmAnalizador vista = new JFrmAnalizador();

    /**
     * Crea un nuevo objeto Controlador 
     * @param vista Recibe un JFrameAnalizador como parametro 
     */
    public ControladorAnalizador(JFrmAnalizador vista){
        this.vista = vista;
        //Se muestra la interfaz gráfica
        this.vista.setVisible(true);
        //Se establece el objeto (Controlador) encargado de manejar los eventos de 
        //la interfaz gráfica
        this.vista.jBtnAnalizar.addActionListener(this);
    }
    /**
     * Crea un nuevo objeto Controlador
     */
    public ControladorAnalizador() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese las cadenas a analizar (Presione la tecla ENTER "
                + "después de cada cadena)");
        System.out.println("El conjunto de bases adyacentes de mayor tamaño es: "
                + analizador.analizar(scanner.nextLine(), scanner.nextLine()));
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.jBtnAnalizar) {
            vista.jLblPatron.setText( "El patrón encontrado es: " + 
                    analizador.analizar(
                            vista.jTxtCadena1.getText(),
                            vista.jTxtCadena2.getText()));
            vista.jTxtCadena1.requestFocus();
        }
    }
    

        
        
}
