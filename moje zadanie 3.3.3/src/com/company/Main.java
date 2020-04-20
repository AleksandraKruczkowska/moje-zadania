package com.company;

import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" *****Zabawa z zgadywanie liczb: *****");
        System.out.println(" Pomyśl liczbę od 0 do 30");

        Random rand = new Random ();
        int ran = rand.nextInt (30);
        int Odpowiedz = 0;

        while (ran != Odpowiedz) {
            Odpowiedz = scanner.nextInt();
            if (ran == Odpowiedz) {
                System.out.println(" Brawo! Dobra odpowiedź");
            } else if (ran > Odpowiedz) {
                System.out.println(" Za nisko, próbuj dalej - Pomyśl liczbę od 0 do 30");

            } else if (ran < Odpowiedz)
                System.out.println(" Za wysoko, próbuj dalej - Pomyśl liczbę od 0 do 30");
        }

    }
}
