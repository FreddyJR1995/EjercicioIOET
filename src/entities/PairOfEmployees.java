package entities;

public class PairOfEmployees {

	private String name1;
	private String name2;
	private int count;
	
	public PairOfEmployees(){
		
	}
	
	public PairOfEmployees(String name1, String name2,int count) {
		super();
		this.name1 = name1;
		this.name2 = name2;
		this.count=count;
	}

	public String getName1() {
		return name1;
	}

	public void setName1(String name1) {
		this.name1 = name1;
	}

	public String getName2() {
		return name2;
	}

	public void setName2(String name2) {
		this.name2 = name2;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return name1 + " - " + name2 + ": " + count;
	}
	
	
	
}
