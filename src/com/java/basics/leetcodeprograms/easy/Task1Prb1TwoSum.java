package com.java.basics.leetcodeprograms.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Task1Prb1TwoSum {
//	public void twoSum(int t,int ar[]) {
//		for(int i=0;i<ar.length;i++) {
//			for(int j=i+1;j<ar.length;j++) {
//				if(ar[i]+ar[j]==t) {
//					System.out.println("("+i+","+j+")");
//				}
//			}
//		}
//	}
	public void twoSum1(int t,int ar[]) {
		Map<Integer,Integer> twoSum=new HashMap<>();
		Map<Integer,Integer> twoSum1=new HashMap<>();
		for(int i=0;i<ar.length;i++) {
			twoSum.put(ar[i],i);
		}
		for(int i=0;i<ar.length;i++) {
			int element=t-ar[i];
			if(twoSum.containsKey(element) && (twoSum.get(element)!=i) ) { 
				System.out.println("("+twoSum.get(element)+","+i+")");
				twoSum.remove(element);
				twoSum.remove(ar[i]);
				
//				return new int[] { i, twoSum.get(element) };
			}
		}	
//		throw new IllegalArgumentException("No two sum solution");
	}
//	public void twoSum2(int t,int ar[]) {
//		Map twoSum=new HashMap();
//		for(int i=0;i<ar.length;i++) {
//			twoSum.put(ar[i],i);
//			int element=t-ar[i];
//			if(twoSum.containsKey(element)) {
//				System.out.println("("+twoSum.get(element)+","+i+")");
//			}
//			twoSum.put(ar[i],i);
//		}
//		
//	}
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int arr[];
		System.out.println("Enter Target Number:");
		int n= scanner.nextInt();
		System.out.println("Enter Size Of the Array:");
		int s= scanner.nextInt();
		arr=new int[s]; 
		for(int i=0;i<s;i++) {
			arr[i]= scanner.nextInt();
		}
		Task1Prb1TwoSum t1p1TwoSum= new Task1Prb1TwoSum();
		t1p1TwoSum.twoSum1(n,arr);
		//closing scanner
		scanner.close();
	}

}
