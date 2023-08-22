package chuong3;

import java.util.Scanner;

/*
 * Cho số tự nhiên n.
a) Tìm ước lẻ, lớn nhất của n.
b) Kiểm tra xem số đó có là số nguyên tố không.
c) Phân tích số n ra các thừa số nguyên tố.
d) Tìm và in ra tất cả các số nguyên tố nhỏ hơn n.
 */
public class bai1_20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so tu nhien n: ");
		int n = sc.nextInt();

		// cau a
		int ul_ln = 0;
		for (int i = 1; i * i <= n; i++) {
			if (n % i == 0) { // kt i co la uoc cua n ko
				if (i % 2 == 1) { // kt i co phai so le ko
					ul_ln = i;
				}
				if ((n / i) % 2 == 1) { // kt co la TH dac biet ko
					ul_ln = n / i;
				}
			}

		}
		System.out.println("uoc le, lon nhat cua n la: " + ul_ln);
		System.out.println("n la so nguyen to: " + checkSoNguyenTo(n));
//		System.out.println("cac so NT be hon n la: " + findExport(n));

		/*
		 * Muốn phân tích một số tự nhiên a lớn hơn 1 thành tích của các thừa số nguyên
		 * tố ta có thể làm như sau:
		 * 
		 * Bước 1: Kiểm tra xem a có chia hết cho 2 hay không? Nếu không, ta tiếp tục
		 * xét với số nguyên tố 3 và cứ như thế đối với các số nguyên tố lớn dần. Bước
		 * 2: Giả sử p là ước nguyên tố nhỏ nhất của a, ta chia a cho p được thương là
		 * b. Bước 3: Tiếp tục thực hiện phân tích b ra thừa số nguyên tố theo quy trình
		 * trên. Bước 4: Lặp lại quá trình trên cho đến khi ta được thương là một số
		 * nguyên tố.
		 */
// câu c) Phân tích số n ra các thừa số nguyên tố.
		// Lặp lại với các số nguyên tố từ 2 đến căn bậc hai của n
		for (int i = 2; i <= Math.sqrt(n); i++) {
			// Nếu i là số nguyên tố và n chia hết cho i
			while (n % i == 0) {
				// In ra i là một thừa số nguyên tố của n
				System.out.print(i + " ");
				// Chia n cho i để giảm bớt số lượng thừa số nguyên tố còn lại
				n /= i;
			}
		}
		// Nếu n lớn hơn 1, tức là n còn lại một thừa số nguyên tố
		if (n > 1) {
			System.out.print(n);
		}
	}

	// cau b
	static boolean checkSoNguyenTo(int n) {
		if (n <= 1) { // be hơn hoặc bằng 1 ko phải là số nguyên tố
			return false;
		}
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

//	d) Tìm và in ra tất cả các số nguyên tố nhỏ hơn n.
//	int i;
//	public static int findExport(int i, int n) {
//		for (int j = 2; j < n; j++) {
//			for (int i = 2; i * i < j; i++) {
//				if (j % i == 0) {
//					continue;
//				}
//			}
//			return i;
//		}
//		return i;
//	}

//	public static int export(int n) {
//		for (int j = 2; j < n; j ++) {
//			for (int i = 2; i * i < j; i++) {
//				if (j % i == 0) {
//					continue;
//				}
//			}
//			return n;
//		}
//		return n;
//	}
	
	public static int findExport(int n) {
	    for (int j = 2; j < n; j++) {
	        boolean isPrime = true;
	        for (int k = 2; k * k <= j; k++) {
	            if (j % k == 0) {
	                isPrime = false;
	                break;
	            }
	        }
	        if (isPrime && n % j == 0) {
	            return j;
	        }
	    }
	    return n;
	}






}
