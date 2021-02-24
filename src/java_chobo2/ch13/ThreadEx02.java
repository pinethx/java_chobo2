package java_chobo2.ch13;

public class ThreadEx02 {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();

		for (int i = 0 ; i < 300 ; i ++) {
			System.out.printf("%s", new String("-"));
		}
		
		System.out.println();
		System.out.printf("%s %d ns%n", "첫번째 작업", System.currentTimeMillis()-startTime);
		
		for(int i = 0 ; i < 300 ; i ++) {
			System.out.printf("%s", "|");
		}
		System.out.println();
		System.out.printf("%s %d ns%n", "두번째 작업", System.currentTimeMillis()-startTime);
	}

}
