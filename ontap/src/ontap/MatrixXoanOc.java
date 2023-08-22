package ontap;

public class MatrixXoanOc {
	public static int[][] matrix(int size) {
		int num = 0;
		int col = 0; // cot
		int row = 0; // hang
		int matrix[][] = new int[size][size];
		while (num < size * size) {

			// top
			while (col < size && matrix[row][col] == 0) { 
				num++;
				
				matrix[row][col] = num;
				col++;
			}
			col--;
			row++;

			// right
			while (row < size && matrix[row][col] == 0) { 
				num++;
				
				matrix[row][col] = num;
				row++;
			}
			row--;
			col--;
			
			// bottom
			while(col >= 0 && matrix[row][col] == 0) {
				num++;
				matrix[row][col] = num;
				col--;
			}
			col++;
			row--;
			
			// left
			while(row >= 0 && matrix[row][col] == 0) {
				num++;
				matrix[row][col] = num;
				row--;
			}
			row++;
			col++;
		}
		return matrix;
	}
		
		public static void print(int[][] matrix) {
			for (int row = 0; row < matrix.length; row++) {
				for (int col = 0; col < matrix.length; col++) {
					System.out.print(matrix[row][col] + "\t");
				}
				System.out.println();
			}
		
		
		
	}

	public static void main(String[] args) {
		print(matrix(4));
	}
}
