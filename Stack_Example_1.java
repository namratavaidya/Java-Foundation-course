import java.util.Stack;


public class Stack_Example {
	public static void main(String[] args) {
		Stack <String> stack = new Stack <String>();
		stack.push("Java");
		stack.push("Python");
		stack.push("C++");
		stack.push("DBMS");
		System.out.println(stack);
		System.out.println(stack.peek());
		stack.pop();
		System.out.println(stack);

	}
}
