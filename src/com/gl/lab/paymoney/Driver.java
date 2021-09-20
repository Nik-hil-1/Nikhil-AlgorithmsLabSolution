package com.gl.lab.paymoney;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the transaction array!");
		int size = sc.nextInt();
		int[] transactions = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println("Enter " + (i + 1) + " transaction");
			transactions[i] = sc.nextInt();
		}

		System.out.println("Enter the target to achieve!");
		int target = sc.nextInt();
		PayMoney payMoney = new PayMoney();
		int no_of_days = payMoney.no_of_days(transactions, target);
		if (no_of_days == -1)
			System.out.println("Target is not acheived.");
		else
			System.out.println("Target achieved after " + no_of_days + " transaction.");

		sc.close();
	}

}
