package in.cdac.acts;

public class InsertionSort {

	static void sorting(int[] arr) {

		for (int i = 1; i < arr.length; i++) {

			int key=arr[i];
			int j=i-1;
			
			while(j>=0 && arr[j]>key) {
				arr[j+1]=arr[j];
				j--;
				
			}
			arr[j+1]=key;
		}
	}

	public static void main(String[] args) {

		int[] arr = { 2, 7, 9, 1, 52, 49, 92, 71, 87, 23 };

		System.out.println("Array elements:");
		for (int i : arr)
			System.out.print(i + " ");

		sorting(arr);

		System.out.println("\nInsertion sorted Array:");
		for (int i : arr)
			System.out.print(i + " ");

	}

}
