package com.java.basics.HackerRankPrograms.WarmUpProgrames;

import java.util.Scanner;

public class Task4RepeatedString {
	public long noOfAs(long n,String s) {
		long repeater = n/s.length();
		long filler = n%s.length();
		long asOfWord=0,addAs=0;
		for(int i=0;i<s.length();i++) {
			if(i<filler) {
				if(s.charAt(i)=='a') {
					asOfWord++;
					addAs++;
				}
			}else {
				if(s.charAt(i)=='a') {
					asOfWord++;
				}
			}
		}
		return asOfWord*repeater+addAs;
	}

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		String wordOfA;
		System.out.println("Enter Size Of the Requried String:");
		long n= scanner.nextLong();
		System.out.println("Enter String:");
		wordOfA = scanner.next();
		Task4RepeatedString t4RepeatedString= new Task4RepeatedString();
		long totalAs = t4RepeatedString.noOfAs(n,wordOfA);
		System.out.println("No of a's are "+totalAs);
		//closing scanner
		scanner.close();

	}

}
