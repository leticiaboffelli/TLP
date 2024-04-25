/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package velezboffellibustos;

import static java.time.Clock.system;
import java.util.Scanner;

/**
 *
 * @author PC 02 GPB
 */
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado= new Scanner (System.in);
        int base, altura, area;
        System.out.println("Ingrese la base del rectangulo");
        base= teclado.nextInt();
        System.out.println("Ingrese la altura del rectangulo");
        altura= teclado.nextInt();
        area=base*altura;
        System.out.println("El area del rectangulo es " +area);
        
    }
    
}
