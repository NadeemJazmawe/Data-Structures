package Sorts;

public class BubbleSorts {

	//Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in wrong order.
	public static void bubbleSort(int[] arr){
		boolean flag = true;
		for (int i = 0 ; flag && i < arr.length ; i++){
			flag = false;
			for (int j = 0 ; j < arr.length-1-i ; j++){
				if(arr[j] > arr[j+1]){
					flag = true;
					swap(arr , i , j);				
				}
			}
		}		
	}

	private static void swap ( int[] arr, int i, int j) {
		int temp= arr[i];
		arr[i]= arr[j];
		arr[j]=temp;
	}

	public static void bubbleSortReverse(int[] arr){
		boolean flag = true;
		for (int i = 0 ; flag && i < arr.length ; i++){
			flag = false;
			for (int j = arr.length-1 ; j > i ; j--){
				if(arr[j-1] < arr[j]){
					flag = true;
					swap(arr , i , j);				
					//						int temp = arr[j];
					//						arr[j] = arr[j-1];
					//						arr[j-1] = temp;
				}
			}
		}		
	}

}
