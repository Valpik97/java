package proga3;
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
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Введите своё имя: ");					
		String name = sc.next();

		int m = (int) InputNumber("Введите свой вес в кг: ");		
		int h = (int) InputNumber("Введите свой рост в см: ");
				
		double result = (double)m / (h * h) * 10000;
			
		System.out.print("Результат: ");		

		if (result<=16)
			System.out.print("Выраженный дефицит массы тела");		
		else if (result>16 && result<=18.5)
			System.out.print("Дефицит массы тела");
		else if (result>18.5 && result<=25)
			System.out.print("Норма");
		else if (result>25 && result<=30)
			System.out.print("Избыточная масса тела (предожирение)");
		else if (result>30 && result<=35)
			System.out.print("Ожирение первой степени");
		else if (result>35 && result<=40)			
			System.out.print("Ожирение второй степени");
		else if (result>40)
			System.out.print("Ожирение третьей степени (морбидное)");

	}

}
