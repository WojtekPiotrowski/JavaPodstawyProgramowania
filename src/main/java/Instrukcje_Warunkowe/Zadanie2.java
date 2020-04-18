package Instrukcje_Warunkowe;

import java.util.Scanner;

public class Zadanie2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("podaj 4 liczby całkowite");

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int tmp;

        if (a < b) {
            tmp = a;
            a = b;
            b = tmp;
        }
        if (c < d) {
            tmp = c;
            c = d;
            d = tmp;
        }
        if (a < c) {
            tmp = a;
            a = c;
            c = tmp;
        }
        if (b < d) {
            tmp = b;
            b = d;
            d = tmp;
        }
        if (b < c) {
            tmp = b;
            b = c;
            c = tmp;
        }

        System.out.println("podane liczby w kolejności malejącej to " +a +" "+b +" " +c +" " +d);

    }

}
