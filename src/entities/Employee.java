package entities;

import java.util.ArrayList;

public class Employee {

	public String name;
	public ArrayList<Schedule> schedule;
	
	public Employee(){
		schedule= new ArrayList<Schedule>();
	}
	public Employee(String name, ArrayList<Schedule> schedule) {
		super();
		this.name = name;
		this.schedule = schedule;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Schedule> getSchedule() {
		return schedule;
	}
	public void setSchedule(ArrayList<Schedule> schedule) {
		this.schedule = schedule;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", schedule=" + schedule + "]";
	}
	
	
	
}
