

/*
 * 1.38 Viết hàm boolean laNguyenTo(int n) để kiểm tra 1 số có là số nguyên tố không (bằng true 
nếu n là nguyên tố, ngược lại là false). Sử dụng hàm để liệt kê các số nguyên tố nhỏ hơn N 
nhập từ bàn phím.
 */
public class Isprime {
	public static boolean laNguyenTo(int n) {
		if (n < 2) {
			return false;
		}
		if (n == 2) {
			return true;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;

	}

	public static void LK(int N) {
		for (int i = 2; i <= N; i++) {
			if(laNguyenTo(i)) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		System.out.println(laNguyenTo(5));
		System.out.println();
		LK(100);
	}
}
