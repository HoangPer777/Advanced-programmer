package chuong6_2_bai1_65;

/*
 * Cho ma trận vuông cấp n gồm các số nguyên. 
a) Cho ma trận vuông A cấp n gồm các số. Tìm ma trận chuyển vị của A.
b) Hoán vị cột 1 và cột n, cột 2 và cột (n-1), cột 3 và cột (n-2), .... In ma trận kết quả ra màn hình.
 */
public class Main {
	public static void matrixTransposition(int arr[][]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr[i].length; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}

		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static void columPermutation(int arr[][]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length / 2; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[i][arr.length - j - 1];
				arr[i][arr.length - j - 1] = temp;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		matrixTransposition(matrix);
		System.out.println();
		columPermutation(matrix);
	}
}
