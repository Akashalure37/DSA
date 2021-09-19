

class QueueClass{
		int rear,front;
		int[] arr;
		
		public QueueClass(int size){
	
			rear=-1;
			front=-1;
			arr =new int[size];
		}
	
		public boolean isFull() {
			return (front == -1 && rear == arr.length - 1) || 
					(front == rear && front != -1);
		}
		public boolean isEmpty() {
			return (front == rear && front == -1);
		}
		public void push(int val) {
			if(isFull())
				throw new RuntimeException("Queue is Full.");
			rear = (rear + 1) % arr.length;
			arr[rear] = val;
		}
		public void pop() {
			if(isEmpty())
				throw new RuntimeException("Queue is Empty.");
			front = (front + 1) % arr.length;
			if(front == rear) {
				rear = -1;
				front = -1;
			}
		}
		public int peek() {
			if(isEmpty())
				throw new RuntimeException("Queue is Empty.");
			int index = (front + 1) % arr.length;
			return arr[index];
		}
	}


public class CircularQueueImpl {


	
	public static void main(String[] args){
		
		QueueClass queue =new QueueClass(5);
		try {
		
			queue.push(10);
			queue.push(20);
			queue.push(30);
			queue.push(40);
			
			queue.pop();
			queue.pop();
			queue.pop();
			queue.pop();
		
				
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		System.out.println(queue.peek() );
	}
}
