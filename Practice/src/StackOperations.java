
class Stack {
	int[] arr;
	int top;

	public Stack(int size) {
		arr = new int[size];
		top = -1;
	}

	void push(int ele) {
		if (isFull())
			System.out.println("stack is full..");
		top++;
		arr[top] = ele;
	}

	void pop() {
		if (isEmpty())
			System.out.println("stck is empty...");
		top--;
	}

	int peek() {
		if (isEmpty())
			System.out.println("stack is empty..");
		return arr[top];
	}

	boolean isEmpty() {

		return top == -1;
	}

	boolean isFull() {
		return top == arr.length - 1;
	}

}

public class StackOperations {

	public static void main(String[] args) {

		Stack stack = new Stack(5);
		stack.push(10);
		stack.push(20);
		stack.push(10);
		stack.push(30);
		stack.push(40);
		stack.pop();
		System.out.println( stack.peek() ); 

	}

}
