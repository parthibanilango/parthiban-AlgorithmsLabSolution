package com.greatlearning.main;

import java.util.Scanner;

public class MinimumNotes {
	
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String args[]) {
		System.out.println("Enter the size of currency denominations");
		
		int denominationSize = scanner.nextInt();
		int[] denominations = buildDenominationsArray(denominationSize);
		
		getSortedDenominations(denominations);
		
		getNumberOfMinimumNotes(denominations);
	}

	private static void getSortedDenominations(int[] denominations) {
		MergeSort merge = new MergeSort();
		merge.sort(denominations, 0,denominations.length-1);
	}

	private static int[] buildDenominationsArray(int denominationSize) {
		int[] denominations = new int[denominationSize];
		
		System.out.println("Enter the values of denominations with a space");
		
		for(int i=0;i<denominationSize;i++) {
			denominations[i]=scanner.nextInt();
		}
		return denominations;
	}

	private static void getNumberOfMinimumNotes(int[] denominations) {
		System.out.println("Enter the amount you want to pay");
		int amountToPay = scanner.nextInt();
		
		int[] notes = new int[denominations.length];
		int tempAmount =amountToPay;
		for(int i=0;i<denominations.length;i++) {
			notes[i]=(int)tempAmount/denominations[i];
			tempAmount = tempAmount%denominations[i];
		}
		if(tempAmount >0 ) {
			System.out.println("Unable to pay with current denominations");
		}else {
			for(int i=0;i<notes.length;i++) {
				System.out.println(denominations[i]+" : "+notes[i]);
			}
		}
		
	}

}
