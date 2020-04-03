package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner Waluty = new Scanner(System.in);
        double  PLN,PLN1,PLN2,PLN3;
        double EUR;
        double USD;
        double CHF;
        // Tutaj wpisujemy ile PLN [zł] chcemy wymienić:
        PLN =1000;
        // Aktulany kurs walut:
        EUR= 4.57;
        USD= 4.18;
        CHF= 4.33;

        PLN1 = PLN /EUR;
        PLN2 = PLN /USD;
        PLN3 = PLN /CHF;


        System.out.println("Za kwotę " + "" + PLN + " zł, kupimy " +  PLN1 + " euro");
        System.out.println();
        System.out.println("Za kwotę " + "" + PLN + " zł, kupimy " +  PLN2 + " dolarów");
        System.out.println();
        System.out.println("Za kwotę " + "" + PLN + " zł, kupimy " +  PLN3 + " franków");



    }
}
