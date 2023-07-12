
public class Exercise4_1 {

	public static void main(String[] args) {
		int x = 15;
		if(10 < x && x <20) {
			System.out.println("1 참");
		}
		
		char ch1 = 'A';
		if(ch1 != ' ' && ch1 != '\t') {
			System.out.println("2 참");
		}
		
		char ch2 = 'x';
		if(ch2 == 'x' || ch2 == 'X') {
			System.out.println("3 참");
		}
		
		char ch3 = '9';
		if(48 <= ch3  && ch3 <= 57) {
			System.out.println("4 참");
		}
		
		char ch4 = 'S';
		if(65 <= ch4  && ch4 <= 90 || 97 <= ch4  && ch4 <= 122) {
			System.out.println("5 참");
		}
		
		int year = 2004;
		if((year%4) == 0 && (year%100) != 0 || (year%400) == 0) {
			System.out.println("6 참");
		}
		
		boolean powerOn = false;
		if(!powerOn) {
			System.out.println("7 참");
		}
		
		String str = "yes";
		if(str.equals("yes")) {
			System.out.println("8 참");
		}
	}

}
