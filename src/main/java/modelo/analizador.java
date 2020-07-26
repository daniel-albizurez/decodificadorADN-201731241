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
    //Las cadenas que serán evaluadas por los métodos
    String menor;
    String mayor;
    /**
     * Método para almacenar las cadenas ingresadads por el usuario
     * @param cadena1
     * @param cadena2 
     */
    public void setCadenas(String cadena1, String cadena2){
        if (cadena1.length() > cadena2.length()) {
            mayor = cadena1;
            menor = cadena2;
        } else {
            menor = cadena1;
            mayor = cadena2;
        }
    }
    /**
     * Método para encontrar la subcadena más larga en común a dos cadenas ingresadas
     * @return la subcadena encontrada
     */
    public String analizar(){
        //Varibales de tipo entero que sirven como contadores para controlar los caracteres que se están evaluando
        int inicio = 0;
        int fin = 2;
        //Variable para almacenar temporalmente la sub cadena que se está evaluando
        String subPatron;
        //Variable para almacenar la sub cadena más grande y común a ambas cadenas ingresadas
        String patron = "";
        //Mientras el contador fin sea menor al tamaño de la cadena más pequeña
        while (fin<=menor.length()) {
            //Se toma la sub cadena de la cadena más pequeña, partiendo de inicio hasta fin
            subPatron = menor.substring(inicio, fin);
            if (mayor.contains(subPatron)) {
                /**
                 * Si la subcadena encontrada está contenida en la cadena más grande
                 * se incrementa el contador fin
                 * y si la subcadena es más grande que la anterior subcadena almacenada
                 * en la variable patrón se sustituye el valor anterior 
                 * en la variable patrón por el nuevo valor
                **/
                if (subPatron.length()> patron.length()) patron = subPatron;
                fin++;
            } else {
                /**
                 * De lo contrario se incrementa la variable inicio
                 * y se establece el contador fin como 2 unidades mayor a 
                 * a inicio (Ya que se buscan subcadenas mayores a 1 caracter)
                 **/
                inicio++;
                fin = inicio + 2;
            }
        }
        return patron;
    }
    /**
     * Método para encontrar la subcadena más larga en común a dos cadenas ingresadas
     * @param cadena1 Una cadena de texto
     * @param cadena2 Una cadena de texto
     * @return la subcadena encontrada
     */
    public String analizar(String cadena1, String cadena2){
        setCadenas(cadena1, cadena2);
        return analizar();
    }
}
