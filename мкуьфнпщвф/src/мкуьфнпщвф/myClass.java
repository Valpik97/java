package мкуьфнпщвф;
import java.util.Scanner;

public class myClass {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		int m = s.nextInt();

		if(t == 1){
		    System.out.print("Зима - ");
		    if(m == 1){
		        System.out.print("декабрь");
		    }
		    else if(m == 2){
		        System.out.print("январь");
		    }
		    else if(m == 3){
		        System.out.print("февраль");
		    }
		    else{
		        System.out.println("Неверный месяц");
		    }

		}
		else if(t == 2){
		    System.out.print("Весна - ");
		    if(m == 1){
		        System.out.print("март");
		    }
		    else if(m == 2){
		        System.out.print("апрель");
		    }
		    else if(m == 3){
		        System.out.print("май");
		    }
		    else{
		        System.out.println("Неверный месяц");
		    }
		}
		else if(t == 3){
		    System.out.print("Лето - ");
		    if(m == 1){
		        System.out.print("июнь");
		    }
		    else if(m == 2){
		        System.out.print("июль");
		    }
		    else if(m == 3){
		        System.out.print("август");
		    }
		    else{
		        System.out.println("Неверный месяц");
		    }
		}
		else if(t == 4){
		    System.out.print("Осень - ");
		    if(m == 1){
		        System.out.print("сентябрь");
		    }
		    else if(m == 2){
		        System.out.print("октябрь");
		    }
		    else if(m == 3){
		        System.out.print("ноябрь");
		    }
		    else{
		        System.out.println("Неверный месяц");
		    }
		}
		else{
		    System.out.println("Неверное число");

		}

		}

}
