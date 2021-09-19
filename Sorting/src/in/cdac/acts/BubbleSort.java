package in.cdac.acts;

public class BubbleSort {

	 static void sorting(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] > arr[j]) {

					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
			}
		}
	}

	public static void main(String[] args) {

		int[] arr = { 2, 7, 9, 1, 52, 49, 92, 71, 87, 23 };

		System.out.println("Array elements:");
		for (int i : arr)
			System.out.print(i + " ");

		sorting(arr);

		System.out.println("\nBubble sorted Array:");
		for (int i : arr)
			System.out.print(i + " ");

	}

}
