
public class PascalTriangle {

	// xuất mảng tam giác pascal ra màng hình
	public static void displayArray(int[][] arr) {
		for (int row = 0; row < arr.length; row++) {
//			for (int col = 0; col < arr[row].length; col++) {
			for (int col = 0; col <= row; col++) {
				System.out.print(arr[row][col] + "\t");
			}
			System.out.println();
		}
	}

	// in ra tam giác pascal vuông có đường chéo là các phần tử trong mảng cho trước
	public static int[][] createPascalTriangle(int[] diaValues) { 
		int[][] matrix;
		matrix = new int[diaValues.length][];

		// tạo một ô trống 
		for (int row = 0; row < matrix.length; row++) {
			matrix[row] = new int[row + 1];
		}
		
		// Khởi tạo giá trị trên đường chéo
		for (int row = 0; row < diaValues.length; row++) {
			matrix[row][row] = diaValues[row];
		}

		// điền các giá trị còn lại vào matrix
		for (int row = 0; row < matrix.length; row++) {
			int len = matrix[row].length;
			for (int col = len - 2; col > -1; col--) {
				matrix[row][col] = matrix[row][col + 1] - 1;
			}
		}
		return matrix;

	}
	
	public static int getMax(int arr[]) {
		int max = arr[0];
		for (int i : arr) {
			if(i > max) {
				max = i;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int[] diagonalValues = { 1, 5, 2, 0 };
		int[][] pascalTriangle = createPascalTriangle(diagonalValues);

		displayArray(pascalTriangle);
		
		System.out.println();
		int arr[]= {2, 4, 7, 8, 9, 11, -1, -6, 3};
		System.out.println("max = " + getMax(arr));

	}
}
