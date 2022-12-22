package Aufgabe.aufgabe4;

import java.util.Scanner;

public class Auf5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Geben Sie einen Password");
        String pas= scan.nextLine();

        if ((pas.length()>=7) && !(pas.contains(" ")) && (65<=pas.charAt(0) && pas.charAt(0)<=90) && (97<=pas.charAt(pas.length()-1))
                && (pas.charAt(pas.length()-1)<=122))
        {
                    System.out.println("Das passt");
        }
        else
            System.out.println("das passt nicht");

    }
}
