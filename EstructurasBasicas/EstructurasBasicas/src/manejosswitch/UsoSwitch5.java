/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejosswitch;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class UsoSwitch5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /***
     * Desarrollar una aplicación que me permita ingresar placas de carros, se
     * asume que las placas ingresadas pertenecen a la región costa del Ecuador
     * en base a la placa, nuestro programa determinará y presentará la placa con
     * la provincia a la que pertenece
     */
        Scanner sc = new Scanner(System.in);
        String placa = "";
        
        System.out.println("Por favor ingrese la placa a determinar:");
        placa = sc.nextLine();
      
        char valor = placa.charAt(0);
                
        switch(valor){
            case 'o':
            case'O':
                System.out.printf("Placa %s perteneciente a: El Oro\n", 
                        placa);
                break;
            case 'g':
            case'G':
                System.out.printf("Placa %s perteneciente a: Guayas\n", 
                        placa);
                break;
            case 'r':
            case'R':
                System.out.printf("Placa %s perteneciente a: Los Ríos\n", 
                        placa);
                break;
            case 'm':
            case'M':
                System.out.printf("Placa %s perteneciente a: Manabí\n", 
                        placa);
                break;
            case 'y':
            case'Y':
                System.out.printf("Placa %s perteneciente a: Santa Elena\n", 
                        placa);
                break;
            case 'e':
            case'E':
                System.out.printf("Placa %s perteneciente a: Esmeraldas\n", 
                        placa);
                break;
            case 'j':
            case'J':
                System.out.printf("Placa %s perteneciente a: Sto. Domingo de los"
                        + " Tsáchilas\n", 
                        placa);
                break;
    
            default:
                System.out.println("Su placa no es de la costa");
                
        }
        
    }
    
}
