package detali;

import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class myClass {
	
	static double InputNumber(String caption){
        System.out.print(caption);
        Scanner sc = new Scanner(System.in);
        boolean isError;
        do{
            isError = !sc.hasNextDouble();
            if(isError){
                System.out.println("Неверный ввод. Введите данные еще раз: ");
                sc.nextLine();
            }
        }
        while(isError);
        return sc.nextDouble();
    }

	public static void main(String[] args) {
		try {
		     System.setOut(new java.io.PrintStream(System.out, true, "Cp866"));
		} catch (UnsupportedEncodingException e) { }
		
		double minL = InputNumber("Введите минимальный размер детали: ");
		double maxL = InputNumber("Введите максимальный размер детали: ");
		double n = InputNumber("Введите кол-во деталей: ");
		double b = 0;
		for(int i = 0; i <= (n-1); i++) {
			double a = InputNumber("Введите длину " + (i + 1) + "-ой детали: ");
			if(a < minL || a > maxL ) {
				b++;
			}
		}
		double x = b * 100 / n;
		System.out.print("процент брака - "  + x);
		
		try {
			System.in.read();
			} catch(Exception e) {}	
	}

}
