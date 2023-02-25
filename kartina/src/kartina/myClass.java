package kartina;

public class myClass {

	public static void main(String[] args) {
		for(int i = 0; i < 19; i++) {
				System.out.println("");
			for(int j = 0; j < 38; j++) {
				if((i == 0  && (j == 36 | j == 37)) | ((36 - i * 2 == j  | 36 - i*2 == j - 1 ) && i > 0)) {
					System.out.print("/");
				}
				else if((i == 0  && j < 2) | ((i == 1  && (j == 2 | j == 3))) | ((i * 2 == j  | i*2 == j -1 ) && i > 1)) {
					System.out.print("\\");
				}
				else if(((j + 1 <= i + 1) && (i <= j)) | (j <= i*2+1)) 	{
					System.out.print("*");
				}
				else {
					System.out.print(".");
				}
			}
		}
		try {
			System.in.read();
			} catch(Exception e) {}
		
	}
	
}
