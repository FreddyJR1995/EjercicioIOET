package entities;

public class Schedule {
	
	private String schedule;
	
	public Schedule(){
		
	}

	public Schedule(String schedule) {
		super();
		this.schedule = schedule;
	}

	public String getSchedule() {
		return schedule;
	}

	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}

	@Override
	public String toString() {
		return "Schedule [schedule=" + schedule + "]";
	}
	
	
}
