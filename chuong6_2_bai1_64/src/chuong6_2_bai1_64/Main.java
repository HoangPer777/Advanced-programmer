package chuong6_2_bai1_64;
/*
 * Cho ma trận vuông cấp n gồm các số nguyên. 
a) Kiểm tra ma trận có là ma trận tam giác trên không? (Ma trận tam giác trên thỏa: ít nhất 
một phần tử trên đường chéo chính khác 0, và toàn bộ các phần tử dưới đường chéo chính bằng 0)
b) Kiểm tra ma trận có đối xứng qua đường chéo chính hay không.
c) Kiểm tra ma trận có đối xứng qua tâm hay không.
 */

public class Main {
	// thiếu th ma trận 0, cần xét thêm th đường chéo chính có toàn 0 ko
	public static boolean isUpperTriangularMatrix(int[][] matrix) {
		int n = matrix.length;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (matrix[i][j] != 0) {
					return false;
				}
			}
		}
		return true;
//	    return matrix[0][0] != 0;
	}

	public static boolean symmetricMatrix(int arr[][]) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i +1; j < arr.length - 1; j++) {
				if (arr[i][j] != arr[j][i]) {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		
		int arr[][] = { { 2, 4, 6, 7 }, { 9, 1, 3, 5 } };
//		int arr1[][] = {{2, 4, 6, 7}, {9, 1, 3, 5}};

		System.out.println("Ma tran tren la ma tran tam giac phai khong: " + isUpperTriangularMatrix(arr));
		
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } }; // => false
		int[][] matrix2 = { { 3, 5, 1 }, { 5, 7, -8 }, { 1, -8, 9 } }; // => true
		int[][] matrix3 = {{ 2, 4, 6, 7 }, { 9, 1, 3, 5 },{ 2, 4, 6, 7 }, { 9, 1, 3, 5 }}; // => false
		int[][] matrix4 = {{1, 2, 3, 4}, {2, 5, -3, 9}, {3, -3, 6, 5}, {4, 9, -5, 7}}; // => true
		System.out.println("Ma tran co doi xung qua duong cheo chinh hay khong: " + symmetricMatrix(matrix4));
	}

}
