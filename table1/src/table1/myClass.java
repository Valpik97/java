package table1;

public class myClass {

	public static void main(String[] args) {
		for(int i = 1; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				int result = i * j;
				String sep = " ";
				if(result < 10) sep = "  ";
				System.out.print(result +  sep);
			}
			System.out.print("\n");
		}

	}

}
