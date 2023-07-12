
public class GuGuDanExample {
	public static void main(String[] args) {
		
		int count = 0;
		int t = 0;
		
		for(int x=1; x<=100; x++) {
			for(int y=1; y<=100; y++) {
				for(int z=1; z<=100; z++) {
					count++;
					if(x*x + y*y == z*z) {
						t++;
						System.out.printf("[%3d, %3d, %3d]\n", x, y, z);
					}
				}
			}
		}
		
		System.out.println(count);
		System.out.println(t);
		
	}
	
	public static void main2(String[] args) {
		int count = 0;
		for(int i=1; i<=9; i++) {
			System.out.println(i + "단");
			for(int j=1; j<=9; j++) {
				if(i*j%2 == 0) {
					System.out.printf("%d * %d = %2d\n", i, j, i*j);
				}
			}
		}
	}
}
