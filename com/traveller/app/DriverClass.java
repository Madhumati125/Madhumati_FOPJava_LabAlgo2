package com.traveller.app;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class DriverClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // HAS-A
		System.out.println("Please enter number of Currency notes in your country");
		int size = sc.nextInt();

		int currency[] = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println("Enter the size of Currency Denominations " + i);
			currency[i] = sc.nextInt();
		}
		BubbleSort bs = new BubbleSort();
		bs.sort(currency);

		System.out.println("Enter the amount you want to pay");
		int amount = sc.nextInt();
		System.out.println("Your payment approach in order to give min no of notes will be");

		NotesCount nc = new NotesCount();
		nc.counting(currency, amount);

	}

}