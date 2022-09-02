package main.java.com.gozdesy.l08_static_data_array;

import java.util.Arrays;
import java.util.Scanner;


public class SieveOfErastosthanes {
	
	public void countNumberSieve(int n) {
		boolean [] list = new boolean[n+1];
		Arrays.fill(list, true);
		list[0] = false;
		list[1] = false;
		
		for (int i = 2; i <= n; i++) {
			if(list[i] == true)
			for (int j = 2; i*j <= n; j++) {
				list[i*j] = false;
				System.out.println(list[i]);
			}
			
		}
		int primeCounter = 0;
		for (boolean b : list) {
			if(b) {
				primeCounter++;
			}
		}
			System.out.println(primeCounter);
		}
	

	public static void main(String[] args) {
		// Prime numberleri bulan metot
		
		SieveOfErastosthanes sv = new SieveOfErastosthanes();
		System.out.print("please enter a positive number: ");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		sv.countNumberSieve(number);
		input.close();

	}

}
