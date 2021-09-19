package in.cdac.acts;

public class SelectionSort {

	static void sorting(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {

			int minIndex = i;

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[j] < arr[minIndex])
					minIndex = j;
			}

			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;

		}

	}

	public static void main(String[] args) {

		int[] arr = { 2, 7, 9, 1, 52, 49, 92, 71, 87, 23 };

		System.out.println("Array elements:");
		for (int i : arr)
			System.out.print(i + " ");

		sorting(arr);

		System.out.println("\nSelection sorted Array:");
		for (int i : arr)
			System.out.print(i + " ");

	}

}
