package com.java.basics.HackerRankPrograms.WarmUpProgrames;

import java.util.Scanner;

public class Task2CountingValleys {
	public int countValleys(int n,String steps) {
		int count=0,stepVal=0;
		char element;
		for(int i=0;i<n;i++) {
			element=steps.charAt(i);
			if(element == 'U') {
				stepVal++;
				if(stepVal==0) {
					count++;
				}
			}else {
				stepVal--;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		String steps;
		System.out.println("Enter Size Of the Steps:");
		int n= scanner.nextInt();
		System.out.println("Enter String:");
		steps = scanner.next();
		Task2CountingValleys t2CountValleys= new Task2CountingValleys();
		int totalPairs = t2CountValleys.countValleys(n,steps);
		System.out.println("No of Valleys "+totalPairs);
		//closing scanner
		scanner.close();
	}

}
