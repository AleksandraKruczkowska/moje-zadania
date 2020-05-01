package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Wybierz klasę : ");
        System.out.println("Boolean, Characte,Byte,Short,Integer,Long, Float, Double");
        Scanner Klasa = new Scanner(System.in);
        String K = Klasa.nextLine();
        switch (K) {
            case "Boolean":
                boolean t = true;
                boolean f =false;
                System.out.println(t +" " + "or" + " " + f);
                break;
            case "Characte":
                System.out.println(" Max=" + " " + Character.MAX_VALUE);
                System.out.println( "Min=" + " " + Character.MIN_VALUE);
                break;
            case "Byte":
                System.out.println(" Max=" + " " + Byte.MAX_VALUE);
                System.out.println(" Min=" + " " + Byte.MIN_VALUE);
                break;
            case "Short":
                System.out.println(" Max=" + " " + Short.MAX_VALUE);
                System.out.println(" Min=" + " " + Short.MIN_VALUE);
                break;
            case "Integer":
                System.out.println(" Max=" + " " + Integer.MAX_VALUE);
                System.out.println(" Min=" + " " + Integer.MIN_VALUE);
                break;
            case "Long":
                System.out.println(" Max=" + " " + Long.MAX_VALUE);
                System.out.println(" Min=" + " " + Long.MIN_VALUE);
                break;
            case "Float":
                System.out.println(" Max=" + " " + Float.MAX_VALUE);
                System.out.println(" Min=" + " " + Float.MIN_VALUE);
                break;
            case "Double":
                System.out.println(" Max=" + " " + Double.MAX_VALUE);
                System.out.println(" Min=" + " " + Double.MIN_VALUE);
        }
    }
}
