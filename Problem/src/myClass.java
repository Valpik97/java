import java.util.Scanner;
public class myClass {
	
	static void Header(){
	    System.out.println("Программа выявления проблем");
	    System.out.println("---------------------------");
	}
	
	static boolean Answer(String caption){
	    System.out.print(caption);
	    Scanner sc = new Scanner(System.in, "cp866");
	    String op = sc.next();
	    if (op.equals("да")) return true;
	    if (op.equals("нет")) return false;
	
	    System.out.print("Неверный ввод. \nПрограмма завершила работу.");
	    System.exit(0);
	    return false;
	}
	
	public static void main(String[] args) {
	    Header();
	
	    if (Answer("Это работает? : "))
	        System.out.println("Ничего не трогай!");
	    else
        if (Answer("Ты это трогал? : "))
	        if (Answer("Кто-нибудь об этом знает? : ")){
	            System.out.print("Ты попал!");
	            System.exit(0);
 	       }
	
        System.out.print("Нет проблем!");
	}
}
