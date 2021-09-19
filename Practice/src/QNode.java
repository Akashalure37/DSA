
public class QNode {

	int data;
	QNode next;

	public QNode(int data) {
		this.data = data;
		next = null;
	}

	class queue {

		QNode front;
		QNode rear;

		public queue() {
			rear = front = null;
		}

		void enQueue(int ele) {
			QNode temp = new QNode(ele);

			if (rear == null) {
				rear = front = temp;
				return;
			}
			this.rear.next = temp;
			this.rear = temp;
		}

		void deQueue() {

			if (this.front == null)
				return;

			this.front = front.next;

			if (front == null)
				rear = null;

		}

	}
}
	

