package chuong6_1_bai1_56;

import java.util.Arrays;

public class backEnd {
	public static void sort(int[] arr) {
//		for(int j = 0; j < arr.length; j++) {
//			for(int i = 0; i < arr.length -1; i++) {
//				if(arr[i] > arr[i +1]) {
//					int stemp = arr[i];
//					arr[i] = arr[i+1];
//					arr[i+1] = stemp;
//				}
//			}
//		}
		Arrays.sort(arr);
//		arr = Arrays.copyOf(arr, 3); // coppy từ đầu đến length
		arr = Arrays.copyOfRange(arr, 1, 4); // coppy từ vị trí start đến end
		System.out.println(Arrays.toString(arr));

	}

	public static void main(String[] args) {
		int[] arr = { 19, 4, 7, 2, -5, -10, 9, 10 };
		backEnd.sort(arr);
//		System.out.println(Arrays.toString(arr));

	}

}
