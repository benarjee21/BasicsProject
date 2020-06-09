package com.java.basics.programes;

import java.util.Arrays;

public class TestSorting {
	public static void main(String[] args) {
		int[] arr= {6,7,2,1,3,9,10,43,23,18,6,9,2,7,1};
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+",");
		}
		Arrays.sort(arr);
		System.out.println();
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+",");
		}
	}

}
