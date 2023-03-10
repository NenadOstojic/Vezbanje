package programcici;

import java.util.Scanner;

public class MaliDigitron2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char operacija;
        double broj1, broj2, rezultat;

        System.out.println("Unesite prvi broj");
        broj1 = scanner.nextDouble();

        System.out.println("Izaberite operaciju +, -, *, /");
        operacija = scanner.next().charAt(0);

        System.out.println("Unesite drugi broj");
        broj2 = scanner.nextDouble();

        switch (operacija) {

            case '+' :
                rezultat = izracunajRezultat1(broj1, broj2);
                System.out.println("Rezultat je " + rezultat);
                break;

            case '-' :
                rezultat = izracunajRezultat2(broj1, broj2);
                System.out.println("Rezultat je " + rezultat);
                break;

            case '*' :
                rezultat = izracunajRezultat3(broj1, broj2);
                System.out.println("Rezultat je " + rezultat);
                break;

            case '/' :
                rezultat = izracunajRezultat4(broj1, broj2);
                System.out.println("Rezultat je " + rezultat);
                break;

            default:
                System.out.println("Uneli ste pogresnu operaciju");
                break;
        }
    }

    public static double izracunajRezultat1(double broj1, double broj2){
        double rezultat = broj1 + broj2;
        return rezultat;
    }
    public static double izracunajRezultat2(double broj1, double broj2){
        double rezultat = broj1 - broj2;
        return rezultat;
    }
    public static double izracunajRezultat3(double broj1, double broj2){
        double rezultat = broj1 * broj2;
        return rezultat;
    }
    public static double izracunajRezultat4(double broj1, double broj2){
        double rezultat = broj1 / broj2;
        return rezultat;
    }


}
