//2)Write a Java Program to remove duplicate elements in given Array?
//
//Input:  1, 2, 5, 5, 6, 6, 7, 2
//
//Output:  1, 2, 5, 6, 7
package com.java.basics.classroom.assinments;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateElements {
	
	public Set<Integer> duplicateIntegers(int[] arr){
		Set<Integer> noDuplicates= new HashSet<Integer>();
		for(int i=0;i<arr.length;i++) {
			int element=arr[i];
			noDuplicates.add(element);
		}
		return noDuplicates;
	}
	
	public static void main(String args[]) {
		int[] arr= {1,2,5,5,6,6,7,2};
		RemoveDuplicateElements dupli= new RemoveDuplicateElements();
		Set<Integer> result=dupli.duplicateIntegers(arr);
		for(Integer x:result) {
			System.out.println(x);
		}
	}

}