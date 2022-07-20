package main.java.com.gozdesy.l03_loops_switch.forloop;

public class ForSample {
	
	public void multiplication() {
		
		for (int i = 1; i < 10; i++) {  //çarpım tablosu
			for (int j = 1; j < 10; j++) {
				System.out.println(i+ " * " +j +" = " + i*j );
			}
			System.out.println("-----------------------------");		
		}
	}
	
	public void drawRectangle(int row, int column) {
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column+i; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
	}

	public static void main(String[] args) {
		
		ForSample object = new ForSample();
		object.multiplication();
		object.drawRectangle(5, 1);
	}

}
