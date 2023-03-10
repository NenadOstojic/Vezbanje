package programcici;

import java.util.Scanner;

public class MaliDigitron {

    //Treba napisati bazican digitron
    //gde ce te uneti prvo broj , pa onda operaciju (to je tipa char), pa onda drugi broj
    // i ispisati u konzoli
    //npr : unesete 5, pa onda unesete +, unesete 7 i na kraju istampate 12..

    public static void main(String[] args) {
        char operacija;
        double broj1, broj2, rezultat;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite prvi broj");
        broj1 = scanner.nextDouble();

        System.out.println("Izaberite operaciju: +, -, *, /");
        operacija = scanner.next().charAt(0);

        System.out.println("Unesite drugi broj");
        broj2 = scanner.nextDouble();

        switch (operacija) {
            case '+':
                rezultat = broj1 + broj2;
                System.out.println(broj1 + " + " + broj2 + " = " + rezultat);
                break;

            case '-':
                rezultat = broj1 - broj2;
                System.out.println(broj1 + " - " + broj2 + " = " + rezultat);
                break;

            case '*':
                rezultat = broj1 * broj2;
                System.out.println(broj1 + " * " + broj2 + " = " + rezultat);
                break;

            case '/':
                rezultat = broj1 / broj2;
                System.out.println(broj1 + " / " + broj2 + " = " + rezultat);
                break;

            default:
                System.out.println("Invalidna operacija");
                break;
        }
    }

}
