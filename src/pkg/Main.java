package pkg;


public class Main {
	public static int count;
	public static void main(String[] args) {

		//initialize array
		int[] arr = new int[10];
		//fills array with random integers between 1-1000
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*1000 + 1);
		}

		System.out.println("Unsorted array:\t");
		printArray(arr);
		System.out.println();
		
		System.out.println("Implementing bubble sort...");
		bubbleSort(arr);
		
//		System.out.println("Implementing quicksort...");
//		quickSort(arr, 0, arr.length-1);
		
//		System.out.println("Implementing mergeSort...");
//		mergeSort(arr, 0, (1+arr.length-1)/2, arr.length-1);
		
//		System.out.println("Implementing binarySearch...");
//		binarySearch(arr);
		
//		System.out.println("Implementing insertionSort...");
//		insertionSort(arr);
		
//		System.out.println("Implementing selectionSort...");
//		selectionSort(arr);
		
//		System.out.println("Implementing heapSort...");
//		heapSort(arr);
		
//		System.out.println("Implementing radixSort...");
//		radixSort(arr);
		
		System.out.println();
		System.out.println("Sorted array:\t");
		printArray(arr);

		System.out.println("Number of iterations: " + count);

	}

	//prints the array
	static void printArray(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			//limits 20 elements per line
			if(i > 0 && i % 20 == 0) {
				System.out.println(arr[i] + " ");
			}
			else {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();
	}

	//prints every iteration of array
	static void printIteration(int[] arr, int i) {
		//		System.out.println("loop iteration: " + i + "\t ");
		printArray(arr);
		System.out.println();
	}
	
	static void swap(int[] arr, int i, int j) {
		if(arr[i] > arr[j]) {
			int tmp = arr[i];
			arr[i] = arr[j];
			arr[j] = tmp;
		}
	}

	/* 
	 * bubblesort algorithm (UNOPTIMIZED):
	 * 
	 * 	This algorithm sorts the arrow from least to greatest by comparing the values of two elements with each other.
	 * 	If the left element has a greater value than the right element, then their positions are switched. Then,
	 * 	the algorithm moves down an index of one, and continues to traverse through the list to compare every element 
	 * 	with the element to the right until the end of the list is reached. The process is repeated (n^2 - n) number of times
	 * 	with n elements in the list. This algorithm will always have a runtime of O(n^2).
	 **/
	static void bubbleSort(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				if(j+1 >= arr.length) {
					break;
				}
				else {
					swap(arr, j, j+1);
				}
				printArray(arr);
				count++;
			}
		}
	}
	
	/*quickSort algorithm:
	 * 
	 *	This algorithm works by choosing an element in the list to be the pivot, in this case, the last element of the list.
	 *	The list is then run through the partition function to group all elements that have a value smaller than the pivot
	 *	on the left of the pivot, and elements larger than the pivot on the right of the pivot. This divide and conquer 
	 *	algorithm then recursively runs the partition algorithm until the list is sorted.
	 **/
	static void quickSort(int[] arr, int low, int high) {
		//testing if user input is acceptable, also stops recursive looping
		if(low < high) {
			printArray(arr);
			count++;
			int partition = partition(arr, low, high);
			quickSort(arr, low, partition - 1);
			quickSort(arr, partition + 1, high);
			
		}
		
	}
	
	static int partition(int[] arr, int low, int high) {
		//last element in chunk
		int pivot = arr[high];
		//index of smallest index - 1
		int i = low - 1;
		
		for(int j = low; j <= high - 1; j++) {
			if(arr[j] <= pivot) {
				i++;
				swap(arr, i, j);
			}
		}
		swap(arr, i+1, high);
		
		return i+1;
	}
	
	static void mergeSort(int[] arr, int l, int m, int r){
		int s1 = m - l + 1;
		int s2 = r - m ;
		
		
		
	}
	
	
	
}




