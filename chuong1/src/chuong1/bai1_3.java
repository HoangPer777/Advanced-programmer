package chuong1;

import java.util.Scanner;

/*
 * Nhập vào tổng số giây. Hãy chuyển đổi sang giờ, phút, giây 
 * và in ra theo dạng h:m:s
 */
public class bai1_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao tong so giay: ");
		int s = sc.nextInt();

		int m = s / 60;
		int h = m / 60;

		System.out.println(h + ":" + m + ":" + s);
	}
}
