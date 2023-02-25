import java.io.UnsupportedEncodingException;
public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		     System.setOut(new java.io.PrintStream(System.out, true, "Cp866"));
		} catch (UnsupportedEncodingException e) { }
		System.out.print("Моя первая программа на Java!");
	}

}
