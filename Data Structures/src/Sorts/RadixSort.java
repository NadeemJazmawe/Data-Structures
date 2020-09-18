package Sorts;

public class RadixSort {

	//for integer numbers
		public static void countingSort0(int[] a) {//O(n+k)
			/** find max and min values **/
			int N = a.length;
			int max = a[0], min = a[0];
			for (int i = 1; i < N; i++){
				if (a[i] > max) max = a[i];
				else if (a[i] < min)  min = a[i];
			}
			int range = max - min + 1;
			/** make count/frequency array for each element **/
			int count[] = new int[range];
			for (int i = 0; i < a.length; i++)
				count[a[i] - min]++;
			
			/** modify original array **/
			int k = 0;
			for (int i = 0; i < count.length; i++) {
				for (int j = 0; j < count[i]; j++) {
					a[k++] = min + i;
				}
			}
		}
		//O(n)+O(3n*log10(max))=O(n*log10(max))
		public static void radixSort( int[] a){
			int i, max = a[0], exp = 1, n = a.length;
			int base = 10;
			int[] temp = new int[n];
			for (i = 1; i < n; i++){//O(n)
				if (a[i] > max) max = a[i];
			}
			while (max/exp > 0){//O(log10(max))
				int[] bucket = new int[base];
				for (i = 0; i < n; i++){//O(n)
					int index = (a[i] / exp) % base;
					bucket[index]++;
				}
				for (i = 1; i < base; i++){//O(base)
					bucket[i] = bucket[i] + bucket[i - 1];
				}
				for (i = n - 1; i >= 0; i--){//O(n)
					//temp[--bucket[(a[i] / exp) % base]] = a[i];
					int j = (a[i] / exp) % base;
					temp[--bucket[j]] = a[i];
				}
				//System.out.println(Arrays.toString(temp));
				for (i = 0; i < n; i++)//O(n)
					a[i] = temp[i];
				exp = exp * base;        
			}
		}
	
}
