import java.util.Arrays;

public class Arraysorting {

	public static void main(String[] args) {
		
		int[] arr= {10,9,33,1,98,3,55,42,87,4};
		System.out.println("before sort:");
	System.out.println(Arrays.toString(arr));
	
	//####### Bubble sort  ##########
//		for(int i=0;i<arr.length-1;i++) {
//			for(int j=i+1;j<arr.length;j++) {
//			if(arr[i]>arr[j]) {
//				int temp=arr[i];
//				arr[i]=arr[j];
//				arr[j]=temp;
//			}
//		}
//		}
//		System.out.println(Arrays.toString(arr));
		
	
	//####### insertion sort  ##########
	
//	for(int i=1;i<arr.length;i++) {
//		int key=arr[i];
//		int j=i-1;
//		while(j>=0 && key<arr[j]) {
//			arr[j+1]=arr[j];
//			j--;
//		}
//		
//		arr[j+1]=key;
//		
//	}
//	System.out.println("after sort:");
//	System.out.println(Arrays.toString(arr));
	
	
	//####### selection sort  ##########
	
	for(int i=0;i<arr.length-1;i++) {
		int minIndex=i;
		for(int j=i+1;j<arr.length;j++) {
		if(arr[j] < arr[minIndex]) {
			minIndex=j;
		}
	}
		//swap
		int temp=arr[minIndex];
		arr[minIndex]=arr[i];
		arr[i]=temp;
	}
	System.out.println(Arrays.toString(arr));
	
	}
}
