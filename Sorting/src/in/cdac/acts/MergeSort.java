package in.cdac.acts;

public class MergeSort {

	static void mergesort(int[] arr, int left, int right) {

		// if partition is invalid or array having single element
		if (left >= right)
			return;

		// divide array into two equal part
		int mid = (left + right) / 2;

		// sort left partition
		mergesort(arr, left, mid);

		// sort right partition
		mergesort(arr, mid + 1, right);

		// create temp array
		int[] temp = new int[right - left + 1];

		// merge two sorted array in temp array
		int i = left, j = mid + 1, k = 0;
		
		// compare elements in two partitions and copy the smaller one
		// until any partition is done
		while (i <= mid && j <= right) {

			if (arr[i] < arr[j])
				temp[k++] = arr[i++];
			else
				temp[k++] = arr[j++];

		}
		
		// copy remaining elements
		while (i <= mid)
			temp[k++] = arr[i++];

		while (j <= right)
			temp[k++] = arr[j++];

		// overwrite the original array with temp array
System.out.println("\ntemp arry:");
		for(int t:temp)
			System.out.print(t+" ");
		
		for (i = 0; i < temp.length; i++)
			arr[left + i] = temp[i];

	}

	public static void main(String[] args) {

		int[] arr = { 1,3,50, 9, 2, 71, 87, 23 ,11};

		System.out.println("Array elements:");
		for (int i : arr)
			System.out.print(i + " ");

		mergesort(arr, 0, arr.length - 1);

		System.out.println("\nMerge sorted Array:");
		for (int i : arr)
			System.out.print(i + " ");

	}
}
