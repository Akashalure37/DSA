package in.cdac.acts;

public class QuickSort {

	
	public static void quickSort(int[] arr, int start, int end) {

		//single element condition
		if(arr.length == 1)
			return;
		
		System.out.println("\nArray elements : ");
		for(int i=start;i<=end;i++)
			System.out.print(arr[i]+" ");
		
		int pivot, left, right;
		pivot = start;
		left = pivot+1 ;
		right = end;

		//if left is less than right
		while (left <= right) {
			
			System.out.println("\nPivot : " + pivot + " " + arr[pivot]);
			System.out.println("Left  : " + left + " " + arr[left]);
			System.out.println("Right : " + right + " " + arr[right]);

			//while left element is less than pivot element
			while (left < arr.length && arr[left] < arr[pivot]) {
				left++;
			}

			//while right element is greater then pivot element
			while (right >= 0 && arr[right] > arr[pivot]) {
				right--;
			}
			
			//swap left index & right index values
			if(left <= right) {
				
				swap(arr, left, right);
				
			}
		}

		//swap pivot index element & right index element 
		swap(arr, pivot, right);

		System.out.println("\nstart:"+start+"left: "+left+" right:"+right);
		//if start index is less than end index
		if (start < (right - 1)) {
			quickSort(arr, 0, right - 1);
			
		}
		
		if (end > (right + 1)) {
		 	quickSort(arr, right + 1, (arr.length - 1));
		 	System.out.println("\nend:"+end+" right:"+right);

		}
	}

	static void swap(int[] arr, int a, int b) {
		int temp;
		temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
		System.out.println("\nAfter swap : ");
		for(int num : arr)
			System.out.print(num+" ");
	}
	
	public static void main(String[] args) {

		int[] arr = new int[6];

		arr[0] = 5;
		arr[1] = 1;
		arr[2] = 9;
		arr[3] = 3;
		arr[4] = 2;
		arr[5] = 7;

		System.out.println("Array before sorting : ");
		for (int num : arr)
			System.out.print(num + " ");
		System.out.println();
		for (int i=0;i<arr.length;i++)
			System.out.print(i + " ");

		System.out.println();

		quickSort(arr, 0, (arr.length - 1));

		System.out.println("\n\nAfter sort");
		for (int num : arr)
			System.out.print(num + " ");

	}


}