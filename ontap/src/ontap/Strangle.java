package ontap;

public class Strangle {
	public static void NhanMatrix(int arr1[][], int arr2[][]) {
		int matrix[][] = new int[arr1.length][arr2[0].length]; // ma trận xuông cấp n
		for(int i= 0; i < arr1.length; i++ ) {
			for(int j = 0; j < arr2[0].length; j++) {
				for(int k = 0; k < arr2.length;k++ ) {
					matrix[i][j] += arr1[i][k] * arr2[k][j];
				}
			}
		}
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	
	public static void pascal(int arr[]) {
		int matrix[][] = new int [arr.length][arr.length];
		
		// điền các giá giá trị ở đường chéo
		for(int i= 0; i < arr.length; i++) {
//			for (int j = 0; j < i; j++) {
				matrix[i][i] = arr[i];
//			}
//			matrix[i][i] = arr[i];
		}
	
		
		// in matrix ra màng hình 
		for(int i= 0; i < arr.length; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int arr1[][] = { {1,2,3},{5,6,-3}, {-1,9,3} };
		int arr2[][] = { {1,2,3, 5},{5,6,-3, -1}, {-1,9,3, -1} };
		NhanMatrix(arr1,arr2);
		System.out.println("///////////////////////");
		int arr[] = {1, 3, -5, 6};
		pascal(arr);
	}
}
