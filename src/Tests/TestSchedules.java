package Tests;

import java.util.ArrayList;

import entities.Employee;
import entities.PairOfEmployees;
import entities.Results;
import entities.Schedule;
import fileRead.EmployeeSchedule;

public class TestSchedules {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Employee> employees=new ArrayList<Employee>();

		EmployeeSchedule emps=new EmployeeSchedule("C:\\empleados\\empleados1.txt");
		try {
			employees=emps.read();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Results r=new Results();
		
		for(int i=0; i<employees.size();i++){
			for(int j=i;j<employees.size();j++){
				if(employees.get(i).getName()!= employees.get(j).getName()){
					int count=compareSchedules(employees.get(i).getSchedule(),employees.get(j).getSchedule());
					r.addPair(employees.get(i).getName(), employees.get(j).getName(),count);
				}
			}
		}
		showResults(r);
		
	}
	
	public static int compareSchedules(ArrayList<Schedule> schedules1, ArrayList<Schedule> schedules2){
		int cont=0;		
		for(Schedule s:schedules1){
			String sch1=s.getSchedule().toString();
			for(Schedule s2:schedules2){
				String sch2=s2.getSchedule().toString();
				if(sch1.equals(sch2)){
					cont++;
				}
			}
		}
		return cont;
	}
	
	public static void showResults(Results r){
		ArrayList<PairOfEmployees> results=r.getListOfResults();
		for(int i=0;i<results.size();i++){
			if(results.size()>=0){
				System.out.println(results.get(i));
			}else{
				System.out.println("No hay registros");
			}	
		}
	}
	

}
