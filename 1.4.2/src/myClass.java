import java.io.UnsupportedEncodingException;
import java.util.Scanner;
public class myClass {
	
	static void Header(){
	    System.out.println("самостоятельная работа");
	    System.out.println("---------------------------");
	}
	
	static boolean Answer(String caption){
	    System.out.print(caption);
	    Scanner sc = new Scanner(System.in);
	    String op = sc.next();
	    if (op.equals("да")) return true;
	    if (op.equals("нет")) return false;
	
	    System.out.print("Неверный ввод. \nПрограмма завершила работу.");
	    System.exit(0);
	    return false;
	}
	
	public static void main(String[] args) {
		try {
		     System.setOut(new java.io.PrintStream(System.out, true, "Cp866"));
		} catch (UnsupportedEncodingException e) { }
	    Header();
	
	    if (Answer("Оно двигается?: ")) {
	    	if  (Answer("А должно?: ")) {
	    	}
	    	else {
	    		System.out.print("Заклей скотчем!");
	            System.exit(0);
	    	}
	    }
	    else if (Answer("А должно?: ")) {
	    		System.out.print("Смажь маслом!");
	            System.exit(0);
	    	}
        System.out.print("Нет проблем!");
        try {
			System.in.read();
			} catch(Exception e) {}
	}
}
