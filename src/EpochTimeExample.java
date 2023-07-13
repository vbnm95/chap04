
public class EpochTimeExample {
	public static void main(String[] args) {
		
		long epoch = System.currentTimeMillis()/1000 + 9*60*60; // 초
		
		int year = 1970;
		int month = 0;
		int m = 1; // 월 계산 시작점
		int isLeapYear = 0; // 윤년이면 1
		
		for(;;) {
			boolean isLeap = ( (year%4)==0 && (year%100)!=0 || (year%400)==0 );
			
			int daysOfYear = isLeap ? 366 : 365;
			
			isLeapYear = isLeap ? 1 : 0;
			
			if(epoch - daysOfYear*24*60*60 >= 0 ) {
				epoch -= daysOfYear*24*60*60;
				year ++;
			} else {
				break;
			}
			
		}
		
		switch(m) {
			case 1:
				epoch -= 31*24*60*60;
				if(epoch < 0 ) {
					month = 1;
					break;
				}
			case 2:
				if(isLeapYear == 1)
					epoch -= 29*24*60*60;
				else
					epoch -= 28*24*60*60;
				if(epoch < 0 ) {
					month = 2;
					break;
				}
			case 3:
				epoch -= 31*24*60*60;
				if(epoch < 0 ) {
					month = 3;
					break;
				}
			case 4:
				epoch -= 30*24*60*60;
				if(epoch < 0 ) {
					month = 4;
					break;
				}
			case 5:
				epoch -= 31*24*60*60;
				if(epoch < 0 ) {
					month = 5;
					break;
				}
			case 6:
				epoch -= 30*24*60*60;
				if(epoch < 0 ) {
					month = 6;
					break;
				}
			case 7:
				epoch -= 31*24*60*60;
				if(epoch < 0 ) {
					month = 7;
					break;
				}
			case 8:
				epoch -= 31*24*60*60;
				if(epoch < 0 ) {
					month = 8;
					break;
				}
			case 9:
				epoch -= 30*24*60*60;
				if(epoch < 0 ) {
					month = 9;
					break;
				}
			case 10:
				epoch -= 31*24*60*60;
				if(epoch < 0 ) {
					month = 10;
					break;
				}
			case 11:
				epoch -= 30*24*60*60;
				if(epoch < 0 ) {
					month = 11;
					break;
				}
			case 12:
				epoch -= 31*24*60*60;
				if(epoch < 0 ) {
					month = 12;
					break;
				}
			
		}
		
		System.out.printf("%d / %d\n", year, month);
	}
}
