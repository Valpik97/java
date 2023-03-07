package srArifm;

import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class myClass {

	static void Header(){
		System.out.println("Программа рассчёта среднего арифметического трёх чисел");
		System.out.println("-----------------------------------------");
	}
	
	static String InputDiametr(String caption) {
		System.out.print(caption);
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}
	
	static void Result(double a, double b, double c) {
		double result = (a + b + c) / 3;
		System.out.println("среднее арифметическое = " + result);
	}
	
	public static void main(String[] args) {
		try {
		     System.setOut(new java.io.PrintStream(System.out, true, "Cp866"));
		} catch (UnsupportedEncodingException e) { }
		
		Header();
		String n1S = InputDiametr("Введите первое число:");
		String n2S = InputDiametr("Введите второе число:");
		String n3S = InputDiametr("Введите третье число:");
		double n1 = Double.parseDouble( n1S.replace( ',', '.' ) );
		double n2 = Double.parseDouble( n2S.replace( ',', '.' ) );
		double n3 = Double.parseDouble( n3S.replace( ',', '.' ) );
		Result(n1, n2, n3);
		
		try {
			System.in.read();
			} catch(Exception e) {}
		
	}

}