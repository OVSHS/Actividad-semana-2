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
public class Problema4 {
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        System.out.println("PARTIDOS");
        int partidoG;
        int partidoE;
        int partidoP;
        int puntostotales;

        System.out.println("Ingrese el numero de partidos ganados: ");
        int partidosganados = lea.nextInt();

        System.out.println("Ingrese el numero de partidos empatados");
        int partidoempatados = lea.nextInt();

        System.out.println("Ingrese el numero de partidos perdidos:");
        int partidoperdido = lea.nextInt();

        partidoG = partidosganados * 3;
        partidoE = partidoempatados * 1;
        partidoP = partidoperdido * 0;

        puntostotales = partidoG + partidoE + partidoP;

        System.out.println("El quipo ganador tiene: " + puntostotales + " Puntos");
    }
}
