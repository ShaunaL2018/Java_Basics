package java_basics;

public enum Weekdays {
Sunday(1),
Monday(2),
Tuesday(3),
Wednesday(4),
Thursday(5),
Friday(6),
Saturday(7);
	
private int i = 0;

	Weekdays(int i) {
		this.i = i;
	}
	
	static String getDayByValue(int dayValue){
		
		String dayOfWeek = null;
		
		for (Weekdays weekday : Weekdays.values()) {
			if(weekday.getI() == dayValue) {
				dayOfWeek = weekday.toString();
			}
		}
		
		return dayOfWeek;
				
	}
	
	static int getValueByDay(String day){
		
		int dayOfWeek = 0;;
		
		for (Weekdays weekday: Weekdays.values()) {
			if (weekday.toString() == day){
				dayOfWeek = weekday.getI();
			}
		}
		
		return dayOfWeek;
				
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}
	


}
