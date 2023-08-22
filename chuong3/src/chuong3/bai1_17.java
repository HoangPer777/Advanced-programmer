package chuong3;

import java.util.Scanner;

/*
 * Cho số tự nhiên n.
a) Đếm số chữ số của số nguyên đó.
b) Tìm số đảo ngược của số n
 */
public class bai1_17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap so tu nhien n: ");
		int n = sc.nextInt();

		String s = Integer.toString(n); // ep kieu int thanh String
		int length_n = s.length();

		System.out.println(n + " co " + length_n + " chu so"); // a)
		
		while(n>0) {
			System.out.print(n % 10);
			n = n/10;
		}
		
		
	}
}
