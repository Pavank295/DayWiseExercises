package com.wipro.basic;

public class ex14 {

	public static void main(String[] args){
	        int[] arr = {2, 19, 1, 3};
	        int target = 9;

	        for (int i = 0; i < arr.length; i++) {
	            for (int j = i + 1; j < arr.length; j++) {
	                for (int k = j + 1; k < arr.length; k++) {
	                    if (arr[i] + arr[j] + arr[k] == target) {
	                        System.out.println("Indices: " + i + ", " + j + ", " + k);
	                        return; // Stop after finding the first triplet
	                    }
	                }
	            }
	        }

	        System.out.println("No triplet found.");
	    }
	}

