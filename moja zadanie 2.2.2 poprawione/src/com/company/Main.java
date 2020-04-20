package com.company;

import java.io.UncheckedIOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("WIRTUALNY DOKTOR");
        System.out.println("JAKA MASZ TEMPERATURE?");
        Scanner Temperatura = new Scanner(System.in);
        double T = Temperatura.nextDouble();
        double normal = 36.6;
        double max = 42.0;
        if (T <= normal) {
            System.out.println("**temperatura w normie**");
        }
        if (T > normal) {
            System.out.println("**Uwaga! Masz gorączke**");
        }
        if (T == max) {
            System.out.println("**Bardzo wysoka temperatura**");
        }


        System.out.println("CZY MASZ KASZEL? TAK/NIE");
        Scanner Kaszel = new Scanner(System.in);
        String K = Kaszel.nextLine();
        switch (K) {

            case "TAK":
                System.out.println(" **Nie jest dobrze, zgłoś się do lekarza**");
                break;
            case "NIE":

                System.out.println("**Jest dobrze, zostań w domu**");
        }
        System.out.println("CZY MASZ BÓL W KLATCE PIERSIOWEJ? CZASAMI/ NIGDY");
        Scanner Ból = new Scanner(System.in);
        String B = Ból.nextLine();
        switch (B) {
            case "CZASAMI":
                System.out.println("**nie jest dobrze, pilnie jedź do szpitala**");
                break;
            case "NIGDY":
                System.out.println("**Nie jest źle, zostań w domu**");
        }
    }
}