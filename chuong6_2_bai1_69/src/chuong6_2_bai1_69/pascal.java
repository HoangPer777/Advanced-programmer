package chuong6_2_bai1_69;

/*
 * Cho số tự nhiên n gồm các số. In ra màn hình n+1 dòng của tam giác Pascal:
	Ví dụ với n = 4.
 
 */
public class pascal {
	public static void Pascal(int n) {
		// Tạo mảng p và khởi tạo các giá trị ban đầu
		int p[][] = new int[n + 1][n + 1]; // khởi tạo tam giác có n + 1 dòng cột
		for (int i = 0; i <= n; i++) {
			p[i][0] = 1; // dòng i cột 0 thì in ra toàn 1 <là cái đường thẳng>
			p[i][i] = 1; // dòng i cột i thì in ra toàn 1 <đường chéo>
		}

		

		// Tính toán các giá trị trong tam giác Pascal
		for (int i = 2; i <= n; i++) { // i chạy từ 2 cho đến 4
			for (int j = 1; j < i; j++) { // j chạy từ 1 đến i <vd: >
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

	public static void main(String[] args) {
		Pascal(4);
	}
}
