
public class Triangle {
	public static int[][] creatPascalTriangle(int[] diagonalValues){
		int n = diagonalValues.length;
        int[][] p = new int[n][n];

        // Khởi tạo giá trị trên đường chéo
        for (int i = 0; i < n; i++) {
            p[i][i] = diagonalValues[i];
            /*
             * p[1][1] = 1
             * p[2][2] = 5
             * p[3][3] = 2
             * p[4][4] = 0
             */
        }

        // Tính toán các giá trị còn lại trong ma trận
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                p[i][j] = p[i-1][j] - 1;
            }
        }
        return p;
	}
	
	
	
	public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
	}
	
	public static void main(String[] args) {
        int[] diagonalValues = {1, 5, 2, 0};
        int[][] pascalTriangle = creatPascalTriangle(diagonalValues);
        printMatrix(pascalTriangle);
       
    }
	
}
