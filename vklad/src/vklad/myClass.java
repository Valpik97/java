package vklad;

import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class myClass {
	
	static void Header(){
		System.out.println("таблица вкадов");
		System.out.println("-----------------------------");
	}
	
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
		
		Header();
		double s = InputNumber("Введите начальную сумму:");
		double x = InputNumber("Введите процент:");
		for(int i = 0; i <= 11; i++) {
			s = s + (s / 100 * x);
			System.out.println((i+1) + " месяц - " + s);
			
		}
		
		try {
			System.in.read();
			} catch(Exception e) {}

	}

}
