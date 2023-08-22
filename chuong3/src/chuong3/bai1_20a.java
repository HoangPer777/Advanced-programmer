package chuong3;

import java.util.Scanner;

/*
 * Cho số tự nhiên n.
a) Tìm ước lẻ, lớn nhất của n.
b) Kiểm tra xem số đó có là số nguyên tố không.
c) Phân tích số n ra các thừa số nguyên tố.
d) Tìm và in ra tất cả các số nguyên tố nhỏ hơn n.
 */
public class bai1_20a {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so tu nhien n: ");
		int n = sc.nextInt();
		int ul_ln = 0;

		/* Cho i chay tu 1-> can n
		 * Xem i co phai la uoc cua n ko 
		 * TH dac biet: n/i la so le thi lay so do lam uoc le lon nhat 
		 * 
		 * VD: 12
		 * 1. i=1, line36 true -> line37 true -> line38 true -> line39: ul_ln = 1;
		 * 2. i=2, line36 true -> line37 true -> line38 false -> line 41 false;
		 * 3. i=3, line36 true -> line37 true -> line38 true -> line39: ul_ln = 3;
		 * 4. i=4, line36 false -> line46: ul_ln = 3;
		 * 
		 * VD2: 15
		 * 1. i=1, line36 true -> line37 true -> line38 true -> line39: ul_ln = 1;
		 * 2. i=2, line36 true -> line37 false;
		 * 3. i=3, line36 true -> line37 true -> line38 true -> line39: ul_ln = 3 
		 * -> line41 true -> ul_ln = 5;
		 * 4. i=4, line36 false -> line46: ul_ln = 3;
		 */
		for (int i = 1; i * i <= n; i++) {
			if (n % i == 0) { // kt i co la uoc cua n ko 
				if (i % 2 == 1) { // kt i co phai so le ko 
					ul_ln = i;
				}
				if ((n / i) % 2 == 1) { // kt co la TH dac biet ko 
					ul_ln = n / i;
				}
			} else
				continue;
		}System.out.println("uoc le, lon nhat cua n la: " + ul_ln);

//		System.out.println(largestOddDivisor(n));
	}

//	public static int largestOddDivisor(int n) {
//		int largestOddDiv = -1;
//		for (int i = 1; i * i <= n; i++) {
//			if (n % i == 0) {
//				if (i % 2 != 0) {
//					largestOddDiv = i;
//				}
//				if ((n / i) % 2 != 0) {
//					largestOddDiv = n / i;
//				}
//			}
//		}
//		return largestOddDiv;
//	}
}
