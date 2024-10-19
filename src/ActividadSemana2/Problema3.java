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
public class Problema3 {
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        System.out.println("CALCULAR EL AREA Y EL PERIMETRO");
        double Area;
        double Perimetro;

        System.out.println("Ingrese la base:");
        double base = lea.nextDouble();

        System.out.println("Ingrese la Altura");
        double altura = lea.nextDouble();

        Area = (base * altura);
        Perimetro = 2 * (base + altura);

        System.out.println("----------------------------------------");
        System.out.println("Su Area es: " + Area);
        System.out.println("Su Perimetro es: " + Perimetro);
    }
}
