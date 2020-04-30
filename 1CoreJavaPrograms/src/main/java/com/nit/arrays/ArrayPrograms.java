package com.nit.arrays;

public class ArrayPrograms {

	public static void iterate(int[] arr) {
		// accessing elements from array
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		System.out.println();
		// accessing elements in reverse order
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i]);
		}

	}

	public static int[] reverse(int[] arr) {
		if (arr == null || arr.length == 1) {
			return arr;
		}
		for (int i = 0; i < arr.length / 2; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
		}

		return arr;
	}

	public static int[] insert(int[] arr, int pos, int ele) {
		pos = pos - 1;
		int[] newArr = new int[arr.length + 1];

		for (int i = arr.length - 1; i >= pos; i--) {
			newArr[i + 1] = arr[i];
		}

		newArr[pos] = ele;

		for (int i = pos - 1; i >= 0; i--) {
			newArr[i] = arr[i];
		}
		arr = newArr;
		return arr;
	}

	// int[] arr ={10, 20, 30, 40, 50}
	public static int[] delete(int[] arr, int pos) {

		pos = pos - 1; // pos = 2
		int[] newArray = new int[arr.length - 1];
		for (int i = arr.length - 1; i > pos; i--) {
			newArray[i - 1] = arr[i];

		}
		pos--;
		for (int i = pos; i >= 0; i--) {
			newArray[i] = arr[i];
		}
		arr = newArray;
		return arr;
	}

	// This method returns zero for null array or if array length is zero
	public static int findMax(int[] arr) {

		if ((arr == null) || (arr.length == 0)) {
			return 0;
		}

		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		return max;
	}

	public static int findMin(int[] arr) {
		if ((arr == null) || (arr.length == 0))
			return 0;
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}

		return min;
	}

	public static int findSecondMax(int[] arr) {

		if (arr == null || arr.length <= 1)
			return 0;

		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > first) {
				second = first;
				first = arr[i];
			} else if (arr[i] > second && arr[i] != first) {
				second = arr[i];
			}
		}

		return second;
	}

	public static int findSecondMin(int[] arr) {
		if (arr == null || arr.length <= 1)
			return 0;
		int first = Integer.MAX_VALUE; // 50 10
		int second = Integer.MAX_VALUE; // max 50

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < first) {
				second = first;
				first = arr[i];
			} else if (arr[i] < second && arr[i] != first) {
				second = arr[i];
			}
		}

		return second;
	}

	// sorting array
	public static int[] sort(int[] arr) {

		if (arr == null || arr.length == 1) {
			return arr;
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		return arr;
	}

	public static int removeDuplicateElements(int arr[], int n) {
		if (n == 0 || n == 1) {
			return n;
		}

		int[] temp = new int[n];
		int j = 0;

		for (int i = 0; i < n - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				temp[j++] = arr[i];
			}
		}

		temp[j++] = arr[n - 1];
		System.out.println("j=" + j);

		// Changing original array
		for (int i = 0; i < j; i++) {
			arr[i] = temp[i];
		}
		return j;
	}

	public static boolean checkEqual(int[] i1, int[] i2) {
		
		if(i1.length!=i2.length)
			return false;
		
		for (int i = 0; i < i1.length; i++) {
			if (i1[i] != i2[i]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		int[] res = reverse(arr);
		for (int i : res) {
			System.out.print(i + " ");
		}
	}

}
