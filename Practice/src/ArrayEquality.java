import java.util.*;

public class ArrayEquality {

	public static void main(String[] args) {

		int[] arr1 = { 2, 2, 5, 9, 9, 3 };
		int[] arr2 = { 2, 2, 5, 9, 9, 3 };

		HashMap<Integer, Integer> hm1 = new HashMap<>();
		HashMap<Integer, Integer> hm2 = new HashMap<>();

		int m = arr1.length;
		for (int i = 0; i < m; i++) {
			if (hm1.containsKey(arr1[i]))
				hm1.put(arr1[i], hm1.get(arr1[i]) + 1);
			else {
				hm1.put(arr1[i], 1);
			}
		}

		int n = arr2.length;
		for (int i = 0; i < n; i++) {
			if (hm2.containsKey(arr2[i]))
				hm2.put(arr1[i], hm2.get(arr2[i]) + 1);
			else {
				hm2.put(arr2[i], 1);
			}
		}

		System.out.println(hm1);
		System.out.println(hm2);
		if (hm1.equals(hm2))
			System.out.println("equal");
		else
		System.out.println("not equals");

	}

}
