package programcici;

import java.util.Scanner;

public class ObimTrougla {

    //Domaci - izracunati povrsinu trougla


    //napisati program koji sluzi za racunanje obima trougla
    //zelim da unesem tip trougla
    //zelim da , u zavisnosti tipa, unesem stranice trougla
    // i na kraju da mi istampa obim trougla

    public static void main(String[] args) {

        System.out.println("Unesi tip trougla. (1)Jednakostranicni (2)Jednakokraki (3)Pravougli");
        Scanner scanner = new Scanner(System.in);
        int vrstaTrougla = scanner.nextInt();
        double a,b,c,obim;

        switch(vrstaTrougla) {
            case 1 :
                System.out.println("Izabrali ste jednakostranican trougao");
                System.out.println("Unesite stranicu a");
                a = scanner.nextDouble();

                obim = izracunajObim(a);
                System.out.println("Obim jednakostranicnog trougla je " +obim);

                break;

            case 2 :
                System.out.println("Izabrali ste jednakokraki trougao");
                System.out.println("Unesite stranicu a");
                a = scanner.nextDouble();

                System.out.println("Unesite stranicu b");
                b = scanner.nextDouble();

                obim = izracunajObim(a,b);
                System.out.println("Obim jednakokraki trougla je " +obim);

                break;

            case 3 :
                System.out.println("Izabrali ste pravougli trougao");
                System.out.println("Unesite stranicu a");
                a = scanner.nextDouble();

                System.out.println("Unesite stranicu b");
                b = scanner.nextDouble();

                System.out.println("Unesite stranicu c");
                c = scanner.nextDouble();

                obim = izracunajObim(a,b,c);
                System.out.println("Obim pravouglog trougla je " +obim);

                break;

            default:
                System.out.println("Uneli ste pogresan broj za izbor trougla. Pokusajte ponovo.");
        }
    }





    public static double izracunajObim(double a) {
        return 3*a;
    }
    public static double izracunajObim(double a, double b) {
        double obim = 2*b+a;
        return obim;
    }
    public static double izracunajObim(double a, double b, double c) {
        return a + b + c;
    }


}
