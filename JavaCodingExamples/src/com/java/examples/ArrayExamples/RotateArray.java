package com.java.examples.ArrayExamples;

class RotateArray 
{
	/*Function to left rotate arr[] of size n by d*/
	void leftRotate(int arr[], int d, int n) 
	{
		int i;
		for (i = 0; i < d; i++)  //left rotate 2 times, for every rotation call method.
			leftRotatebyOne(arr, n);
	}

	void leftRotatebyOne(int arr[], int n) 
	{
		int i, temp;
		temp = arr[0];
		System.out.println(temp);
		for (i = 0; i < n - 1; i++)
			arr[i] = arr[i + 1];
		arr[i] = temp;
		System.out.println(arr[i]);
	}

	/* utility function to print an array */
	void printArray(int arr[], int size) 
	{
		int i;
		for (i = 0; i < size; i++)
			System.out.print(arr[i] + " ");
	}

	// Driver program to test above functions
	public static void main(String[] args) 
	{
		RotateArray rotate = new RotateArray();
		int arr[] = {1, 2, 3, 4, 5, 6, 7};
		rotate.leftRotate(arr, 2, 7);//size is 7 and number of left rotation is 2
		rotate.printArray(arr, 7);
	}
}

// This code has been contributed by Mayank Jaiswal

