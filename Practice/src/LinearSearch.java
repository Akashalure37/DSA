

import java.util.Scanner;

public class LinearSearch {



		static int search(int[] arr, int ele) {
	
			for(int i=0;i<arr.length;i++) {
				if(ele == arr[i])
					return i;
			}
			return -1;
		}

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int[] arr= {10,3,7,28,91,22,65,83,71,33};
			int result = search(arr,sc.nextInt());
			
			if(result == -1)
			System.out.println("not found");
			else
				System.out.println("found at "+result);
		
			sc.close();
		}
	}


