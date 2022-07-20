package main.java.com.gozdesy.l24_math.methods;

public class MathClassMethods {
	
	public static void main(String[] args) {
		//temel ma
		
		System.out.println(Math.abs(-250)); //sayının mutlak değerini verir
		System.out.println(Math.floor(2.3242)); //en yakın bir alt tam sayıya yuvarlar
		System.out.println(Math.ceil(3.4232)); //en yakın bir üst tam sayıya yuvarlar. floor ve ceil birbirinin zıttı olarak çalışıyor
		System.out.println(Math.pow(2, 3)); // ilk girilen sayının ikinci girilen sayı üssünü hesaplıyor  ( 2^3 )
		System.out.println(Math.random()); //random olarak 0-1 arası sayı üretir
		System.out.println(Math.random()*100); //yanına bir rakam koyduğumuzda üst sınır olarak bu rakama kadar sayı üretir. double
	}

}
