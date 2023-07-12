
public class TriangleExample {
	public static void main(String[] args) {
		
		System.out.println("1번");
		for(int i=1; i<6; i++) {
			for(int j=0; j<5; j++) {
				if(j<i) {
					System.out.print('*');
				} else {
					break;
				}
			}
			System.out.print('\n');
		}
		
		System.out.println("2번");
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(j<i) {
					System.out.print(' ');
				} else {
					System.out.print('*');
				}
			}
			System.out.print('\n');
		}
		
		System.out.println("3번");
		for(int i=5; i>0; i--) {
			for(int j=0; j<5; j++) {
				if(j<i) {
					System.out.print('*');
				} else {
					break;
				}
			}
			System.out.print('\n');
		}
		
		System.out.println("4번");
		for(int i=0; i<5; i++) {
			for(int j=0; j<4-i; j++) {
				System.out.print(' ');
			}
			for(int k=0; k<i+1; k++) {
				System.out.print('*');
			}
			System.out.print('\n');
		}
		
	}
}
