package lenta;

import java.util.Scanner;

public class myClass {

	public static void main(String[] args) {
		double L = InputNumber("Введите L: ");
	    double D = InputNumber("Введите D: ");
	    
	    double X = L;
	    while ( X >= D) {
	        X = X - D;
	    }
	    System.out.println("Оставшаяся часть имеет длину: " + X);
	    }

	static double InputNumber(String caption){
        System.out.print(caption);
        Scanner sc = new Scanner(System.in);
        boolean isError;
        do{
            isError = !sc.hasNextDouble();
            if(isError){
                System.out.println("Неверный ввод. Введите данные еще раз");
                sc.nextLine();
            }
        }
        while(isError);
        return sc.nextDouble();
    }
}
