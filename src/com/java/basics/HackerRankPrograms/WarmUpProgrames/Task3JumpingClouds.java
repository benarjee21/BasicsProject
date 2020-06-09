package com.java.basics.HackerRankPrograms.WarmUpProgrames;

import java.util.Scanner;

public class Task3JumpingClouds {
	
	public int minimumSteps(int n,int ar[]) {
		int steps=-1;
		for(int i=0;i<n;i++,steps++) {
			if(i+2<n && ar[i]==0) {
				i++;
			}
		}
		return steps;
	}

	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		int arr[];
		System.out.println("Enter Size Of the Pile:");
		int n= scanner.nextInt();
		arr=new int[n]; 
		System.out.println("Enter Size Of the Pile:");
		for(int i=0;i<n;i++) {
			arr[i]= scanner.nextInt();
		}
		Task3JumpingClouds t3JumpCloud= new Task3JumpingClouds();
		int totalSteps = t3JumpCloud.minimumSteps(n,arr);
		System.out.println("No of Minimum Steps "+totalSteps);
		//closing scanner
		scanner.close();

	}

}
