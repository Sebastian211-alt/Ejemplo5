/*

 Un triángulo es equilátero, si posee sus tres lados iguales, es isósceles si tiene solamente
 dos lados iguales y es escaleno cuando todos sus lados son desiguales. Escriba un
 programa que lea las dimensiones de los lados de un triángulo, y presente como salida
 el mensaje de la clasificación del triángulo
 
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
