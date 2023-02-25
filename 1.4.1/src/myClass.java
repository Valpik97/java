import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class myClass {
	
	static void Header(){
		System.out.println("практические задачи");
		System.out.println("-----------------------------");
	}
	
	static void Zadacha1() {
		System.out.println("Задача1:");
		Scanner sc = new Scanner(System.in);
		System.out.print("введите скорость:");
		Double a = sc.nextDouble();
		System.out.println("введите давление:");
		Double b = sc.nextDouble();
		if(a > 50) { 
			System.out.println("предел скорости");
		}
		else if(a == 0 || b >= 2) {
			System.out.println("критическое давление");
		}
		else {
			System.out.println("всё в норме");
		}
	}

	static void Zadacha2() {
		
		System.out.println("Задача2:");
		Scanner sc = new Scanner(System.in);
		System.out.println("введите высоту:");
		Double c = sc.nextDouble();
		System.out.println("введите запас газа:");
		Double d = sc.nextDouble();
		if(c > 10) { 
			System.out.println("достигнута предельная высота полёта");
		}
		else if(d < 3) {
			System.out.println("критический запас газа");
		}
		else if (d >= 20 && c == 0){
			System.out.println("готов к полёту");
		} 
		else {
			System.out.println("всё в норме");
		}
		
	}
	
	static void Zadacha3() {
		System.out.println("Задача3:");
		Scanner sc = new Scanner(System.in);
		System.out.println("введите температуру:");
		Double t = sc.nextDouble();
		System.out.println("введите давление:");
		Double p = sc.nextDouble();
		System.out.println("введите время непрерывной работы:");
		Double w = sc.nextDouble();
		if(w > 20) { 
			System.out.println("печке надо отдохнуть!");
		}
		else if(t <= 5000) {
			System.out.println("критическая температура!");
		}
		else if (p > 100 && t > 200){
			System.out.println("экстреннное отключение!");
		} 
		else if (w > 10 && t <= 100){
			System.out.println("печка сломалась!");
		} 
		else {
			System.out.println("всё в норме");
		}
		
	}
	
	public static void main(String[] args) {
		try {
		     System.setOut(new java.io.PrintStream(System.out, true, "Cp866"));
		} catch (UnsupportedEncodingException e) { }
		Header();
		Zadacha1();
		Zadacha2();
		Zadacha3();
		try {
			System.in.read();
			} catch(Exception e) {}

	}

}
