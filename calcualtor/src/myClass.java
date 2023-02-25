import java.util.Scanner;
import java.io.UnsupportedEncodingException;
public class myClass {

	static void Header(){
		System.out.println("калькулятор");
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
	
	static String InputOperation(String caption) {
		System.out.print(caption);
		Scanner s = new Scanner(System.in);
		String op = s.next();
		boolean isError2 = true;
		do {
		if (op.equals("*") || op.equals("/") || op.equals("+") || op.equals("-")) {
			isError2 = false;
		}
		else {
			System.out.println("Неверный ввод. Введите данные еще раз");
            op = s.next();
		}
		}while(isError2);
		return op;
	}
	
	static void Result(double a, double b, String op) {
		Double result = 0.0;
		switch (op){
	    case "*":
	        result = a * b;
	        break;
	    case "/":
	        result = a / b;
	        break;
	    case "+":
	        result = a + b;
	        break;
	    case "-":
	        result = a - b;
	        break;
	    default:
	    	System.out.println("неверная операция");
	    	System.exit(0);
		}
		System.out.println(a + " " + op + " " + b + " = " + result);
	}
	
	public static void main(String[] args) {
		try {
		     System.setOut(new java.io.PrintStream(System.out, true, "Cp866"));
		} catch (UnsupportedEncodingException e) { }
		
		Header();
		
		Double n1 = InputNumber("Введи первое число:");
		String operator = InputOperation("Введите знак(+, -, /, *):");
		Double n2 = InputNumber("Введи второе число:");
		Result(n1, n2, operator);
		
		try {
			System.in.read();
			} catch(Exception e) {}
	}

}
