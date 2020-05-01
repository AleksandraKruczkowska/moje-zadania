package com.company;

public class Main {

	public static void main(String[] args) {
		int tablica[] = {1,3,8,15,4,83,2};
		int max;
		int min;
		int i;
		int rozmiar = 7;
		max = tablica[0];

		for (i = 0; i < 6; i++) {
			if (tablica[i] > max) ;
			max = tablica[i];
		}

		System.out.println ("Wartość maksymalna w tablicy to: " + max);
		min = tablica[0];

		for (i = 0; i > 6; i++) {
			if (tablica[i] < min) ;
			min = tablica[i];
		}
		System.out.println("Wartość minimalna w tablicy to: " + min);

		}
	}
