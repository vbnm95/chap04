
public class EpochTimeExample {
	public static void main(String[] args) {
		
		long epoch = System.currentTimeMillis()/1000 + 9*60*60; // 초
		long epochDays = epoch/60/60/24; // 일
		
		int year = 1970;
		int month = 0;
		long day = 0;
		
		long hour = epoch/60/60%24;
		long minute = epoch/60%60;
		long second = epoch%60;
		
		int isLeapYear = 0; // 윤년이면 1
		
		// 년도 계산
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
		
		// 월 계산
		int m = 1; // 월 계산 시작용 변수
		
		switch(m) {
			case 1:
				epoch -= 31*24*60*60;
				if(epoch < 0 ) {
					month = 1;
					day = (epoch + 31*24*60*60)/60/60/24 + 1;
					break;
				}
			case 2:
				if(isLeapYear == 1)
					epoch -= 29*24*60*60;
				else
					epoch -= 28*24*60*60;
				if(epoch < 0 ) {
					month = 2;
					day = (epoch + 31*24*60*60)/60/60/24 + 1;
					break;
				}
			case 3:
				epoch -= 31*24*60*60;
				if(epoch < 0 ) {
					month = 3;
					day = (epoch + 31*24*60*60)/60/60/24 + 1;
					break;
				}
			case 4:
				epoch -= 30*24*60*60;
				if(epoch < 0 ) {
					month = 4;
					day = (epoch + 31*24*60*60)/60/60/24 + 1;
					break;
				}
			case 5:
				epoch -= 31*24*60*60;
				if(epoch < 0 ) {
					month = 5;
					day = (epoch + 31*24*60*60)/60/60/24 + 1;
					break;
				}
			case 6:
				epoch -= 30*24*60*60;
				if(epoch < 0 ) {
					month = 6;
					day = (epoch + 31*24*60*60)/60/60/24 + 1;
					break;
				}
			case 7:
				epoch -= 31*24*60*60;
				if(epoch < 0 ) {
					month = 7;
					day = (epoch + 31*24*60*60)/60/60/24 + 1;
					break;
				}
			case 8:
				epoch -= 31*24*60*60;
				if(epoch < 0 ) {
					month = 8;
					day = (epoch + 31*24*60*60)/60/60/24 + 1;
					break;
				}
			case 9:
				epoch -= 30*24*60*60;
				if(epoch < 0 ) {
					month = 9;
					day = (epoch + 31*24*60*60)/60/60/24 + 1;
					break;
				}
			case 10:
				epoch -= 31*24*60*60;
				if(epoch < 0 ) {
					month = 10;
					day = (epoch + 31*24*60*60)/60/60/24 + 1;
					break;
				}
			case 11:
				epoch -= 30*24*60*60;
				if(epoch < 0 ) {
					month = 11;
					day = (epoch + 31*24*60*60)/60/60/24 + 1;
					break;
				}
			case 12:
				epoch -= 31*24*60*60;
				if(epoch < 0 ) {
					month = 12;
					day = (epoch + 31*24*60*60)/60/60/24 + 1;
					break;
				}
			
		}
		
		// 요일 계산
		int dw = (int)(epochDays%7);
		String dstr = null;
		
		switch(dw) {
			case 0:
				dstr = "목요일";
				break;
			case 1:
				dstr = "금요일";
				break;
			case 2:
				dstr = "토요일";
				break;
			case 3:
				dstr = "일요일";
				break;
			case 4:
				dstr = "월요일";
				break;
			case 5:
				dstr = "화요일";
				break;
			case 6:
				dstr = "수요일";
				break;
		}
		
		System.out.printf("%4d/%02d/%02d\t%3s\t%02d:%02d:%02d\n", year, month, day, dstr, hour, minute, second);
	}
}
