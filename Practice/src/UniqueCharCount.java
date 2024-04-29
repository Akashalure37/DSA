import java.util.*;

public class UniqueCharCount {

	private static int uniqueChar(String _str){
		Set<Character> uniquecharSet = new HashSet<Character>();
		for (char ch : _str.toCharArray()) {
			uniquecharSet.add(ch);
		}
		//System.out.println(uniquecharSet);
		return uniquecharSet.size();
	}
	public static void main(String[] args) {
		System.out.println("Unique Char Count: " + uniqueChar("akisdaks"));
	}
}
