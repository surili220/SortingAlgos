package DivideAndConquerAlgo;


/// This code uses last element as the Pivot
// average time complexity O(n logn)
/*
 * 1)Pick A pivot
 * 2)partition the array. All the elements to left of pivot must be smaller than pivot , 
 * all the elemnts to right of pivot must be grater than pivot.
 * 
 * Link : https://www.youtube.com/watch?v=h8eyY7dIiN4&list=PLkeaG1zpPTHhXOfy-mFbdqd1Zz4GnjcpC&index=6
 * 
 * Left Pointer pointing to numbers greater than pivot. Right Pointer pointing to numbers less than pivot.
 * Swap when numbers found.
 * 
 * 
 * */

/// Quick Sort in its general form is an in-place sort (i.e. it doesn’t require any extra storage)


public class QuickSort {

	public static void main(String[] args) {
		
		int []array = new int[]{8, 3, 9, 6, 5,1};
		
		quickSort(array, 0, array.length-1);
	}
	
	public static void quickSort(int array[], int lowIndex, int highIndex) {
		
		int pivot = array[highIndex];
		int leftPointer = lowIndex;
		int rightPointer = highIndex;
		
		while(leftPointer < rightPointer) { // unles and until leftPointer= rightPointer the loopwill go on
			
			if(lowIndex>=highIndex) { // only one lement is there. simply return. its already sorted.
				return;
			}
			
			
			while(array[leftPointer]>= pivot && leftPointer <rightPointer) {
				leftPointer++;
		
			}
			while(array[rightPointer]<= pivot && leftPointer <rightPointer) {
				rightPointer--;
		
			}
			swap(array, leftPointer, rightPointer);
			
		}
		
		swap(array, leftPointer, highIndex); // swap the value of leftPointer with the pivot. 
		
		quickSort(array, lowIndex, leftPointer-1);
		
		quickSort(array, rightPointer+1, highIndex); //recursively calling quicksort
		
	}
	
	public static void swap(int array[], int lowIndex, int highIndex ) {
		
		int temp = array[lowIndex];
		array[lowIndex] = array[highIndex];
		array[highIndex] = temp;
	}
	
	
	
	///The worst case time complexity of a typical implementation of QuickSort is O(n2). The worst case occurs when the picked pivot is always an extreme (smallest or largest) element. 
	//This happens when input array is sorted or reverse sorted and either first or last element is picked as pivot.
	
}
