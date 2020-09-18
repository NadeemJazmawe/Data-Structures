package Sorts;

public class SelectionSorts {

	//The selection sort algorithm sorts an array by repeatedly finding the minimum element from unsorted part and putting it at the beginning.
		public static void SelectionSort (int[] arr) {
			int minIndex;
			for (int i = 0; i < arr.length; i++) {
				minIndex= findMinIndex (arr,i);
				swap (arr,i, minIndex);
			}
		}
		
		public static int findMinIndex (int[]arr, int start) {
			int minIndex= start;
			for (int j = start+1; j < arr.length; j++) {
				if(arr[j] < arr[minIndex]) {
					minIndex=j;
				}
			}
			return minIndex;
		}
		
		public static void swap ( int[] arr, int i, int j) {
			int temp= arr[i];
			arr[i]= arr[j];
			arr[j]=temp;

		}
	
}
