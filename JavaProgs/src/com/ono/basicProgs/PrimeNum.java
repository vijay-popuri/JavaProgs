package com.ono.basicProgs;

public class PrimeNum 
{

	public static void main(String[] args) {
		int num=23;
		int count=0;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				count+=1;
			}
		}
		if(count==0) {
			System.out.println("it is prime");
		}else {
			System.out.println("it is not a prime");
		}
	}
}
