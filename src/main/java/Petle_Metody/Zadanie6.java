package Petle_Metody;

import java.util.Scanner;
import static Petle_Metody.Sequence.*;

public class Zadanie6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj numer ciągu oraz liczbę wyrazów tego ciągu do wyświetlenia");
        System.out.println("1. ciąg liczb nieparzystych, 2. ciąg typu 100*k, 10*k, 3. ciąg Fibbonaciego");
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        switch (n){
            case(1):{
                firstSequence(k);
                break;
            }
            case(2):{
                secondSequence(k);
                break;
            }
            case(3):{
                System.out.print(n1 + ", " + n2);
                thirdSequence(k-2);
            }
        }

    }

}
