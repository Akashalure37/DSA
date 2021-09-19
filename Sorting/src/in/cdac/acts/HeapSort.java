package in.cdac.acts;

public class HeapSort {

		public void heapSort(int[] arr){//arr= {1,12,9,5,6,10}
			int length=arr.length;
			for(int i=length-1/2;i>=0;i--) {
				
				heapify(arr,length,i);
			}
			
			for(int i=length-1;i>=0;i--)
			{
				int temp=arr[0];
				arr[0]=arr[i];
				arr[i]=temp;
				
				heapify(arr, i, 0);
			}
		}
		public void heapify(int[] arr, int length, int i) {
			 int largest=i;
			 int li=2*i+1;
			 int ri=2*i+2;
			 
			if(li<length && arr[li]>arr[largest])
				largest=li;
			
			if(ri<length && arr[ri]>arr[largest])
				largest=ri;
			
			if(largest!=i)
			{
				int temp=arr[i];
				arr[i]=arr[largest];
				arr[largest]=temp;
				heapify(arr,length,largest);
			}
		}

		public static void main(String[] args) {


			int[] arr= {1,12,9,5,6,10};
			
			HeapSort hs=new HeapSort();
			hs.heapSort(arr);
			
			for(int a: arr)
			{
				System.out.print(a +"  ");
				
			}

		}
	
}
