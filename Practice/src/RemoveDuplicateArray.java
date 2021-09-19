import java.util.ArrayList;

public class RemoveDuplicateArray{

	public static <E> ArrayList<E> RemoveDuplicate(ArrayList<E> list){
		
		ArrayList<E> newList =new ArrayList<>();
		
		for(E ele :list)
			if(! newList.contains(ele))
		       newList.add(ele);
		return newList;
	}
	
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		
		list.add("one");
		list.add("two");
		list.add("one");
		list.add("three");
		list.add("four");
		
		System.out.println(list);
		
		System.out.println("later:"+RemoveDuplicate(list));
	}
	
}