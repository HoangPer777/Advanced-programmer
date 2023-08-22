public class backEnd {

	public static void printPascalTriangle(int n) {
		// Tạo mảng p và khởi tạo các giá trị ban đầu
		int[][] p = new int[n + 1][n + 1];
		for (int i = 0;  i <= n; i++) {
			p[i][0] = 1;
			p[i][i] = 1;
		}

		// Tính toán các giá trị trong tam giác Pascal
		for (int i = 2; i <= n; i++) {
			for (int j = 1; j < i; j++) {
				p[i][j] = p[i - 1][j - 1] + p[i - 1][j];
			}
		}

		// In ra màn hình các giá trị trong tam giác Pascal
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(p[i][j] + " ");
			}
			System.out.println();
		}
	}
}
