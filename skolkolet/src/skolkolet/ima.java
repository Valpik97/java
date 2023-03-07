package skolkolet;
import java.util.Scanner;
public class ima {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Как тебя зовут?");
		String name = sc.nextLine();
		System.out.println("сколько тебе лет?");
		int age = sc.nextInt();
		System.out.print(name + ", тебе " + age + " лет!");
		
	}

}
