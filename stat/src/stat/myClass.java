package stat;

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
		
		double count = (double) InputNumber("Введите количество чисел: ");
		double sum = 0;
		double sum2 = 0;
		double count1 = 0;
		double count2 = 0;
		
		
		for (int i = 1; i <= count; i = i + 1) {
		    double number = InputNumber("Введите " + i + " число: ");
	        if(number >= 0) {
	        	sum += number;
	        	count1++;}
	        else { 
	        	sum2 += number;
	        	count2++;}
		}
		System.out.println("---");
		System.out.println("Сумма (пол|отр): " + sum + " | " + sum2);
		System.out.println("Среднее арифметическое (пол|отр): " + sum / count1 + " | " + sum2 / count2);
		
		try {
			System.in.read();
			} catch(Exception e) {}

	}

}
