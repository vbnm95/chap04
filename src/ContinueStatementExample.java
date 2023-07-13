
public class ContinueStatementExample {
	public static void main(String[] args) {
		int s1 = 0;
		int s2 = 0;
		
		for( int i=1; i<=100; i++) {
			if(i%3==0) {
				s1 += i;
				continue;
			}
			s2 += i;
		}
		
		System.out.println("s1 =" + s1);
		System.out.println("s2 =" + s2);
		System.out.println(s1 + s2);
	}
}
