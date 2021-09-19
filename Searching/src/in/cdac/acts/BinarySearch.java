package in.cdac.acts;

import java.util.Scanner;
//Array should be sorted from binary search 
public class BinarySearch {

	public static int search(int[] arr, int ele) {

		int left = 0, right = arr.length - 1;
		System.out.println("right: " + right);
		while (left <= right) {
			int mid = (left +right) / 2;
			System.out.println("mid: " + mid);
			System.out.println("left :" + left);
			System.out.println("right: " + right);
			// Check if element is present at mid
			if (arr[mid] == ele)
				return mid;

			// If element greater, ignore left half
			if (arr[mid] < ele)
				left = mid + 1;

			// If element is smaller, ignore right half
			else
				right = mid - 1;
		}

		// if we reach here, then element was
		// not present
		return -1;
	}

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {

			int[] arr = { 10, 20, 25, 30, 42, 57, 61, 76, 82, 97 };

			System.out.println("Array elements:");
			for (int i : arr)
				System.out.print(i + " ");

			System.out.println("\neneter element to find:");
			int result = search(arr, sc.nextInt());

			if (result == -1) {
				System.out.println("element not found...!");
			} else {
				System.out.println("element found at index : " + result);
			}
		}

	}

}
