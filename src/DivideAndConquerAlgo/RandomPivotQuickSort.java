package DivideAndConquerAlgo;

import java.util.Random;

//Choses pivot randomly. Algo perfomrs better in average case.

public class RandomPivotQuickSort {
	
	public static void main(String[] args) {
		
		int array[] =  new int [] {88,7,9,6,55,2019, 6666};
		quickSort(array, 0, array.length-1);
	}
	
	public static void quickSort(int arr[], int lowIndex, int highIndex) {
		
		int pivotIndex = new Random().nextInt(highIndex-lowIndex)+ lowIndex; // randomly selects pivot element between low andhighIndex.
		int pivot = arr[pivotIndex];
		
		//swap pivot randomly selected with last element of the array.
		swap( arr, pivotIndex, highIndex);
	}
	
	public static void swap( int arr[], int lowIndex, int highIndex) {
		
		int temp = arr[lowIndex];
		arr[lowIndex]= arr[highIndex];
		arr[highIndex]= temp;
		
		//rest logic same as other quickSort.
		
	}
}
