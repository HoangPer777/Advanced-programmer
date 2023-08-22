package chuong6_2_bai1_67;

/*
 * Cho 2 ma trận vuông A và B cấp n gồm các số thực. 
a) Tính ma trận tổng C = A + B. Ma trận tổng được tính theo công thức: Cij = Aij + Bij.
b) Tính ma trận hiệu D = A - B. Ma trận hiệu được tính theo công thức: Dij = Aij – Bij
 */
public class SumMatrix {
	public static void sumMatrix(int arr1[][], int arr2[][]) {
		// tính tổng của hai ma trận
		int sum[][] = new int[arr1.length][arr2.length]; // lưu ý mỗi dòng này
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				sum[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		// in kết quả
		System.out.println("Tong cua hai ma tran la:");
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				System.out.print(sum[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static void subtractMatrix(int arr1[][], int arr2[][]) {
		// tính tổng của hai ma trận
		int[][] sum = new int[arr1.length][arr2.length];
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				sum[i][j] = arr1[i][j] - arr2[i][j];
			}
		}
		// in kết quả
		System.out.println("Hieu cua hai ma tran la:");
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				System.out.print(sum[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		int[][] arr1 = { { 1, 5, 9, 13 }, { 2, 6, 10, 14 }, { 3, 7, 11, 15 }, { 4, 8, 12, 16 } };
		int[][] arr2 = { { 16, 12, 8, 4 }, { 15, 11, 7, 3 }, { 14, 10, 6, 2 }, { 13, 9, 5, 1 } };

		sumMatrix(arr1, arr2);
		System.out.println();
		subtractMatrix(arr1, arr2);
	}
}
