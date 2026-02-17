public class Student {
	private int rollNo;
	private String name;
	private String branch;
	
	public void setStudent(int rollNo,String name,String branch) {
		this.rollNo = rollNo; //Right side value is local variable and left side values are instance variable 
		this.name = name; //After adding this compiler get to know the difference between instance and local variable.
		this.branch = branch;
	}
	public void getStudent() {
		System.out.println("Roll Number is "+rollNo);
		System.out.println("Name is "+name);
		System.out.println("Branch is "+branch);
	}
}
