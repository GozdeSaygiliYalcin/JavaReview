package main.java.com.gozdesy.l15_io.file;


import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileInputExample {

	public static void main(String[] args) {
		
		try {
			
			FileInputStream input = new FileInputStream("ReadExample.txt"); // Verileri byte cinsinden okumayı sağlıyor
			//neden okumadı?
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} 

	}

}
