package com.ono.basicProgs;

public class Palindrome {

	public static void main(String[] args) {
		int a = 323;
		int res = a;
		int val = 0;
		while (res > 0) {
			int rem = res % 10;
			val = val * 10 + rem;
			res = res / 10;
		}
		if (val == a) {
			System.out.println("palindrome");
		} else {
			System.out.println("not a palindrom");
		}

	}
}
