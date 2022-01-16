package fileRead;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import entities.Employee;
import entities.Schedule;

public class EmployeeSchedule {
	
	private String rutaArchivo;
	
	public EmployeeSchedule(String rutaArchivo) {
		this.rutaArchivo = rutaArchivo;
	}
	
	public ArrayList<Employee> read(){
		File file = new File(rutaArchivo);
		BufferedReader br = null;
		FileReader fileReader = null;
		ArrayList<Employee> employees=new ArrayList<Employee>();
		String linea = "";
		String[] partes;
		Employee emp;
		try{
			fileReader = new FileReader(file);
			br = new BufferedReader(fileReader);
			while ((linea = br.readLine()) != null) {
				String name;
				String schedules;
				partes = linea.split("=");
				name=partes[0];
				schedules=partes[1];
				String[] hours;
				hours=schedules.split(",");
				ArrayList<Schedule> scheduleForEmpl =new ArrayList<Schedule>();
				for(String s:hours){
					Schedule sch=new Schedule(s.replace(" ",""));
					scheduleForEmpl.add(sch);
				}
				emp= new Employee(name, scheduleForEmpl);
				employees.add(emp);
			}
			
		}catch(Exception e){
			System.out.println(e);
		}finally{
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (fileReader != null) {
				try {
					fileReader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return employees;
	}
	

}
