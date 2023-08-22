package chuong6_2_bai1_66;
/*
 * Cho ma trận vuông A cấp n gồm các số nguyên. Tính tổng từng dòng của ma trận và tìm dòng 
có tổng lớn nhất
 */
public class SumRow {
	public static void sumRow(int arr[][]) {
		int sum = 0;
		int max = 0;
		for (int i = 0; i < arr.length ; i++) {
			for (int j = 0; j < arr.length ; j++) {
				sum += arr[i][j];

			}
			System.out.println(sum);
			if(sum > max) {
				int temp = sum;
				sum = max;
				max = temp;
			}
		}
		System.out.println("sum row max = " + max);
	}
	
	public static void main(String[] args) {
		int[][] matrix = {{1, 2, 3, 4}, {2, 5, -3, 9}, {3, -3, 6, 5}, {4, 9, -5, 7}};
		sumRow(matrix);
		
	}
}
