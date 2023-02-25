package postuplenie;

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
		
		Scanner s = new Scanner(System.in);
		int x = 0;
		double n = InputNumber("Введите кол-во учеников: ");
		for(int i = 0; i <= (n-1); i++) {
			double _rus = InputNumber("Введите оценку за экзамен по русскому языку у " + (i+1) + "-ого ученика: ");
			boolean isError2 = true;
			do {
			if (_rus > 0 && _rus < 6) {
				isError2 = false;
			}
			else {
				System.out.print("Пятибальная система! Введите оценку еще раз:");
	            _rus = s.nextDouble();
			}
			}while(isError2);
			double _phys = InputNumber("Введите оценку за экзамен по физике у " + (i+1) + "-ого ученика: ");
			boolean isError3 = true;
			do {
			if (_phys > 0 && _phys < 6) {
				isError3 = false;
			}
			else {
				System.out.print("Пятибальная система! Введите оценку еще раз:");
	            _phys= s.nextDouble();
			}
			}while(isError3);
			double _mat = InputNumber("Введите оценку за экзамен по математике у " + (i+1) + "-ого ученика: ");
			boolean isError4 = true;
			do {
			if (_mat > 0 && _mat < 6) {
				isError4 = false;
			}
			else {
				System.out.print("Пятибальная система! Введите оценку еще раз:");
	            _mat = s.nextDouble();
			}
			}while(isError4);
			if((_mat == 5 || _mat == 4) && (_phys == 5 || _phys == 4) && (_rus == 5 || _rus == 4)) {
				x++;
			}
		}
		System.out.print("кол-во учеников, которые имеют шанс поступить - " + x);
		
		try {
			System.in.read();
			} catch(Exception e) {}	
	}

}
