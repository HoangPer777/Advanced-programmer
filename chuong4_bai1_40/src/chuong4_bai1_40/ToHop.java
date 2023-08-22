package chuong4_bai1_40;
/*
 *1.40:	Viết hàm double toHop(int n, int k) để tính tổ hợp chập k của n phần tử theo công thức Ckn
 * và dùng hàm này in ra tam giác Pascal như sau:	
 */
public class ToHop {
	public static int factorial(int n) {
		int factorial = 1;
		for(int i = 1; i <= n; i++) {
			factorial *= i;
		}
		return factorial;
	}
	public static double toHop(int n, int k) {
		// đk tồn tại tổ hợp chập k của n
		if (k < 0 || k > n) {
            return 0;
        }
		int C = factorial(n) / (factorial(k) * factorial(n - k));
		return C;
	}
	public static void pascal( int n, int k) {
		int arr[][] = new int[n + 1][k+ 1];
		
		// Tính toán các giá trị trong tam giác Pascal
		// In ra màn hình các giá trị trong tam giác Pascal
//				for (int i = 0; i <= n; i++) {
//					for (int j = 0; j <= i; j++) {
//						System.out.print(toHop(i, j) + " ");
//					}
//					System.out.println();
//				}
		for(int i = 0 ; i <= n ; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print(toHop(i, j) +" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		System.out.println(toHop(3, 1));
		System.out.println();
		pascal( 3, 4);
	}
}
