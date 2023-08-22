package chuong3_bai1_23;
/*
 * 1.23 a) Cho số tự nhiên n. Tính tổng S = 1 + 2 + … + n.
 * 		b) Cho số tự nhiên n. Tính giai thừa n! = 1 x 2 x … x n
 */

public class Method {
	public static int sum(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum = sum + i;
		}
		return sum;
	}

	public static int factorial(int n) {
		int factorial = 1;
		for(int i =1; i <= n; i++ ) {
			factorial = factorial * i;
		}
		return factorial;
	}

}
