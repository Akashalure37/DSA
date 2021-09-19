import java.util.ArrayList;
import java.util.List;

public class DLL_ImpleClass implements DLL_Interface {

	private Node head;
	private Node tail;

	public DLL_ImpleClass() {
		head = null;
		tail = null;
	}

	@Override
	public void addAtFront(int ele) {
		Node newNode = new Node(ele);
		if (head == null) {
			head = newNode;
			tail = newNode;
			return;
		}
		newNode.next = head;
		head.Prev = newNode;
		head = newNode;
	}

	@Override
	public void addAtRear(int ele) {

		Node newNode = new Node(ele);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {

			tail.next = newNode;
			newNode.Prev = tail;
			tail = newNode;
		}
		System.out.println("tail :" + tail.data);
	}

	@Override
	public void delete(int ele) {
		Node currNode = head;
		if (head == null) {
			System.out.println("list is empty");
			return;
		}
		if (head.data == ele) {
			head = head.next;
			head.Prev = null;
		}

		if (head == tail)
			head = tail = null;

		while (currNode != null && currNode.data != ele) {

			if (currNode.next == null) {
				System.out.println("element not found !!");
				return;

			}
			currNode = currNode.next;

			if (currNode == tail) {

				tail = currNode.Prev;
				tail.next = null;
				currNode.Prev = null;

				return;
			}
		}
	}

	@Override
	public void removeDuplicate() {
		Node currNode = head;
		Node nextNode;
		if (head == null)
			return;
		while (currNode != null) {
			nextNode = currNode.next;
			while (nextNode != null) {
				if (currNode.data == nextNode.data) {
					if (nextNode == tail) {
						tail = nextNode.Prev;
						tail.next = null;
						return;
					} else {
						nextNode.next.Prev = nextNode.Prev;

						nextNode = nextNode.next;

						nextNode.Prev.next = nextNode;
					}
				}
				nextNode = nextNode.next;
			}
			currNode = currNode.next;

		}

	}

	@Override
	public List<Integer> getAllElements() {
		List<Integer> elements = new ArrayList<>();
		Node currNode = head;
		while (currNode != null) {
			elements.add(currNode.data);
			currNode = currNode.next;
		}
		return elements;
	}

}
