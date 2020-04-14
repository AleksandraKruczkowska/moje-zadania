package com.company;

public class Main {

    public static void main(String[] args) {
        int p, q;
        System.out.println("p\tq\tAND\tOR\tXOR\tNOT");
        p = 1;
        q = 1;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p & q) + "\t" + (p | q) + "\t");
        System.out.print((p ^ q) + "\t"+ (--p));
        System.out.println();
        p = 1;
        q = 0;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p & q) + "\t" + (p | q) + "\t");
        System.out.print((p ^ q) + "\t" + (--p));
        System.out.println();
        p = 0;
        q = 0;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p & q) + "\t" + (p | q) + "\t");
        System.out.print((p ^ q) + "\t" + (++p));
        System.out.println();
        p = 0;
        q = 1;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p & q) + "\t" + (p | q) + "\t");
        System.out.print((p ^ q) + "\t" + (++p));
        System.out.println();
    }

}