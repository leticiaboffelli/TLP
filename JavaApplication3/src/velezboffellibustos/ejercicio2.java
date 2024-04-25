/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package velezboffellibustos;

import java.util.Scanner;

/**
 *
 * @author PC 02 GPB
 */
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado= new Scanner (System.in);
        int num, num2, suma;
        System.out.println("Ingrese el primer numero");
        num= teclado.nextInt();
        System.out.println("Ingrese el segundo numero");
        num2= teclado.nextInt();
        suma= num+num2;
        System.out.println("La suma de los dos numeros que ingreso es " +suma);
        
        
    }
    
}
