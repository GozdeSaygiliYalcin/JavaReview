package main.java.com.gozdesy.l10_collections;

import java.awt.font.NumericShaper;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringSetIntoTheArray {
	
//	public static int contains(final char[] arr) {
//        
//        return number; 
//    }
//
	public static void main(String[] args) {
//		
//		String str = "4 kilo elma istiyorum, kilosu 8";
//		int firstSpaceIndex = str.indexOf(" ");
//		int lastSpaceIndex = str.lastIndexOf(" ");
//		int quantity = Integer.parseInt(str.substring(0, firstSpaceIndex));
//		String name = str.substring(firstSpaceIndex, lastSpaceIndex);
//		Double cost = Double.parseDouble(str.substring(lastSpaceIndex));
//		
//		System.out.println(quantity);
//		System.out.println(cost);
//		System.out.println(quantity*cost);
//		
//		
//		char[] arr = str.toCharArray();
//	
//		for(int i=0; i<arr.length; i++) {
//			if(arr[i] >=0 ) {
//			System.out.println(arr[i]);
//			}
////			 int number = Integer.parseInt(new String(arr));
////			 System.out.println(number);
//	}
//		
//		String st = "abcdefg123467686";
//		
//		String st1=st.replaceAll("[^0-9]", "");
//		System.out.println("String  = "+st1);
//
//		char[] arr2 = st1.toCharArray();
//		int number = Integer.parseInt(new String(arr2));
//		
//		System.out.println(number);
	
		String userInput = "3 gozde 3 olgu ali veli abcd 7";
		int i;
//		for(i = 0; i < userInput.length(); i++){
//		    char c = userInput.charAt(i);
//		    if( '0' <= c && c <= '9' )
//		        break;
//		}
		
		String numberPart = userInput.replaceAll("[^0-9]", "");
		System.out.println(numberPart);
		char[] ch = new char[numberPart.length()];
			int sum = 0;
		  	for (int k = 0; k < numberPart.length(); k++) {
	            ch[k] = numberPart.charAt(k);
	            sum += Character.getNumericValue(ch[k]);
	           
	        }
			
		  	 System.out.println(sum);
		}
		
		
	}

