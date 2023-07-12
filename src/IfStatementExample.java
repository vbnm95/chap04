
public class IfStatementExample {
	public static void main(String[] args) {
		
		int jumsu = (int)(Math.random()*51 + 50);
		String grade = null;
		
		if(90<=jumsu)
			grade = "A";
		else if(80<=jumsu)
			grade = "B";
		else if(70<=jumsu)
			grade = "C";
		else if(60<=jumsu)
			grade = "D";
		else
			grade = "F";
		
		System.out.printf("%d = %s\n", jumsu, grade);
		
//		if(90<=jumsu && jumsu<=100)
//			System.out.println("A");
//		else if(80<=jumsu && jumsu<90)
//			System.out.println("B");
//		else if(70<=jumsu && jumsu<80)
//			System.out.println("C");
//		else if(60<=jumsu && jumsu<70)
//			System.out.println("D");
//		else
//			System.out.println("F");
//		
		
//		System.out.println("Hello");
//		
//		int n = 99;
//		
//		if(n%3 == 0) {
//			System.out.println("if문 수행");
//		}
//		
//		System.out.println("Program End ...");
	}
}
