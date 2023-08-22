
public class BieuThucP {
	public static double P(int n, double x) {
		int p = 0;
		for (double i = 0; i <= n; i++) {
			p += Math.pow(-1, i)* Math.pow(x, i);
//			if (i % 2 == 1) {
//				p = (int) (p - Math.pow(x, i));
//			} else
//				p = (int) (p + Math.pow(x, i));
		}
		return p;
	}
	
	
	public static void main(String[] args) {
		System.out.println("" + P(5, 3));
	}
}
