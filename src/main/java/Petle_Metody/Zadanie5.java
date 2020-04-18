package Petle_Metody;

import java.util.Scanner;
import static Petle_Metody.FigureDrawer.*;

public class Zadanie5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("podaj numer figury z listy oraz ilośc wierszy (np. dla X i 10 wierszy wpisz 4 10");
        System.out.println("1. pół choinki, 2. krzywa linia, 3. prostokąt, 4. X");
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        switch (n){
            case(1):{
                Tree(k);
            }
            case(2):{
                Slash(k);
            }
            case(3):{
                Square(k);
            }
            case(4):{
                X(k);
            }
        }

    }

}
