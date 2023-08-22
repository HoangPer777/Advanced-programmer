package chuong6_1_bai1_52;

/*
 * 1.52 Cho n số nguyên
a) Tìm vị trí và giá trị phần tử lớn nhất của dãy.
b) Tìm vị trí và giá trị phần tử nhỏ nhất của dãy.
a) Tính tổng các phần tử của dãy
 */
import java.util.Arrays;

public class backEnd {
//	Selection sort
	public static void sort(int[] arr) {
		for (int j = 0; j < arr.length; j++) {
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] > arr[i + 1]) {

//					arr[i]+= arr[i+1]; // 3 + 8 = 12
//					arr [i+1] = arr[i] - arr[i+1]; // 12 - 8 = 3 
//					arr[i]= arr [i] - arr [i+1];//  12 - 3 = 8

					int stemp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = stemp;

				}
			}
		}
	}

	
//	Sắp xếp chèn (Insertion sort):
//	public static void insertionSort(int[] arr) {
//		int n = arr.length;
//		for (int i = 1; i < n; i++) {
//			int key = arr[i];
//			int j = i - 1;
//			while (j >= 0 && arr[j] > key) {
//				arr[j + 1] = arr[j];
//				j--;
//			}
//			arr[j + 1] = key;
//		}
//	}

//	Sắp xếp nổi bọt (Bubble sort):
//	public static void bubbleSort(int[] arr) {
//	    int n = arr.length;
//	    for (int i = 0; i < n-1; i++) {
//	        for (int j = 0; j < n-i-1; j++) {
//	            if (arr[j] > arr[j+1]) {
//	                int temp = arr[j];
//	                arr[j] = arr[j+1];
//	                arr[j+1] = temp;
//	            }
//	        }
//	    }
//	}

//	Sắp xếp nhanh (Quick sort):
//	public static void quickSort(int[] arr, int low, int high) {
//	    if (low < high) {
//	        int pi = partition(arr, low, high);
//	        quickSort(arr, low, pi-1);
//	        quickSort(arr, pi+1, high); 
//	    }
//	}

//	private static int partition(int[] arr, int low, int high) {
//	    int pivot = arr[high];
//	    int i = low-1;
//	    for (int j = low; j < high; j++) {
//	        if (arr[j] < pivot) {
//	            i++;
//	            int temp = arr[i];
//	            arr[i] = arr[j];
//	            arr[j] = temp;
//	        }
//	    }
//	    int temp = arr[i+1];
//	    arr[i+1] = arr[high];
//	    arr[high] = temp;
//	    return i+1;
//	}

//	Sắp xếp trộn (Merge sort):
//	public static void mergeSort(int[] arr, int l, int r) {
//	    if (l < r) {
//	        int m = (l+r) / 2;
//	        mergeSort(arr, l, m);
//	        mergeSort(arr, m+1, r);
//	        merge(arr, l, m, r);
//	    }
//	}
//	private static void merge(int[] arr, int l, int m, int r) {
//	    int n1 = m-l+1;
//	    int n2 = r-m;
//	    int[] L = new int[n1];
//	    int[] R = new int[n2];
//	    for (int i = 0; i < n1; i++) {
//	        L[i] = arr[l+i

	public static void main(String[] args) {
		int[] arr = { 8, 3, 6, 1, 5, 3, 7, 2, 1, 7, 4, 3, 7, 2, 3 };
		sort(arr);

		System.out.println(Arrays.toString(arr));
		System.out.println("gia tri max cua arr la: " + arr[arr.length - 1]);
		System.out.println("gia tri min cua arr la: " + arr[1]);

		int sum = 0;
		for (int num : arr) {
			sum = sum + num;
		}
		System.out.println("sum = " + sum);
	}
}
