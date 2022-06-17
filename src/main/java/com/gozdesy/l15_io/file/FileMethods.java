package main.java.com.gozdesy.l15_io.file;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class FileMethods {

	public static void main(String[] args) {
		// This code belong to I/O and File exercises
		
		File myFile = new File("/Users/gozde/Desktop/Coding/01-BilgeAdam_Boost/FileExample"); // Yeni bir dosya oluşturuyoruz.
		
		if(myFile.isFile()) {
			System.out.println("a file");
	}
		if(myFile.isDirectory()) { // klasör mü dosya mı?
			System.out.println("a folder");   
			String[] fileNames = myFile.list();  
			for(String fileName :fileNames) {  // foreach methodu ile listeyi işliyoruz
				System.out.println(fileName); 
				File file = new File(myFile, fileName); // her bir varlık için üstünde çalıştığımız klasör bilgilerini kullanarak yeni bir "File" objesi yaratıyoruz
				
				if(file.isFile()) { 			// yeni File objesinin özelliklerini sorguluyoruz. Eğer varlık dosya tipinde ise dosyanın özelliklerini gösteriyor
					System.out.println("file name: " +file.getName()); 
					System.out.println("file path: " + file.getAbsolutePath());
					System.out.println("free space: " + file.getFreeSpace());
					System.out.println(file.canExecute() ? "execute" : "not executable");
					System.out.println(file.isHidden() ? "private" : "not private");
					System.out.println(file.canRead() ? "readable" : "not readable");
					System.out.println("\n=============================================");
					long lastModified = file.lastModified();
					LocalDateTime lastModifiedTime =Instant.ofEpochMilli(lastModified).atZone(ZoneId.systemDefault()).toLocalDateTime();
					System.out.println("last modified time: " + lastModifiedTime);
					System.out.println("\n=============================================");
				}
			}
			File newFile = new File("/Users/gozde/Desktop/Coding/01-BilgeAdam_Boost/FileExample/thirdFile.txt");
			if(newFile.exists())  {
				
				System.err.println("file already exists");
			}
			else {
				boolean success = false;
				try {
					success = newFile.createNewFile(); // Yeni bir dosya oluşturma metodu. Eğer dosya zaten varsa false dönüyor 
				} catch (IOException e) {
					
					e.printStackTrace();
				}
				if(success) {
					System.out.println("file is created");
				}
				else {
					System.out.println("file already exists, cannot be created again");
				}
			}

		}
	}

}
