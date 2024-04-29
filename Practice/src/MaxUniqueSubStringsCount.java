import java.util.*;

public class MaxUniqueSubStringsCount {

	private static int uniqueSubStringCount(String _str) {

		Set<String> uniqueSubstringSet = new HashSet<String>();

		for (int i = 0; i <= _str.length(); i++) {
			for (int j = i + 1; j <= _str.length(); j++) {
				//System.out.println(_str.substring(i, j));
				uniqueSubstringSet.add(_str.substring(i, j));
			}
		}
		
		//System.out.println(uniqueSubstringSet);
		return uniqueSubstringSet.size();
	}

	public static void main(String[] args) {

		System.out.println("MaxSubstringCount :" + uniqueSubStringCount("abcd"));
	}
}
