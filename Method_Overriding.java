/*
METHOD OVERRIDING : It is also a type of Polymorphism 
The compiler will override class One show method with class Two show method
/*


public class OOverriding_Main{
  public static void main(String args[]){
    Two t1 = new Two();
    t1.show();
  }
}

public class One{
  public void show()
  {
    System.out.println("Inside class one show method");
  }
}

public class Two extends One{
  public void show()
  {
    System.out.println("Inside class Two show method");
  }
}
