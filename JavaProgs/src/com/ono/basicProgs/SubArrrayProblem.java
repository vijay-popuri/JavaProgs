package com.ono.basicProgs;

import java.util.Scanner;

public class SubArrrayProblem {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter no of TestCases");
		int noOfTestCases = scanner.nextInt();
		for (int i = 1; i <= noOfTestCases; i++) {
			System.out.println("Enter the Size of Array>>>>>");
			int size = scanner.nextInt();
			int arr1[] = new int[size];
			int arr2[] = new int[size];
			for (int j = 0; j <= size-1; j++) {
				arr1[j] = scanner.nextInt();

			}
			for (int j = 0; j <= size-1; j++) {
				arr2[j] = scanner.nextInt();

			}
			System.out.println("*************************************");
			int count = 0;
			for (int p = 0; p < size; p++) {
				if (arr1[p] == arr2[p]) {
					count+=1;
				}
			}
			System.out.println("same elements count is " + count);
			
			System.out.println("---------FIRST ARRAY---------------------");
			for(int l=0;l<arr1.length;l++) {
				System.out.print(arr1[l]+" ");
			}
			
			for(int l=0;l<arr1.length;l++) {
				System.out.print(arr2[l]+" ");
			}
			
		}

	}

}
