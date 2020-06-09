package com.java.basics.HackerRankPrograms.WarmUpProgrames;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task1SockMarchant {

	public int countPairs(int n,int ar[]) {
		int count=0;
		int element=0;
		Set<Integer> pile = new HashSet<Integer>();
		for(int i=0;i<n;i++) {
			element = ar[i];
			if(pile.contains(element)) {
				pile.remove(element);
				count++;
			}else {
				pile.add(element);
			}
		}
		return count;
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
		Task1SockMarchant t2CountPairs= new Task1SockMarchant();
		int totalPairs = t2CountPairs.countPairs(n,arr);
		System.out.println("No of Pairs "+totalPairs);
		//closing scanner
		scanner.close();
	}

}
