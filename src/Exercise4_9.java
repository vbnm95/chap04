
public class Exercise4_9 {
	public static void main(String[] args) {
		int num = 123456789;
		int sum = 0;
		
		int n = 0;
		
		while(num>0) {
			sum += num%10;
			num /= 10;
		}
		
		System.out.println(sum);
	}
	public static void main2(String[] args) {
		String str = "123456789";
		int sum = 0;
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			int n = ch -'0';
			System.out.println(sum+=n);
		}
	}
}
