/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ActividadSemana2;

import java.util.Scanner;

/**
 *
 * @author TYT
 */
public class Problema2 {
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        System.out.print("Ingrese la calificacion del primer parcial: ");
        double parcial1 = lea.nextDouble();

        System.out.print("Ingrese la calificacion del segundo parcial: ");
        double parcial2 = lea.nextDouble();

        System.out.print("Ingrese la calificacion del tercer parcial: ");
        double parcial3 = lea.nextDouble();

        double promedioParciales = (parcial1 + parcial2 + parcial3) / 3;

        System.out.print("Ingrese la calificacion del examen final: ");
        double examenFinal = lea.nextDouble();

        System.out.print("Ingrese la calificacion del trabajo final: ");
        double trabajoFinal = lea.nextDouble();

        double calificacionFinal = (promedioParciales * 0.55) + (examenFinal * 0.30) + (trabajoFinal * 0.15);

        System.out.println("La calificacion final es: " + calificacionFinal);
    }
}
