package main.java.com.gozdesy.l15_io.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {

	public static void main(String[] args) {
		// This is file reader example and their methods.
		
		// File myFile = new File(".\\mektup.txt"); // göreceli/relative erişim. Programın çalıştığı yerden okuyor
				File myFile = new File(
						"/Users/gozde/Desktop/Coding/01-BilgeAdam_Boost/FileExample");
				if (!myFile.exists()) {
					System.err.println("Dosya yok");
					System.exit(0);
				}

				FileReader fileReader = null;
				BufferedReader reader = null;
				try {
					fileReader = new FileReader(myFile); // dosyayı okumak için bir katman oluşturulmuştur
					reader     = new BufferedReader(fileReader); // dosyayı daha hızlı okumak için bir katman daha ekliyoruz.
					while (true) {
						String line = reader.readLine();
						if (line == null) {
							break;
						}
						else {
							System.out.println("==> " + line);
						}
					}
				}
				catch (FileNotFoundException ex) {
					ex.printStackTrace();
				}
				catch (IOException ex) {
					ex.printStackTrace();
				}
				finally {
					if (fileReader != null) {
						try {
							fileReader.close();
						}
						catch (IOException ex) {
							ex.printStackTrace();
						}
					}
					if (reader != null) {
						try {
							reader.close();
						}
						catch (IOException ex) {
							ex.printStackTrace();
						}
					}

				}

			}

	}


