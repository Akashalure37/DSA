//Find Mid of linkedList
class SinglyList {
	
	//Node
	static class Node {
		private int data;
		private Node next;

		public Node() {
			this.data = 0;
			this.next = null;
		}

		public Node(int val) {
			this.data = val;
			this.next = null;
		}
	}

	private Node head;

	public SinglyList() {
		head = null;
	}

	/// add last

	public void addLast(int val) {
		Node newNode = new Node(val);
		if (head == null)
			head = newNode;
		else {
			Node trav = head;
			while (trav.next != null)
				trav = trav.next;
			trav.next = newNode;
		}
	}

	// display

	public void display() {
		System.out.print("List: ");
		Node trav = head;
		while (trav != null) {
			System.out.print(trav.data + " -> ");
			trav = trav.next;
		}
		System.out.println("");
	}

//find mid
	public int findMid() {
		Node fast = head, slow = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow.data;
	}
}

public class LinkedList {
	public static void main(String[] args) {
		SinglyList list = new SinglyList();
		list.addLast(10);
		list.addLast(20);
		list.addLast(30);
		list.addLast(40);
		list.addLast(50);
		list.addLast(50);
		list.display();


		System.out.println("Middle: " + list.findMid());
	}
}
