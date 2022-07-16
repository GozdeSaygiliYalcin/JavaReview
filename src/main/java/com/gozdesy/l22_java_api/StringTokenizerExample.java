package main.java.com.gozdesy.l22_java_api;

import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {
		// String tokenizer api si kullanılarak kelimelerin parçalanması
		
		String str = "Hello world my name is Boncuk";
		
		StringTokenizer st = new StringTokenizer(str);
		while(st.hasMoreTokens()) {
			System.out.print(st.nextToken());
		System.out.println("------------------------");
		
		String str2 = "I love JAVA";
		StringTokenizer st2 = new StringTokenizer(str2, "a");
			while(st2.hasMoreTokens()) {
				System.out.println(st2.nextToken());
			}
		}
	}
}
