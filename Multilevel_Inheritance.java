// A.java
public class A {
public void showA() {
System.out.println("Inside the class A method");
}
}

// B.java
public class B extends A {
public void showB() {
System.out.println("Inside the class B method");
}
}

// C.java
public class C extends B {
public void showC() {
System.out.println("Inside the class C method");
}
}

// MultiLevel_Inheritance.java
public class MultiLevel_Inheritance {
public static void main(String[] args) {
C c1 = new C();
c1.showC();
c1.showB();
c1.showA();
}
}
