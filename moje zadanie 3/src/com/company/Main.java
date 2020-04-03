




package com.company;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" *****Zabawa z zgadywanie liczb: *****");
        System.out.println(" Pomyśl liczbę od 0 do 100");
        int Liczba;
        Liczba = 4;// Tu wpisujemy naszą liczbę

        int Odpowiedz;
        Odpowiedz = scanner.nextInt();
        if (Liczba == Odpowiedz) {
            System.out.println(" Brawo! Dobra odpowiedź");
        } else if (Liczba > Odpowiedz){
            System.out.println(" Za nisko, próbuj dalej");

        }else if (Liczba < Odpowiedz)
            System.out.println(" Za wysoko, próbuj dalej");
    }
}
