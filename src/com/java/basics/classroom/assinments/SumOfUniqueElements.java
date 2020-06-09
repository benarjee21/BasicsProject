//3)Write a Java Program to find sum of unique elements in given Array?
//
//Input = {1, 6, 4, 3, 2, 2, 3, 8, 1};
//Output : 24 
//(Unique elements are: 1, 6, 4, 3, 2, 8)
//
//Input= {1, 1, 3, 2, 2, 3};
//Output : 6 
//(Unique elements are: 1, 2, 3)

package com.java.basics.classroom.assinments;

import java.util.HashSet;
import java.util.Set;

public class SumOfUniqueElements {
	
	public Set<Integer> duplicateIntegers(int[] arr){
		Set<Integer> noDuplicates= new HashSet<Integer>();
		for(int i=0;i<arr.length;i++) {
			int element=arr[i];
			noDuplicates.add(element);
		}
		return noDuplicates;
	}
	
	public static void main(String args[]) {
		int[] arr= {1, 6, 4, 3, 2, 2, 3, 8, 1};
		int[] arr2={1, 1, 3, 2, 2, 3};
		SumOfUniqueElements dupli= new SumOfUniqueElements();
		Set<Integer> result1=dupli.duplicateIntegers(arr);
		int sum1=0;;
		for(Integer x:result1) {
			sum1 += x;
		}
		System.out.println(sum1);
		Set<Integer> result2=dupli.duplicateIntegers(arr2);
		int sum2=0;;
		for(Integer x:result2) {
			sum2 += x;
		}
		System.out.println(sum2);
	}

}
