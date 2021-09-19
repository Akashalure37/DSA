import java.util.List;

public interface DLL_Interface {

	void addAtFront(int ele);
	void addAtRear(int ele);
	
	void delete(int ele);
	
	List<Integer> getAllElements();
	
	void removeDuplicate();
}
