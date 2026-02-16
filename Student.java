
public class Student {
	private int rollNo;
	private String name;
	private String branch;
	
	public void setStudent(int rollNo,String name,String branch) {
		rollNo = rollNo; //Right side value is local variable and left side values are instance variable 
		name = name;
		branch = branch;
	}
	public void getStudent() {
		System.out.println("Roll Number is "+rollNo);
		System.out.println("Name is "+name);
		System.out.println("Branch is "+branch);
	}
}
