package uravnenie;

public class myClass {
	//A^2 + B^3 = c^4

	public static void main(String[] args) {
		System.out.println(" a | b  | c");
		int counter = 1;
		ex: for (int i = 1; i <= 1000; i++) {
		    for (int j = 1; j <= 1000; j++) {
		        for (int k = 1; k <= 1000; k++) {
		            if ( i*i + j*j*j == k*k*k*k ) {
		                System.out.println(i +" | "+ j + " | " + k);
						if(counter > 2) {
							break ex;}
						counter++;
		            }
		        }
		    }
		}
	}

}
