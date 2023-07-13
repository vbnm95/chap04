
public class BreakStatementExample {
	public static void main(String[] args) {
		int c = (int)(Math.random()*100 + 1);
		int sum = 0;
		
		System.out.println("choice =" + c);
		
		for(int i=1; i<=100; i++) {
			sum += i;
			if(i == c)
				break;
		}
		
		System.out.println("sum =" + sum);
	}
}
