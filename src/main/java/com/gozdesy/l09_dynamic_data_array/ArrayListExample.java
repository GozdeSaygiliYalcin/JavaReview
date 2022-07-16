package main.java.com.gozdesy.l09_dynamic_data_array;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// Temel arraylist alıştırmaları
		
		
		ArrayList<String> singers = new ArrayList<>();
		
		singers.add("coldplay");
		singers.add("u2");
		singers.add("keane");
		singers.add("maroon 5");
		
		for (String string : singers) { //foreach döngüsü ile bütün elemanları yazdırıyoruz
			System.out.println(string);
		}
		System.out.println("--------------------------------------------------------------------");
		//remove için index veya doğrudan listedeki veriyi verebiliyoruz
		singers.remove(0);
		singers.remove("coldplay");
		
		for (String string : singers) { 
			System.out.println(string);
		}
		singers.set(1, "adele");
		System.out.println("--------------------------------------------------------------------");
		for (String string : singers) { 
			System.out.println(string);
		}

	}
}