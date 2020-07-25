/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author DANIEL
 */
public class analizador {
    String cadena1;
    String cadena2;

    public analizador(String cadena1, String cadena2) {
        this.cadena1 = cadena1;
        this.cadena2 = cadena2;
    }

    public analizador() {
    }

    public String analizar(){
        String patron = "";
        
        return patron;
    }
    
    public String getCadena1() {
        return cadena1;
    }
    public void setCadena1(String cadena1) {
        this.cadena1 = cadena1;
    }

    public String getCadena2() {
        return cadena2;
    }
    public void setCadena2(String cadena2) {
        this.cadena2 = cadena2;
    }
    
    
}
