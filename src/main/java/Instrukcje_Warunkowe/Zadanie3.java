package Instrukcje_Warunkowe;

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.Math.*;

public class Zadanie3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] tab = {"1. prostokąt", "2. kwadrat", "3. koło", "4. trójkąt"};

        System.out.println("Podaj liczbę przypisaną do figury z listy dla której chcesz otrzymać pole i obwód (np. 1 dla prostokątu)");

        Arrays.stream(tab).forEach(System.out::println);

        int fig = scanner.nextInt();

        switch(fig){

            case(1):{
                System.out.println("podaj długość dwóch różnych boków prostokąta jako liczby dodatnie");
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
                System.out.println("Pole prostokątu o podanych bokach to " + Prostokąt.Pole(a,b));
                System.out.println("Obwód prostokątu o podanych bokach to " + Prostokąt.Obwód(a,b));
                break;
            }
            case(2):{
                System.out.println("podaj długość boku kwadratu jako liczbę dodatnią");
                double a = scanner.nextDouble();
                System.out.println("Pole kwadratu o podanym boku to " + Prostokąt.Pole(a,a));
                System.out.println("Obwód kwadratu o podanym boku to " + Prostokąt.Obwód(a,a));
                break;
            }
            case(3):{
                System.out.println("podaj długość promienia koła jako liczbę dodatnią");
                double a = scanner.nextDouble();
                System.out.println("Pole koła o podanym promieniu to " + Koło.Pole(a));
                System.out.println("Obwód koła o podanym promieniu to " + Koło.Obwód(a));
                break;
            }
            case(4): {
                System.out.println("podaj długość wszystkich trzech boków trójkąta jako liczby dodatnie");
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
                double c = scanner.nextDouble();
                System.out.println("Pole trójkąta o podanych bokach to " + Trójkąt.Pole(a,b,c));
                System.out.println("Obwód trójkąta o podanych bokach to " + Trójkąt.Obwód(a,b,c));
                break;
            }
        }


    }

    public static class Prostokąt {

        public static double Pole(double a, double b){
            return (a*b);
        }

        public static double Obwód(double a, double b){
            return (a*2+b*2);
        }
    }

    public static class Koło {

        public static double Pole(double a){
            return (Math.pow(a,2)*PI);
        }

        public static double Obwód(double a){
            return (a*2*PI);
        }
    }

    public static class Trójkąt {

        public static double Pole(double a,double b, double c){
            double P = Obwód(a,b,c)/2;
            return (Math.sqrt(P*(P-a)*(P-b)*(P-c)));
        }

        public static double Obwód(double a,double b, double c){
            return (a+b+c);
        }
    }

}
