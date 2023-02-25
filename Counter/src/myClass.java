public class myClass {
	
	static void Counter(int start, int end, int pause) {
		boolean isRevers = false;
		if (start > end){
		    int temp = start;
		    start = end;
	        end = temp;
	        isRevers = true;
		}
		for(int i = start; i <= end; i++){
			int result = i;
			if (isRevers) {
			    result = end - i + 1;}
			System.out.println(result);
			
			try {
			    Thread.sleep(pause);
			} catch (InterruptedException e) {}
		}
	}
	
	public static void main(String[] args) {
		Counter(5, -5, 100);
		System.out.println("Привет!");
	}

}