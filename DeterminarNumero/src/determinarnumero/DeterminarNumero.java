/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package determinarnumero;

import java.util.Scanner;

public class DeterminarNumero {
    public static void main(String[] args) {
     Scanner determinar = new Scanner(System.in);
     
        System.out.print("Ingrese el numero: ");
        int a = determinar.nextInt();
        
        if(a % 2 ==0) {
            System.out.println("El numero " + a + " es par.");
        }
        else {
            System.out.println("El numero " + a + " es impar");
        }
    }
    
}
