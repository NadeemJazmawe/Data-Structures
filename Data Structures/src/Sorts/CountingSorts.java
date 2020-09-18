package Sorts;

public class CountingSorts {

	//It works by counting the number of objects having distinct key values.
	//Then doing some arithmetic to calculate the position of each object in the output sequence.
	public static void CountingSort (int[] arr) {
		int min=arr[0],  max=arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(arr[i]>max) 
				max = arr[i];
			else if (arr[i]<min) 
				min=arr[i];
		}
		int freq[]=new int[max-min+1];  //גודל הטווח
		for (int i = 0; i < arr.length; i++) {
			freq[arr[i]-min]++;}
		int j=0;
		int i=0;
		while (i<freq.length) {
			if (freq[i]>0) {
				arr[j++]= i+min;
				--freq[i];
			}
			else {
				i++;
			}
		}
	}

}
