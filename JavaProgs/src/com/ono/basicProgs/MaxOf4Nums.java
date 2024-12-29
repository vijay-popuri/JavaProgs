package com.ono.basicProgs;

public class MaxOf4Nums
{
	public static void main(String[] args) {
		int a=2000,b=300,c=40,d=500;
		int max=a;
		
		if(b>max) {
			max=b;
		}
		if(c>max) {
			max=c;
		}
		if(d>max) {
			max=d;
		}
		System.out.println("max is "+max);
	}

}
