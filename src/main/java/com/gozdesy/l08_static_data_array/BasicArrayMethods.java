package main.java.com.gozdesy.l08_static_data_array;

import java.util.Arrays;

public class BasicArrayMethods {
	
	public void copyArrayRange(int[] arr) { //1-copy of range
		int [] toBeCopied = Arrays.copyOfRange(arr, 5, 7);
		System.out.print("1-copy of range methods-range 5 to 7 copy: "); //5inci indeksten 7inciye kadar olanları yeni bir arraya kopyalıyor
		System.out.println(Arrays.toString(toBeCopied));
	}
	
	public void copyArray(int[] arr) {
		 int[] newArray = Arrays.copyOf(arr, 4); // 2-copy of, kaç elemanı kopyalayacağımızı belirtiyoruz
		 System.out.print("2-copy of method-new array that includes 4 members: ");
		 System.out.println(Arrays.toString(newArray));
	}

	public static void main(String[] args) {
		// Arrays sınıfı ve metotlarının kullanımı
		BasicArrayMethods methods = new BasicArrayMethods();
		int [] a3 = {1,2,3,4,5,6,7,8,9,10,11};
		methods.copyArrayRange(a3); // 1-copy of range
		methods.copyArray(a3);
 
	}

}
