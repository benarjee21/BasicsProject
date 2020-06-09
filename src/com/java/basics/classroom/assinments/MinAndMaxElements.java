package com.java.basics.classroom.assinments;

import java.util.Arrays;

public class MinAndMaxElements {

	public static void main(String[] args) {
		int[] arr= {1, 2, 5, 5, 6, 6, 7, 2};
		Arrays.sort(arr);
		int min=arr[0];
		int max=arr[arr.length-1];
		System.out.println("Min number is : "+min+" and Max number is : "+max);
	}

}
