package com.company;

public class Main {

    public static void main(String[] args) {
        boolean p,q;

        System.out.println("p\tq\tAND\tOR\tXOR\tNOT");
        p=true; q=true;
        System.out.print(p+ "\t"+ q + "\t");
        System.out.print((p&q)+ "\t"+ (p|q) + "\t");
        System.out.print((p^q)+ "\t"+ (!p) + "\t");

        System.out.println();
        p=true; q=false;
        System.out.print(p+ "\t"+ q + "\t");
        System.out.print((p&q)+ "\t"+ (p|q) + "\t");
        System.out.print((p^q)+ "\t"+ (!p) + "\t");
        System.out.println();
        p=false; q=false;
        System.out.print(p+ "\t"+ q + "\t");
        System.out.print((p&q)+ "\t"+ (p|q) + "\t");
        System.out.print((p^q)+ "\t"+ (!p) + "\t");
        System.out.println();
        p=false; q=true;
        System.out.print(p+ "\t"+ q + "\t");
        System.out.print((p&q)+ "\t"+ (p|q) + "\t");
        System.out.print((p^q)+ "\t"+ (!p) + "\t");
    }
}