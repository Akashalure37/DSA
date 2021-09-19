package in.cdac.acts;

import java.util.Scanner;

public class LinearSearch {

	public static int LinearSearching(int[] arr, int ele) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ele)
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {

			int[] arr = { 2, 7, 9, 1, 52, 49, 92, 71, 87, 23 };

			System.out.println("Array elements:");
			for(int i:arr)
				System.out.print(i+" ");
			
			System.out.println("\neneter element to find:");
			int result = LinearSearching(arr, sc.nextInt());

			if (result == -1) {
				System.out.println("element not found...!");
			} else {
				System.out.println("element found at index : " + result);
			}
		}

	}

}
