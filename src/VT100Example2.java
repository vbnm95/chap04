/*
System.out.print("\033[2J");        // 1. Clear Screen
System.out.print("\033[10;10H");    // 2. Cursor Move
System.out.print("\033[31m");       // 3. Foreground Color
System.out.print("\033[44m");       // 4. Background Color
System.out.print("Hello VT100!");
System.out.print("\033[0m");        // 5. Reset Color
*/

public class VT100Example2 {
	public static void main(String[] args) throws InterruptedException {
		System.out.printf("\033[0m");
		System.out.printf("\033[2J");
		
		/*
		for(int i=0; i<5000; i++) {
			int line = (int)(Math.random()*20 + 1);
			int column = (int)(Math.random()*40 + 1);
			//int fg = (int)(Math.random()*8 + 30);
			//int bg = (int)(Math.random()*8 + 40);
			int fg = 0;
			int bg = 0;
			char ch = (char)(Math.random()*26 + 'A');
			
			while(true) {
				int randomFg = (int)(Math.random()*8 + 30);
				int randomBg = (int)(Math.random()*8 + 40);
				if(randomFg%10 == randomBg%10) {
					continue;
				} else {
					fg = randomFg;
					bg = randomBg;
					break;
				}
			}
			
			System.out.printf("\033[%d;%dH", line, column);
			System.out.printf("\033[%dm", fg);
			System.out.printf("\033[%dm", bg);
			System.out.printf("%c", ch);
			Thread.sleep(10);
	       
			System.out.printf("\033[1;41H");
			System.out.printf("\033[0m");
			System.out.printf("i = [%5d]", i);
			Thread.sleep(10);
		}
		*/
		
		for(int i=0; i<5000; i++) {
			int line = (int)(Math.random()*31 - 15);
			int column = (int)(Math.random()*31 - 15);
			int fg = 0;
			int bg = 0;
			char ch = (char)(Math.random()*26 + 'A');
			
			while(true) {
				int randomFg = (int)(Math.random()*8 + 30);
				int randomBg = (int)(Math.random()*8 + 40);
				if(randomFg%10 == randomBg%10) {
					continue;
				} else {
					fg = randomFg;
					bg = randomBg;
					break;
				}
			}
			
			if(line*line + column*column < 15*15 ) {
				System.out.printf("\033[%d;%dH", line+15, column+15);
				System.out.printf("\033[%dm", fg);
				System.out.printf("\033[%dm", bg);
				System.out.printf("%c", ch);
				Thread.sleep(10);
				
				System.out.printf("\033[1;31H");
				System.out.printf("\033[0m");
				System.out.printf("i = [%5d]", i);
				Thread.sleep(10);
			}
		}
		
		System.out.print("\033[0m");
		System.out.print("\033[31;1H");
		System.out.print("Program End");
	}
}
