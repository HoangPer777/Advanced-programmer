
public class SinValue {

	public static double P(int n, double x) {
		int res = 0;
		for (double i = 0; i <= n; i++) {
			res += Math.pow(-1, i) * Math.pow(x, i);
		}
		return res;
	}

	public static double calcExp2(double x, int n) {
		double res = 0;
		for (int i = 0, sign = 1; i <= n; i++, sign = -sign) {
			res += sign * Math.pow(x, i);
		}
		return res;
	}

	public static double sin(double x, double b) {
		double res = 0;
		int n = 0;
		int sign = 1;
		do {
			res += sign * exp(x, n);
			sign = -sign;
			n++;
		} while (exp(x, n) >= b);
		return res;
	}

	private static double exp(double x, int n) {
		int num = 2 * n + 1;
		return Math.pow(x, num) / factorial(num);
	}

	private static long factorial(int num) {
		long res = 1;
		for (int n = 2; n <= num; n++) {
			res *= n;
		}
		return res;
	}
	
	public static void main(String[] args) {
		double n = Math.PI/4;
		System.out.println(sin(n, 0.000001));
		System.out.println( Math.sin(n));
	}
}
