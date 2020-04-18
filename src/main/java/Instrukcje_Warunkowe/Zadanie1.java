package Instrukcje_Warunkowe;

import java.util.Scanner;

public class Zadanie1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("podaj 4 liczby całkowite");

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int max;

        if (a >= b && a >= c && a >= d){
            max = a;
        }
        else if (b >= c && b >= d){
            max = b;
        }
        else if (c >= d){
            max = c;
        }
        else {
            max = d;
        }

        System.out.println("podane liczby to " +a +" "+b +" " +c +" " +d);
        System.out.println("Największa liczba to " + max);

    }

}
