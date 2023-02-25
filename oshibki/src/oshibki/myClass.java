package oshibki;

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
		
		double year = InputNumber("Введите год: "); 
		if (year % 4 == 0) {
			if (year % 100 != 0 || year % 400 == 0) {
				year = 366;
			}
			else{
				year = 365;
			}
		}
		else {
			year = 365;
		}	 
		System.out.print("Число дней в году: " + year);
		
		try {
			System.in.read();
			} catch(Exception e) {}	

	}
}
