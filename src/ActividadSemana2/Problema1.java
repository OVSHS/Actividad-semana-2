/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ActividadSemana2;

import java.util.Scanner;

/**
 *
 * @author TYT
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
          Scanner lea=new Scanner(System.in);
          
          double Celcius;
          System.out.println("Ingrese el numero a convertir(Se convertira de Fahrenheit a Celcius):");
          double Fahrenheit = lea.nextInt();
          
          Celcius = (Fahrenheit-32)*5/9;
          
          System.out.println("Su conversion da: "+ Celcius);
          
          
        
    }
}
