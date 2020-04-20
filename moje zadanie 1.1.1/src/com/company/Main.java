package com.company;

public class Main {

    public static void main(String[] args) {
        int p, q;
        System.out.println("p\tq\tAND\tOR\tXOR\tNOT");
        p = 3;
        q = 5;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p & q) + "\t" + (p | q) + "\t");
        System.out.print((p ^ q) + "\t"+(-p));
        System.out.println();
        p = 5;
        q = 3;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p & q) + "\t" + (p | q) + "\t");
        System.out.print((p ^ q) + "\t" + (-p));
        System.out.println();
        p = 3;
        q = 3;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p & q) + "\t" + (p | q) + "\t");
        System.out.print((p ^ q) + "\t" + (-p));
        System.out.println();
        p = 5;
        q = 5;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p & q) + "\t" + (p | q) + "\t");
        System.out.print((p ^ q) + "\t" + (-p));
        System.out.println();
    }

}