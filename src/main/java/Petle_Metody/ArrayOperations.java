package Petle_Metody;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class ArrayOperations {

    public static int[] randomArray(int n, int max){

        Random rand = new Random();

        return IntStream.iterate(0, i -> rand.nextInt(max+1))
                .limit(n)
                .toArray();
    }

    public static Integer biggest(int... tab){

        if (tab.length == 0){
            return null;
        }
        else {
            return IntStream.of(tab)
                    .max()
                    .getAsInt();
        }
    }

    public static Integer sumOfArray(int... tab) {

        if (tab.length == 0) {
            return null;
        }
        else {
            return IntStream.of(tab).sum();
        }
    }

    public static Double average(int... tab) {
        if (tab.length == 0) {
            return null;
        }
        else {
            return ArrayOperations.sumOfArray(tab) / (double) tab.length;
        }
    }

    public static int[] swap(int n1, int n2, int... tab) {
        int[] tab1 = tab.clone();
        switch (tab1.length){
            case(0):{
                return null;
            }
            case(1):{
                return tab1;
            }
            default:{
                if (n1 < tab.length && n1 >= 0 && n2 < tab.length && n2 >= 0){
                    int tmp = tab1[n1];
                    tab1[n1] = tab1[n2];
                    tab1[n2] = tmp;
                }
                else{
                    System.out.println("at least one index out of array bounds");
                }
                return tab1;
            }

        }
    }

    public static int[] getLarger(int[] tab1, int... tab2){
        if (tab1.length == 0) {
            return null;
        }
        else if (tab2.length == 0) {
            return tab1;
        }

        if (ArrayOperations.sumOfArray(tab1) > ArrayOperations.sumOfArray(tab2)){
            return tab1;
        }
        else if (ArrayOperations.sumOfArray(tab2) > ArrayOperations.sumOfArray(tab1)){
            return tab2;
        }
        else{
            //Sumy obu tablic są jednakowe, zwrócona zostaje losowa
            Random rand = new Random();
            int [][] tab = {tab1, tab2};
            return tab[rand.nextInt(2)];
        }
    }

    public static int[] merge(int[] tab1, int... tab2){
        int len = tab1.length + tab2.length;
        int[] tmp = new int[len];
        System.arraycopy(tab1, 0, tmp, 0, tab1.length);
        System.arraycopy(tab2, 0, tmp, tab1.length, tab2.length);
        return tmp;
    }
}
