package chapter_13.exercise_08;

public class TestMyStack {
	public static void main(String[] args) throws CloneNotSupportedException {
		MyStack stack = new MyStack();

		stack.push(3);
		stack.push(5);
		stack.push(Integer.valueOf(8));

		MyStack stack2 = (MyStack) stack.clone();
		stack.pop();

		System.out.println(stack);
		System.out.println(stack2);
	}
}
