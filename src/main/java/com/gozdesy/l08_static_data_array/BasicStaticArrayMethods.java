package main.java.com.gozdesy.l08_static_data_array;

import java.util.Arrays;
import java.util.Scanner;

public class BasicStaticArrayMethods {
	
	public static int [] fillArray(int n) { //scanner sınıfı ile array yaratıyoruz
		
			@SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
		
			int [] fillingArray = new int [n];
			for (int i = 0; i < n; i++) {
				fillingArray[i] = input.nextInt();
			
		}
			return fillingArray;
	}
	
	public static void printArray(int[] arr) { //array elemanlarını yazdıran metot
		
		for (int j = 0; j < arr.length; j++) {
			System.out.println((j+1) +". element is: " +  arr[j]);
		}
	}

	public static void main(String[] args) {
		
		@SuppressWarnings("unused")
		int [] arrayN = fillArray(6);
//		printArray(arrayN);
	
		
		int [] a1 = {1,2,3,4};
		int [] a2 = {1,2,3,4};

		if(Arrays.equals(a1, a2)) { //equals iki arrayin içeriğinin eşitliğini kıyaslıyor
			System.out.println("content is equal");
			
		} else {
			System.out.println("content is not equal");
		}

	}
}
