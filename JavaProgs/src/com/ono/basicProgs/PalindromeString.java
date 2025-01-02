package com.ono.basicProgs;

public class PalindromeString {
	public static void main(String[] args) {
		String a = "abba";
		char[] charArray = a.toCharArray();
		int min = 0;
		int max = charArray.length - 1;
		for (int i = 0; i < charArray.length / 2; i++) {
			char temp = charArray[min];
			charArray[min] = charArray[max];
			charArray[max] = temp;
			min++;
			max--;

		}
		String reversedString = new String(charArray);
		if (reversedString.equalsIgnoreCase(a)) {
			System.out.println("palindrome");
		} else {
			System.out.println("not a palindrome");
		}
	}

}
