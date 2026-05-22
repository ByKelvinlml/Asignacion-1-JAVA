/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operacionesmatematicas;

import java.util.Scanner;

public class OperacionesMatematicas {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        int d = 0;
                
        System.out.println("Valor de a: ");
        int a = keyboard.nextInt();
        System.out.println("Valor de b: ");
        int b = keyboard.nextInt();
        
        System.out.println("Presione para elegir la operacion a realizar: "
                + "\n1. para la suma. \n2. para resta. "
                + "\n3. para division. \n4. para multiplicacion.\n");
        
        int c = keyboard.nextInt();
        
        switch (c){
            case 1:
                c = 1;
                d = (a + b);
                System.out.println("El resultado de la suma es: " 
                + d);
                break;
            case 2:
                c = 2;
                d = (a - b);
                System.out.println("El resultado de la resta es: " 
                + d);
                break;
            case 3:
                c = 3;
                d = (a / b);
                System.out.println("El resultado de la division es: " 
                + d);
                break;
            case 4:
                c = 4;
                d = (a * b);
                System.out.println("El resultado de la multiplicacion es: " 
                + d);
                break;
            default:
                System.out.println("Operacion invalida.");
                
        }
        
        
        
    }
    
}
