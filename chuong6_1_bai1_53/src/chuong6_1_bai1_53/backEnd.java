package chuong6_1_bai1_53;

import java.util.Arrays;

// 1.53 Cho n số nguyên. Tìm xem phần tử lớn nhất xuất hiện trong dãy mấy lần.
public class backEnd {

	public static void sort(int[] arr) {
		for (int j = 0; j < arr.length; j++) {
			for (int i = 0; i < arr.length - 1; i++) {

				if (arr[i] > arr[i + 1]) {
					int stemp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = stemp;

				}
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 8, 9, 6, 1, 5, 3, 7, 2, 1, 7, 4, 9, 7, 2, 3 };
		sort(arr);

		System.out.println(arr[arr.length - 1]);
		System.out.println(Arrays.toString(arr));

		int count = 0;
		for (int k = 0; k < arr.length; k++) {
			if (arr[k] == arr[arr.length - 1]) {
				count++;

			}

		}
		System.out.println("max xuat hien " + count + " lan");
	}

}
