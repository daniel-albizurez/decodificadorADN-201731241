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
public class Analizador {
    String menor;
    String mayor;
    
    public void setCadenas(String cadena1, String cadena2){
        if (cadena1.length() > cadena2.length()) {
            mayor = cadena1;
            menor = cadena2;
        } else {
            menor = cadena1;
            mayor = cadena2;
        }
    }
    
    public String analizar(){
        int inicio = 0;
        int fin = 2;
        int patronActual = 0;
        
        String[] patrones;
        String subPatron;
        String patron = "";
        
        boolean existe;
        
        if (menor.length()%2 == 1) {
            patrones = new String[menor.length() + 1/2];
        } else {
            patrones = new String[menor.length()/2];
        }
        
        while (fin<=menor.length()) {
            subPatron = menor.substring(inicio, fin);
            if (mayor.contains(subPatron)) {
                patron = subPatron;
                fin++;
            } else {
                if (patron.length()>1) {
                    existe = false;
                    for (int i = 0; i < patrones.length & patrones[i] != null; i++) {
                        existe |= patrones[i].equals(patron);
                    }
                    if (!existe) {
                        patrones[patronActual] = patron;
                        patronActual++;
                    }
                }
                inicio++;
                fin = inicio + 2;
            }
        }
        patrones[patronActual] = patron;
        patron = "";
        for (int i = 0; i < patrones.length; i++) {
            if (patrones[i] != null && patrones[i].length()>patron.length()) {
                patron = patrones[i];
            }
        }
        return patron;
    }
    
}
