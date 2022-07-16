package main.java.com.gozdesy.l08_static_data_array;

public class StringArray {

	public static void main(String[] args) {
		
		String str = "string to string array conversion in java";
		String delimiter = " ";
		String strArray[] = str.split(delimiter);
		for (int i = 0; i < strArray.length; i++) {
			strArray[i] = String.valueOf(strArray[i]);
			System.out.println(String.valueOf(strArray[i]));
	    }
	}

}
