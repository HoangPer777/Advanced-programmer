package chuong1;

import java.util.Scanner;

/*
 * Nhập vào độ cao h của một vật rơi tự do. 
 * Tính thời gian và vận tốc của vật lúc chạm đất
 */
public class bai1_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap do cao h: ");
		int h = sc.nextInt();

		double t = Math.sqrt(2 * h / 10);
		System.out.println("thoi gian vat cham dat la: " + t);

		double s = 10 * t;
		System.out.println("quang duong vat cham dat la: " + s);
	}
}
