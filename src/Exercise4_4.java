
public class Exercise4_4 {
	public static void main(String[] args) {
		int sum = 0;
		
		for(int i=1; ;i++) {
			if(i%2 == 0) {
				sum -= i;
			} else {
				sum += i;
			}
			
			if(sum>=100) {
				System.out.println("i=" + i);
				System.out.println("sum=" + sum);
				break;
			}
		}
	}
}
