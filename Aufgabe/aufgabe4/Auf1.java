package Aufgabe.aufgabe4;

import java.util.Locale;

public class Auf1 {
    public static void main(String[] args) {

        String str = "Java ogrenmek123 Cok guzel@";
        str=str.replaceAll("[^a-zA-Z\\s]", "");
        str=str.toLowerCase(Locale.ROOT);
        str=str.substring(0,1).toUpperCase(Locale.ROOT)+ str.substring(1);
        System.out.println(str);
    }
}
