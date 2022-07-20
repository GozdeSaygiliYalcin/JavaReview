package main.java.com.gozdesy.l23_string.methods;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		// String sınıfına ait başlıca metot kullanımları
		
		String name = "Gozde Saygili";
		String anotherName = "Boncuk";
		
		
		String [] splitSample = name.split(" "); // yazılan harften itibaren bölerek o harf dışındakileri ayrı bir array içine atıyor
		String [] splitSample2 = name.split("y"); // yazılan harften itibaren bölerek o harf dışındakileri ayrı bir array içine atıyor
		System.out.println(Arrays.toString(splitSample));
		System.out.println(Arrays.toString(splitSample2));
		
		System.out.println(name.charAt(1)); //1.indexteki harfi yazdırıyor
		System.out.println(name.compareTo(anotherName)); 
		System.out.println(name.contains("zd")); //true ya da false döndürüyor, içinde varsa true yoksa false
		System.out.println(name.indexOf("d")); //d harfinin kaçıncı index te olduğunu buluyor. bulduğu ilk değeri dönderiyor
		System.out.println(name.replace("a", "e")); // tüm a harflerini e olarak değiştiriyor
		
		String trimSample = "        hello world         ";
		System.out.println(trimSample.trim()); //ön ve arkadaki boşlukları siliyor özellikle şifre isteme işlemlerinde tercih ediliyor
		
		String valueOfSample = "Java Class";
		System.out.println(String.valueOf(valueOfSample+anotherName)); //ikisini birleştirip tek string döndürüyor


	}

}
