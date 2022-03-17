/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplo5;

import java.util.Scanner;

/**
 *
 * @author SebasTati
 */
public class Ejemplo {

    public static void main(String[] args) {

        int a, b, c;

        Scanner leer = new Scanner(System.in);

        System.out.print("a: ");
        a = leer.nextInt();

        System.out.print("b: ");
        b = leer.nextInt();

        System.out.print("c: ");
        c = leer.nextInt();

        if (a > 0 && b > 0 && c > 0) {

            if (a == b && b == c) {
                System.out.println("EQUILATERO");
            } else if (a != b && b != c && a != c) {
                System.out.println("ESCALENO");
            } else {
                System.out.println("ISOSCELE");
            }
        } else {
            System.out.println("ERROR");
        }

    }
}
