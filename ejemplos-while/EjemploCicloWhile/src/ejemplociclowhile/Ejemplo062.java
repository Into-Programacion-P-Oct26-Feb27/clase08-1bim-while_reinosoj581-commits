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
public class Ejemplo062 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        boolean bandera = true;

        while (bandera == true) { //true == true 
            System.out.println("Estoy en ciclo"); //Estoy en el ciclo 

            String salir;
            System.out.println("Desea salir del ciclo, ingrese si.");
            salir = entrada.nextLine(); //100
            if (salir.equals("si")) {
                bandera = false;
            }
        }
    }
}
/*
Hicimos un ciclo repetivio, mientras el usuario ponga 100 el ciclo se va a
repetir varias veces, cuando usuario ponga -100 salga de ciclo 
*/
