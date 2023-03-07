package proga;

import java.util.Scanner;

public class myClass {

	public static void main(String[] arg) {

	      Scanner sc = new Scanner(System.in);
	      int n = sc.nextInt();
	      String s = "hello";
	      for(int i = 1; i <= n; i++){
	         s = s + i;
	         System.out.println (s);
	      }
	      
	}
}
