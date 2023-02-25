import java.util.Scanner;

public class myClass {
	
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

	public static void main(String[] args) {
	}

}
