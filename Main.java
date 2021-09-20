package com.gl.lab.currencydenomination;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of the currency denomination");
		int size = sc.nextInt();

		int[] denomination = new int[size];

		for (int i = 0; i < size; i++) {
			System.out.println("\nEnter the " + (i + 1) + " denomination");
			denomination[i] = sc.nextInt();
		}

		System.out.println("\nEnter the price to pay");
		int price = sc.nextInt();

		CurrencyDenomination currency = new CurrencyDenomination();
		MergeSort mergeSort = new MergeSort();
		mergeSort.sort(denomination, 0, denomination.length - 1);
		currency.noteCounter(denomination, price);

		sc.close();
	}
}
