package Petle_Metody;

public class Sequence {

    public static void firstSequence (int n){
        for (int i=0;i<n;i++){
            if (i==0){
                System.out.print(1);
            }
            else{
                System.out.print(", " + (1 + (2 * i)));
            }
        }
    }

    public static void secondSequence (int n){
        for (int i=0;i<n;i++){
            if (i==0){
                System.out.print(100 + ", " + 10);
            }
            else{
                System.out.print(", " + 100*(i+1) + ", " + 10*(i+1));
            }
        }
    }
    static int n1=1,n2=1,n3=0;
    public static void thirdSequence (int n){
        if (n>0){
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(", " + n3);
            thirdSequence(n-1);
        }
    }

}
