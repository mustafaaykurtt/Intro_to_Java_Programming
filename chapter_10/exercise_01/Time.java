package chapter_10.exercise_01;

public class Time {
	private long hour;
	private long minute;
	private long seconds;
	
	
	public Time() {
		this(System.currentTimeMillis());
	}
	
	public Time(Long timeMillis) {
		setTime(timeMillis);
	}

	public void setTime(Long timeMillis) {
		long sumSeconds = (timeMillis / 1000);
		seconds = sumSeconds % 60;
		long sumMinutes = sumSeconds / 60;
		minute = sumMinutes % 60;
		long sumHour = sumMinutes / 60;
		hour = (sumHour % 24) ;
	}

	public long getHour() {
		return hour;
	}

	public long getMinute() {
		return minute;
	}

	public long getSeconds() {
		return seconds;
	}
}
