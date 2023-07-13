
public class VT100Example2 {
	public static void main(String[] args) throws InterruptedException {
		for(int i=0; i<5000; i++) {
			System.out.print("\033[2J");
			System.out.print("\033[0m");
			
			int line = (int)(Math.random()*20 + 1);
			int column = (int)(Math.random()*40 + 1);
			int fg = (int)(Math.random()*8 + 30);
			int bg = (int)(Math.random()*8 + 40);
			char ch = (char)(Math.random()*26 + 'A');
			
			//System.out.printf("\033[%d;%dH", line, column);
			//System.out.printf("\033[%dm", fg);
			//System.out.printf("\033[%dm", bg);
			
			System.out.printf("\033[%d;%dH", line, column);
	       System.out.printf("\033[%dm", fg);
	       System.out.printf("\033[%dm", bg);
	       System.out.print(ch);
	       Thread.sleep(10);
	       
			/*
	        System.out.print("\033[2J");        // 1. Clear Screen
	        System.out.print("\033[10;10H");    // 2. Cursor Move
	        System.out.print("\033[31m");       // 3. Foreground Color
	        System.out.print("\033[44m");       // 4. Background Color
	        System.out.print("Hello VT100!");
	        System.out.print("\033[0m");        // 5. Reset Color
			*/
		}
		
		System.out.print("\033[0m");
		System.out.print("\033[21;1H");
		System.out.print("Program End");
	}
}
