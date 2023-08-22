package chuong6_2_bai1_63;

import java.util.Arrays;

/*
 * Cho ma trận các số nguyên kích thước m x n:
a) In ra phần tử lớn nhất và nhỏ nhất của ma trận.
b) Tính tổng các phần tử của ma trận
 */
public class matrix {
	public static void elementMax(int arr[][]) {
		int row = 0;
		int col = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] > arr[row][col]) {
					row = i;
					col = j;
				}
			}
		}

		// xuất chuỗi ra màng hình
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println("\n");
		}
		
		// hiển thị vị trí của phần tử lớn nhất trong ma trận
		System.out.println("Phan tu lon nhat trong ma tran la " + arr[row][col] + " co vi tri (" + (row+1)  + "," + (col+1) + ")");
	}

	public static int sumElement(int arr[][]) {
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		int arr[][] = { { 2, 2, 4, 6, 9 }, { 2, 4, 8, 9, 9 } };
		elementMax(arr);
		System.out.print("Cau B: ");
		System.out.println("sum = " + sumElement(arr));
		
	}
	

}
