import java.util.ArrayList;
import java.util.List;


public class LLClass implements InterfaceLL {

	private Node head;

	public LLClass() {
		head = null;
	}

	@Override
	public void addAtFront(int ele) {

		Node newNode = new Node(ele);

		newNode.next = head;
		head = newNode;

	}

	@Override
	public void addAtRear(int ele) {

		Node newNode = new Node(ele);

		if (head == null)
			head = newNode;
		else{
			Node trav = head;
			while (trav.next != null)
				trav = trav.next;

			trav.next = newNode;
		}
	}

	@Override
	public void addAtPos(int ele,int pos) {
		
		
		if(head==null || pos<=1) {
		addAtFront(ele);
		}
		else {
			Node newNode=new Node(ele);
			Node trav=head;
			for(int i=1;i<pos-1;i++) {
				if(trav.next==null)
					break;
				trav=trav.next;
			}
			newNode.next=trav.next;
			trav.next=newNode;
			
		}
		
	}
	
	@Override
	public void deleteFromFront() {
		
	if(head==null)
		System.out.println("list is empty");
	head=head.next;

	}

	@Override
	public void deleteFromRear() {
		if(head==null)
			System.out.println("list is empty");
		if(head.next==null)
			head=null;
		else {
			Node tempNode=null;
			Node travNode=head;
			while(travNode.next!=null) {
				tempNode=travNode;
			travNode=travNode.next;
			}
			tempNode.next=null;
		}

	}

	@Override
	public void deleteElement(int ele) {
		Node travNode=head;
		Node prev=null;
		if(head.data==ele && head!=null)
			deleteFromFront();
		else {
			while(travNode.next!=null ) {
				prev=travNode;
				travNode=travNode.next;
			}
			if(travNode.next==null)
				return;
			else 
				prev.next=travNode.next;//removing element
			
		}
	}

	@Override
	public void deleteByPos(int pos) {
		if(pos==1)
			deleteFromFront();
		if(pos<1 || head==null)
			System.out.println("invalid pos or list is empty");
		else {
			Node temp=null,travNode=head;
			for(int i=1;i<pos;i++) {
				temp=travNode;
				if(travNode==null)
					System.out.println("invalid pos");
				
				travNode=travNode.next;
			}
			temp.next=travNode.next;
		}
		
		
	}
	

	@Override
	public void removeDuplicateElement() {
		Node curNode=head;
		Node tempNode=null;
		Node NextNode=null;
		
		if(curNode==null)
			return;
		else {
		while(curNode!=null) {
			tempNode=curNode;
			NextNode=curNode.next;
			while(NextNode!=null) {
				
					if(curNode.data==NextNode.data)
						tempNode.next=NextNode.next;//skipping the nextNode.data
					
					tempNode=NextNode;//tempNode pointing to NextNode
				
				NextNode=NextNode.next;
			}
			curNode=curNode.next;
			
		}
		}
	}
	
	@Override
	public List<Integer> getAllElements() {
		List<Integer> elements = new ArrayList<>();
		Node trav = head;
		while (trav != null) {
			elements.add(trav.data);
			trav = trav.next;
		}
		return elements;
	}
	

}
