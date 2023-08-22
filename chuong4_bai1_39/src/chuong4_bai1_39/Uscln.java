package chuong4_bai1_39;

import java.util.Scanner;

/*
 * Viết hàm int uscln(int a, int b) để tìm ước số chung lớn nhất của 2 số nguyên dương. Dùng 
hàm này để tìm ước số chung lớn nhất của 3 số a, b, c nhập từ bàn phím.
 */
public class Uscln {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap hai so a va b: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(uscln(a, b));

//		System.out.println("Nhap hai so a va b va c: ");
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		int c = sc.nextInt();
//		System.out.println("Ket qua la: " + Ucln(a, b, c));
	}

	public static int uscln(int a, int b) {
//		while (b != 0) {
//			int r = a % b;
//			a = b;
//			b = r;
//		}
		for (int min = (a < b) ? a : b; min >= 0; min--) {
			if((a % min == 0) && (b % min == 0)) {
				return min;
			}
		}
		return a;

	}

	public static int Ucln(int a, int b, int c) {
//		int x = 0;
		int x = uscln(a, b);
		x = uscln(x, c);

		return x;
	}

}
