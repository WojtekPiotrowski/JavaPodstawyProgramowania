package Petle_Metody;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Zadanie4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        switch (n) {
            case(1): {
                Point1();
                break;
            }
            case(2): {
                Point2();
                break;
            }
            case(3): {
                Point3();
                break;
            }
            case(4): {
                Point4();
                break;
            }
            case(5): {
                Point5();
                break;
            }
            case(6): {
                Point6();
                break;
            }
        }
    }

    public static void Point1(){
        System.out.println(Arrays.toString(IntStream.range(5, 101).toArray()));
    }

    public static void Point2(){
        System.out.println(Arrays.toString(IntStream.range(55, 151).toArray()));
    }

    public static void Point3(){
        for (int i = 100;i>0;i--) {
            System.out.println(i);
        }
    }

    public static void Point4() {
        for (int i = 2;i<=100;i+=2){
            System.out.println(i);
        }
    }

    public static void Point5() {
        for (int i = 7;i<50;i+=7){
            System.out.println(i);
        }
    }

    public static void Point6(){
        System.out.println((IntStream.range(1, 413).sum()));
    }
    }


