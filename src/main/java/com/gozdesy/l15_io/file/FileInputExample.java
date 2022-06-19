package main.java.com.gozdesy.l15_io.file;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputExample {

	public static void main(String[] args) {
		
		try {
			
			FileInputStream input = new FileInputStream("ReadExample.txt"); // Verileri byte cinsinden okumayı sağlıyor
			try {
				System.out.println(input.read());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} 

	}

}
