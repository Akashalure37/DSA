
public class LLTester {

	public static void main(String[] args) {
		
		LLClass list=new LLClass();
		list.addAtFront(10);
		list.addAtFront(20);
		list.addAtFront(40);
		list.addAtFront(30);
		
		System.out.println(list.getAllElements());
		
		list.addAtRear(50);
		list.addAtRear(70);
		list.addAtRear(60);
		list.addAtRear(50);
		list.addAtRear(70);
		list.addAtRear(60);
		System.out.println(list.getAllElements());
		
	
		list.addAtPos(90, 1);
		list.addAtPos(90, 3);
		
		System.out.println(list.getAllElements());
		
		list.deleteElement(90);
		System.out.println(list.getAllElements());
		
		list.deleteByPos(2);
		System.out.println(list.getAllElements());
		
		list.removeDuplicateElement();
		System.out.println("Duplicate removed"+list.getAllElements());
	}
}
