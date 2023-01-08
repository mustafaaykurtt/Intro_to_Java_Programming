package chapter_09.exercise_06;

public class StopWatch {
	private long startTime;
	private long endTime;
	
	public StopWatch() {
		startTime = System.currentTimeMillis();
		endTime = System.currentTimeMillis();
	}
	
	public void setEndTime(long endTime) {
		this.endTime = endTime;
	}

	public long getElapsedTime(){
		return endTime - startTime;
	}
}
