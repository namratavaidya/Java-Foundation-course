public class Stuent {
	private int rollNo;
	private String name;
	private String branch; // these all are instance variables

  public void setStudent(int rollNo, String name, String branch){
    rollNo = rollNo; // here, private variable = public variable
      name = name; // instance = local
    branch = branch;
  }

  public void getStudent()
  {
    System.out.println("Roll Number is " +rollNo);
    System.out.println("Name is " +name);
    System.out.println("Branch is " +branch);
  }
//----------------------------------------------------------------------------------------------------------------
public class StuentMain {
	public static void main(String[] args) {
		Stuent s1 = new Stuent();
		s1.rollNo = 100;
		s1.name = "Abcd";
		s1.branch = "CSE";
		
		System.out.println("Roll number is " +s1.rollNo);
		System.out.println("Name is " +s1.name);
		System.out.println("Branch is "+ s1.branch);
		
		Stuent s2 = new Stuent();
		s2.rollNo = 101;
		s2.name = "jaeg";
		s2.branch = "CSE";
		
		System.out.println("Roll number is " +s2.rollNo);
		System.out.println("Name is " +s2.name);
		System.out.println("Branch is "+ s2.branch);
		}
}
