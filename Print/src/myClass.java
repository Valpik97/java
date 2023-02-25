import java.io.UnsupportedEncodingException;
public class myClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Изменение кодировки
		try {
		System.setOut(new java.io.PrintStream(System.out, true, "Cp866"));
		} catch (UnsupportedEncodingException e) { }
		
		// Рисование
		System.out.println("            _____");
		System.out.println("           /");
		System.out.println("          |");
		System.out.println("\\         |        /");
		System.out.println(" \\~~~~~~~~~~~~~~~~/");
		System.out.println("  \\~~~~~~~~~~~~~~/");
		System.out.println("   \\~~~~~~~~~~~~/");
		System.out.println("    \\~~~~~~~~~~/");
		System.out.println("     \\~~~~~~~~/");
		System.out.println("      \\______/");
		System.out.println("         ||");
		System.out.println("         ||");
		System.out.println("         ||");
		System.out.println("     ----------");
		System.out.println("  Приглашаю в ресторан! ");
		
		// Задержка экрана
		try {
		System.in.read();
		} catch(Exception e) {}
	}

}
