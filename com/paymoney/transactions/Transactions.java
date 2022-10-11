package com.paymoney.transactions;

import java.util.Scanner;

public class Transactions {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size Of Transaction Array");
		int size = sc.nextInt();

		int trans[] = new int[size];
		System.out.println("Enter The Values Of Array");
		for (int i = 0; i < size; i++) {
			trans[i] = sc.nextInt();
		}

		System.out.println("Enter The Total No Of Targets That Needs To Be Achieved");
		int testcases = sc.nextInt();
		int targetAmount;
		int j, sum, flag;
		for (int i = 1; i <= testcases; i++) {
			sum = 0;
			flag = 0;
			System.out.println("Enter The Value Of Target " + i + "case");
			targetAmount = sc.nextInt();
			for (j = 0; j < trans.length; j++) {
				sum = sum + trans[j];
				if (sum >= targetAmount) {
					System.out.println("Target Achieved After " + ++j + "Transactions");
					flag = 1;
					break;
				}
			}
			if (flag == 0)
				System.out.println("Target not fulfilled");
		}
		sc.close();
	}
}