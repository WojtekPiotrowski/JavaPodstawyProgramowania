package Petle_Metody;

import java.lang.reflect.Array;

public class FigureDrawer {

    public static void Tree (int n){
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void Slash (int n){
        for (int i=1;i<=n;i++){
            for (int j=1;j<i;j++){
                System.out.print(" ");
            }
            System.out.println("*");
        }
    }

    public static void Square (int n){
        for (int i=1;i<=n;i++){
            if (i==1||i==n){
                for (int j=0;j<n;j++){
                    System.out.print("*");
                }
            }
            else{
                for (int j=1;j<=n;j++){
                    if (j==1||j==n) {
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }

    public static void X (int n){
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (j==i || j==n-i-1) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
