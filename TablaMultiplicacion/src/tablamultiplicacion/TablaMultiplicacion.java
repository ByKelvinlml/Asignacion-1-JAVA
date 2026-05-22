/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tablamultiplicacion;

import java.util.Scanner;

public class TablaMultiplicacion {
    public static void main(String[] args) {
      Scanner Multi = new Scanner(System.in);
      int resultado = 0;
        System.out.println("Ingrese cual tabla de multiplicacion desea: ");
        int a = Multi.nextInt();
                
                for (int j = 1; j <= 12; j++){
                    resultado = a * j;
                    System.out.println(a + " x " + j + " = " + resultado);
                }
    }
    
}
