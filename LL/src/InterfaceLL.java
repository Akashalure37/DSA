import java.util.List;

public interface InterfaceLL {

	void addAtFront(int ele);
	void addAtRear(int ele);
	void addAtPos(int ele,int pos);
	
	void deleteFromFront();
	void deleteFromRear();
	void deleteElement(int ele);
	void deleteByPos(int post);
	
	void removeDuplicateElement();
	
	
	List<Integer> getAllElements();
	
}
