package main.java.com.gozdesy.l04_access_modifiers.staticusaement;

//Static keyword usement
public class StaticExample{
	//static variable
	static int j = 10;
	static int n;

	//static block
	static {
	System.out.println("Static block initialized.");
	n = j * 8;
	}

	public static void main(String[] args) {
		
		System.out.println("Inside main method");
		System.out.println("Value of j : " + j);
		System.out.println("Value of n : " + n);
	
	}
}