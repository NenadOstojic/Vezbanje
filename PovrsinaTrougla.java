package programcici;

import java.util.Scanner;
public class PovrsinaTrougla {
    public static void main(String[] args) {
        System.out.println("Unesi tip trougla. (1)Jednakostranicni (2)Jednakokraki (3)Pravougli");
        Scanner scanner = new Scanner(System.in);
        int vrstaTrougla = scanner.nextInt();
        double a,b,h, jednakaStrana, povrsina;

        switch(vrstaTrougla) {
            case 1:
                System.out.println("Izabrali ste jednakostranican trougao");

                System.out.println("Unesite duzine jednakih stranica u trouglu");
                jednakaStrana = scanner.nextDouble();

                povrsina = (Math.sqrt(3)/4) * (jednakaStrana * jednakaStrana);

                System.out.println("Povrsina jednakostranicnog trougla je " +povrsina);

                break;

            case 2:
                System.out.println("Izabrali ste jednakokraki trougao");

                System.out.println("Unesite duzine jednakih stranica u trouglu");
                jednakaStrana = scanner.nextDouble();

                System.out.println("Unesite osnovicu trougla a");
                a = scanner.nextDouble();

                h = Math.sqrt(jednakaStrana*jednakaStrana - (a * a/4));
                povrsina = 0.5 * a * h;

                System.out.println("Povrsina jednakokrakog trougla je " +povrsina);

                break;

            case 3:
                System.out.println("Izabrali ste pravougli trougao");

                System.out.println("Unesite duzinu osnovice");
                a = scanner.nextDouble();

                System.out.println("Unesite visinu stranice");
                b = scanner.nextDouble();

                povrsina = 0.5 * a * b;

                System.out.println("Povrsina pravouglog trougla je " +povrsina);

                break;

            default:
                System.out.println("Uneli ste pogresan broj za izbor trougla. Pokusajte ponovo");


        }

    }
}
