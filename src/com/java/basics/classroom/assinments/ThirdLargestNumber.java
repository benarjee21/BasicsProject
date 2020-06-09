package com.java.basics.classroom.assinments;

import java.util.Arrays;

public class ThirdLargestNumber {
	
	public void thirdLargestNunmber(int[] arr) {
		if(arr.length>=3) {
			Arrays.sort(arr);
			int ln=(arr.length)-1;
			int thirdNumber=arr[ln];
			int count=0;
			while(count<=1) {
				if(!(arr[ln]==arr[ln-1])) {
					count++;
					ln--;
					thirdNumber=arr[ln];
				}else {
					ln--;
				}
			}
			System.out.println("Third Largest Number is : "+thirdNumber);
		}else {
			System.out.println("Invalid Input, array size is less than 3");
		}
	}
	
	public static void main(String[] args) {
		int[] arr1={6,8,1,9,2,1,9,10,10,10};
		int[] arr2={6,8,10,12,10,12,1,9,2,1,10,10,11,12};
		int[] arr3={6};
		ThirdLargestNumber thirdNumber =new ThirdLargestNumber();
		thirdNumber.thirdLargestNunmber(arr1);
		thirdNumber.thirdLargestNunmber(arr2);
		thirdNumber.thirdLargestNunmber(arr3);
	}

}
