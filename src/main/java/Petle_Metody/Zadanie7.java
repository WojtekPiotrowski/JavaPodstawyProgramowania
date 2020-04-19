package Petle_Metody;

import java.util.Arrays;

public class Zadanie7 {

    public static void main(String[] args) {

        int n = 5, max=10;
        int[] tab1 = ArrayOperations.randomArray(n, max);
        int[] tab2 = ArrayOperations.randomArray(n, max);

        System.out.println(Arrays.toString(tab1));
        System.out.println(Arrays.toString(tab2));
        System.out.println("Największa liczba macierzy to " + ArrayOperations.biggest(tab1));
        System.out.println("Suma elementów macierzy to " + ArrayOperations.sumOfArray(tab1));
        System.out.println("Srednia arytmetyczna elementów macierzy to " + ArrayOperations.average(tab1));
        System.out.println("Macierz po zamianie dwóch elementów " + Arrays.toString(ArrayOperations.swap(1, 4, tab1)));
        System.out.println("Macierz o większej sumie elementów " + Arrays.toString(ArrayOperations.getLarger(tab1, tab2)));
        System.out.println("Nową tablica zawierająca wszystkie elementy obu tablic " + Arrays.toString(ArrayOperations.merge(tab1,tab2)));

    }

}
