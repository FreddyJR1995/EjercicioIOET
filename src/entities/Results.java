package entities;

import java.util.ArrayList;

public class Results {
	private ArrayList<PairOfEmployees> listOfResults;
	
	public Results(){
		listOfResults = new ArrayList<PairOfEmployees>();
	}

	public Results(ArrayList<PairOfEmployees> listOfResults) {
		super();
		this.listOfResults = listOfResults;
	}

	public ArrayList<PairOfEmployees> getListOfResults() {
		return listOfResults;
	}

	public void setListOfResults(ArrayList<PairOfEmployees> listOfResults) {
		this.listOfResults = listOfResults;
	}
	
	public void addPair(String name1,String name2, int count){
		PairOfEmployees newPair=new PairOfEmployees();
		if(listOfResults.isEmpty()){
			newPair = new PairOfEmployees(name1,name2,count);
		}else{
			for(PairOfEmployees p:listOfResults){
				if((name1!=p.getName1() && name2!=p.getName2())||(name2!=p.getName1()&&name1!=p.getName2())){
					newPair = new PairOfEmployees(name1,name2,count);
					break;
				}
			}
		}
		listOfResults.add(newPair);
		
	}	
	
}
