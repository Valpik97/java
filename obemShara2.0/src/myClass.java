import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class myClass {

	static void Header(){
		System.out.println("Программа рассчёта обьёма шара");
		System.out.println("-----------------------------");
	}
	
	static String InputDiametr(String caption) {
		System.out.print(caption);
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}
	
	static void Result(double Rradius) {
		double result = 1.33 * 3.14 * Rradius * Rradius * Rradius;
		System.out.println("Обьём шара = " + result + " см^2");
	}
	
	public static void main(String[] args) {
		try {
		     System.setOut(new java.io.PrintStream(System.out, true, "Cp866"));
		} catch (UnsupportedEncodingException e) { }
		
		Header();
		String diametrS = InputDiametr("Введите диаметр шара в см^2:");
		double diametr = Double.parseDouble( diametrS.replace( ',', '.' ) );
		double radius = diametr / 2;
		Result(radius);
		
		try {
			System.in.read();
			} catch(Exception e) {}
	}

}

