/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasbasicas;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class EstructurasBasicas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sc = new Scanner(System.in);
        String mensajeFinal = "";
        String nombre = "";
        String apellido = "";
        String profesion = "";
        int contador = 1;
        int acum = 0; 
        
        // Uso de String.format para la acumulación de cadenas
        mensajeFinal = String.format("%s%s\n\n", mensajeFinal, 
                "Informe de la ciudad de Loja");
        
        mensajeFinal = String.format("%s%s\n\n", mensajeFinal, 
                "Listado de Personas");
        while (contador < 5){
            
            System.out.println("Ingrese sus nombres:");
            nombre = sc.nextLine();
            System.out.println("Ingrese sus apellidos");
            apellido = sc.nextLine();
            System.out.println("Ingrese su profesión");
            profesion = sc.nextLine();
            mensajeFinal = String.format("%sPersona %d: %s %s - %s\n", 
                    mensajeFinal, contador, nombre, apellido, profesion);
            
            //incrementar contador para salir del bucle
            contador++;
            
            acum = contador ;
        }
        System.out.printf("%s", mensajeFinal);
    }

}
