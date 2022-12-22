package Aufgabe.aufgabe4;

import java.util.Scanner;

public class Auf4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Geben Sie den Namen des Benutzers ein");
        String benName= scan.nextLine();

        System.out.println("Geben Sie den Vornamen des Benutzers ein");
        String benVorName= scan.nextLine();

        System.out.println("Geben Sie die 16-stellige Kartennummer ein");
        String kartenNummer= scan.nextLine();
        if (kartenNummer.length()==16) {
            String c = kartenNummer.substring(0, 4).replaceAll("\\S", "*") + " " +
                    kartenNummer.substring(4, 8).replaceAll("\\S", "*") + " " +
                    kartenNummer.substring(8, 12).replaceAll("\\S", "*") + " " + kartenNummer.substring(12);
            String a = benName.substring(0, 1) + benName.substring(1).replaceAll("\\S", "*");
            String b = benVorName.substring(0, 1) + benVorName.substring(1).replaceAll("\\S", "*");
            String d = a+ " "+b;
            System.out.println(d);
            System.out.println(c);
        }
        else System.out.println("Geben Sie die 16-stellige Kartennummer ein");

    }
}
