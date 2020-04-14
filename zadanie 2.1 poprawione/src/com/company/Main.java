package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("wybierz przelicznik: Waluty albo Miary");
        String name = scanner.nextLine();

        switch (name) {
            case "Waluty":
                Scanner Waluty = new Scanner(System.in);
                System.out.println("Euro, Dolar, Frank");
                String name1 = scanner.nextLine();
                switch (name1) {
                    case "Euro":
                        String Euro = scanner.nextLine();
                        double PLN, PLN1;
                        double EUR;
                        PLN = 1000;
                        EUR = 4.57;
                        PLN1 = PLN / EUR;
                        System.out.println("Za kwotę " + "" + PLN + " zł, kupimy " + PLN1 + " euro");
                        break;

                    case "Dolar":
                        String Dolar = scanner.nextLine();
                        double PLNd, PLN2;
                        double USD;
                        PLNd = 1000;
                        USD = 4.18;
                        PLN2 = PLNd / USD;
                        System.out.println("Za kwotę " + "" + PLNd + " zł, kupimy " + PLN2 + " dolarów");
                        break;
                    case "Frank":
                        String Frank = scanner.nextLine();
                        double PLNf, PLN3;
                        double CHF;
                        PLNf = 1000;
                        CHF = 4.33;
                        PLN3 = PLNf / CHF;
                        System.out.println("Za kwotę " + "" + PLNf + " zł, kupimy " + PLN3 + " franków");
                        break;
                }
            case "Miary":

                Scanner Miary = new Scanner(System.in);
                System.out.println("Metry, Centymetry, Milimetry");
                String name2 = scanner.nextLine();
                switch (name2) {
                    case "Metry":
                        String Metry = scanner.nextLine();
                        double m;
                        double m1;
                        m = 1;
                        m1 = m * 100;
                        System.out.println(m + " metr/y ma " + "" + m1 + "" + " centymetrów");
                        break;

                    case "Centymetry":
                        String Dolar = scanner.nextLine();
                        double cm;
                        double m2;
                        cm = 2;
                        m2 = cm * 10;//cm ->mm
                        System.out.println(cm + " centymetr/y ma " + "" + m2 + "" + " milimetrów");
                        break;
                    case "Milimetry":
                        String Milimetry = scanner.nextLine();
                        double ma, mm;
                        double m3;
                        ma = 1;
                        m3 = ma * 1000;
                        mm = 1;

                        System.out.println(ma + " metr/y ma " + "" + m3 + "" + " milimetrów");

                        break;
                }
        }
    }
}







