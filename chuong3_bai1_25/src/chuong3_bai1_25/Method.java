package chuong3_bai1_25;

/*
 * Cho số tự nhiên n và số thực x.
a) Tính P = 1 + x + x2 + … + xn.
b) Tính P = 1 – x + x2 – x3 + … + xn.
c) Cho số tự nhiên n và số thực x. Hãy tính tổng S =
 */
public class Method {
	public static int P1(int n, double x) {
		int P1 = 0;
		for (int i = 0; i <= n; i++) {
			P1 = (int) (P1 + Math.pow(x, i));
		}
		return P1;
	}

	public static int P2(int n, double x) {
		int P2 = 0;
		for (int i = 0; i <= n; i++) {
			if (i % 2 == 1) {
				P2 = (int) (P2 - Math.pow(x, i));
			} else
				P2 = (int) (P2 + Math.pow(x, i));
		}
		return P2;
	}

	public static double S(int n, double x) {
		double S = 0;
		int factorial = 1;
		for (int i = 0; i <= n; i++) {
			if (i != 0) {
				factorial = factorial * i;
			}
			S = S + ((Math.pow(x, i) / factorial));
		}
		return S;
	}

}
