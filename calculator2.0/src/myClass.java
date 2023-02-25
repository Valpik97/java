import java.util.Scanner;
import javax.swing.JOptionPane;
import java.io.UnsupportedEncodingException;

public class myClass {

	static void Header(){
		System.out.println("калькулятор");
		System.out.println("-----------------------------");
	}
	
	static double InputNumber(String caption) {
		boolean isError;
		double number = 0;
		String captionOriginal = caption;
		
		do {
			String stringNumber = JOptionPane.showInputDialog(null, 
					caption, "Ввод данных", 
					JOptionPane.INFORMATION_MESSAGE);
			
			isError = false;
			try {
				number = Double.valueOf(stringNumber);
			} catch (NumberFormatException e) {
				caption = captionOriginal + "\nНеверный ввод. Введи еще раз.";
				isError = true;
			} catch (NullPointerException e){
				caption = captionOriginal + "\nТы ничего не ввел";
				isError = true;
			}
			
		} while(isError);
		
		return number;
	}
	
	static String InputOperation(String caption) {
		String[] options = {"+", "-", "*", "/"};
		
		return(String) JOptionPane.showInputDialog(null, caption,
		"Ввод данных", JOptionPane.INFORMATION_MESSAGE, null,
		options, options[0]);
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
		String stringResult = a + " " + op + " " + b + " = " + result;
		JOptionPane.showMessageDialog(null, stringResult, "Результат",
		JOptionPane.INFORMATION_MESSAGE);
		
	}
	
	public static void main(String[] args) {
		int isExit = JOptionPane.NO_OPTION;
		do {
		Double n1 = InputNumber("Введи первое число:");
		String operator = InputOperation("Введите знак(+, -, /, *):");
		Double n2 = InputNumber("Введи второе число:");
		Result(n1, n2, operator);
		
		isExit = JOptionPane.showConfirmDialog(null,
				"Хочешь уйти?", "Вопрос",
				JOptionPane.YES_NO_OPTION);
		} while (isExit == JOptionPane.NO_OPTION);
	}

}
