
public class ForStatementExample {

	public static void main(String[] args) {
		int sum = 0;
		
		for(int i = 1; i <=10; i+=2) {
			sum = sum + i;
		}
		System.out.println(sum);
	}
	public static void main3(String[] args) {
		for(;;) {
			System.out.println("...");
		}
	}
	public static void main2(String[] args) {
		for(int i = 1; i <= 100; i++) {
			System.out.println(i);
		}
	}
}
