
public class DLL_Tester {
public static void main(String[] args) {
	
	DLL_ImpleClass dlist=new DLL_ImpleClass();
	
	dlist.addAtFront(10);
	dlist.addAtFront(20);
	dlist.addAtFront(30);
	
	System.out.println(dlist.getAllElements());
	
	dlist.addAtRear(40);
	dlist.addAtRear(20);
	dlist.addAtRear(30);
	dlist.addAtRear(50);
	System.out.println(dlist.getAllElements());

//	dlist.delete(30);
//	dlist.delete(30);
//	dlist.delete(20);
//	dlist.delete(20);
//
//	dlist.delete(70);
	
	dlist.removeDuplicate();
	System.out.println("unique:"+dlist.getAllElements());
	
}
}
