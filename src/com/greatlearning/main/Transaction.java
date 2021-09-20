package com.greatlearning.main;

import java.util.Scanner;

public class Transaction {
	
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String args[]) {
		
		System.out.println("Enter the size of transaction array");
		int sizeOfTransaction = scanner.nextInt();
		int[] transactions = buildTransactionsArray(sizeOfTransaction);
		
		System.out.println("Enter the total no of targets that needs to be achieved");
		int totalTargetNo =scanner.nextInt();
		int count=0;
		while(count<totalTargetNo) {
			count++;
			int targetAcheivedInd=0;
			System.out.println("Enter the value of target");
			int tempTarget=scanner.nextInt();
			for(int i=0;i<sizeOfTransaction;i++) {
				tempTarget =tempTarget-transactions[i];
				if(tempTarget <=0) {
					targetAcheivedInd =i+1;
					break;
				}
					
			}
			if(targetAcheivedInd > 0) {
				System.out.println("Target achieved after "+targetAcheivedInd+" transactions");
			}else {
				System.out.println("Given target is not achieved");
			}
		}
		
	}

	private static int[] buildTransactionsArray(int sizeOfTransaction) {
		int[] transactions = new int[sizeOfTransaction];
		System.out.println("Enter the values of transactions with a space");
		for(int i=0;i<sizeOfTransaction;i++) {
			transactions[i]=scanner.nextInt();
		}
		return transactions;
	}

}
