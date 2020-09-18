package Sorts;

public class FunctionOnArrays {

	/*
	 * This function accept array and check if it sorted
	 */
	public static boolean isSorted(int[] a) {
		for (int i = 1; i < a.length; i++)
			if (a[i] < a[i-1]) return false;
		return true;
	}
	/*
	 * This the standert function to check if value contains in array
	 */
	public static boolean contains(int [] arr, int end, int value){
		boolean ans = false;
		for(int i=0; !ans &&i<=end; i++){
			if (arr[i]==value) ans = true;
		}
		return ans;
	}
	
	/*
	 * Binary search by induction
	 * it should accept a sorted array or it will return -1.
	 * if the array was sorted it will search the value if it found  , the function will return the
	 * index of the value otherwise return -1.
	 */
	public static int binarySearchInducion(int []arr,int value){
		if(!isSorted(arr))
			return -1;
		int low = 0, high = arr.length-1;
		while (low <=high){
			int middle = (low + high)/2;
			if (low == high) {
				if (arr[low] == value) return low;
				else return -1;
			}
			else {
				if (arr[middle] == value){//value was found
					return middle;
				}
				// value suppose to be left
				if (value < arr[middle]){
					high = middle;
				}
	 			// value suppose to be right
				else{
					low = middle+1;
				}
			}
		}
		return -1;
	}
	
	
}
