

class Queue{
	
	int rear;
	int front;
	int[] arr;
	
	public Queue( int size) {
		rear=-1;
		front=-1;
		arr=new int[size];
	}
	
	void push(int ele) {
		if(isFull())
			System.out.println("queue is full");
		rear++;
		arr[rear]=ele;
	}
	
	void pop() {
		if(isEmpty())
			System.out.println("queue is empty..");
		front++;
	}
	
	int peek() {
		if(isEmpty())
			System.out.println("queue is empty..");
		return arr[front+1];
	}
	boolean isEmpty() {
		return rear==front;
	}
	
	boolean isFull() {
		return rear==arr.length-1;
	}
	
}

public class QueueImpl {

	public static void main(String[] args) {
		Queue q = new Queue(4);
		
		q.push(10);
		q.push(20);
		q.push(30);
		q.push(40);
		
		q.pop();
		
	   System.out.println(q.peek());	
	}
}
