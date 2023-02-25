package matemVirashenia;
import java.io.UnsupportedEncodingException;
public class obemShara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		     System.setOut(new java.io.PrintStream(System.out, true, "Cp866"));
		} catch (UnsupportedEncodingException e) { }
		
		double diametr = 15;
		double radius = diametr / 2;
		double n = 1.3;
		double p = 3.14;
		double obem = n * p * radius * radius * radius;
		System.out.print("Обьём шара:" + obem + "см^2");
		
		try {
			System.in.read();
			} catch(Exception e) {}
	}

}
