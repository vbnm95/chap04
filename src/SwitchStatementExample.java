
public class SwitchStatementExample {

	public static void main(String[] args) {
		char ch = (char)(Math.random()*26 + 'A');
		switch(ch) {
			case 'A':
			case 'I':
			case 'E':
			case 'O':
			case 'U':
				System.out.println("모음");
				break;
			default:
				System.out.println("자음");
		}
		System.out.print(ch);
		
//		int n = (int)(Math.random()*5);
//		char ch = ' ';
//		
//		switch(n) {
//			case 0:
//				ch = '도';
//				break;
//				
//			case 1:
//				ch = '개';
//				break;
//				
//			case 2:
//				ch = '걸';
//				break;
//				
//			case 3:
//				ch = '윷';
//				break;
//				
//			case 4:
//				ch = '모';
//				break;
//		}
//		System.out.printf("%d = %c", n, ch);
		
//		if(n == 0)
//			ch = '도';
//		else if(n == 2)
//			ch = '개';
//		else if(n == 3)
//			ch = '걸';
//		else if(n == 4)
//			ch = '윷';
//		else
//			ch = '모';
//		
//		System.out.println(ch);

	}
}