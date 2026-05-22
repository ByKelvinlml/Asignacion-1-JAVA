/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comparacionnumeros;

import java.util.Scanner;
public class ComparacionNumeros {
    public static void main(String[] args) {
       Scanner comp = new Scanner(System.in);
       int a;
       int b;
       
        System.out.print("Ingrese el primer numero: ");
        a = comp.nextInt();
        
        System.out.print("Ingrese el segundo numero: ");
        b = comp.nextInt();
        
        if( a > b){

            System.out.println("El numero mayor es: " + a);
            System.out.println("El numero menor es: " + b);

        } else if (b > a) {

            System.out.println("El numero mayor es: " + b);
            System.out.println("El numero menor es: " + a);

        } else {

            System.out.println("Los numeros son iguales");

        }
    }
    
}
