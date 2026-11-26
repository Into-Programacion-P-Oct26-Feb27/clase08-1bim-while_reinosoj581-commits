/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplociclowhile;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALASC
 */
public class Ejemplo061 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        boolean bandera = true;

        while (bandera == true) { //true == true 
            System.out.println("Estoy en ciclo"); //Estoy en el ciclo 

            int salir;
            System.out.println("Desea salir del ciclo, ingrese -100.");
            salir = entrada.nextInt(); //100
            if (salir == -100) { // -100 == -100
                bandera = false;
            }
        }
    }
}
