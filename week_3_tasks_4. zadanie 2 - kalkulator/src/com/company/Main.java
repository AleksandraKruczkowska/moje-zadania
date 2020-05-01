package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Prosty kalkulator");
        System.out.println("Wprowadz liczbę A");
        Scanner LiczbaA= new Scanner(System.in);
        double A= LiczbaA.nextDouble();

        System.out.println("Wprowadz liczbę B");
        Scanner LiczbaB= new Scanner(System.in);
        double B= LiczbaB.nextDouble();
        System.out.println("Wybierz dzałanie: +, -, *, /");
        Scanner Działanie= new Scanner(System.in);
       String Wynik=Działanie.nextLine();
           switch (Wynik){


               case "+" :
                   System.out.println(A + " "+ "+" + " " + B + " "+ "=" +" "+(A+B) );
                   break;
               case "-" :
                   System.out.println(A + " "+ "-" + " " + B + " "+ "=" +" "+(A-B) );
                   break;
               case "*" :
                   System.out.println(A + " "+ "*" + " " + B + " "+ "=" + " "+(A*B) );
                   break;
               case "/" :
                   System.out.println(A + " "+ "/" + " " + B + " "+ "=" +" "+(A/B) );
                   break;


           }

    }
}
