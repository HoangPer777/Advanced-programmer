package chuong1;
/*
 * Nhập vào các số thực xA, yA, xB, yB là hoành độ và tung độ của 2 điểm A, B. 
 * Tính khoảng cách d giữa 2 điểm
 */

import java.util.Scanner;

public class bai1_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so thuc xA, yA: ");
		int xA = sc.nextInt();
		int yA = sc.nextInt();
		
		System.out.println("Nhap so thuc xB, yB: ");
		int xB = sc.nextInt();
		int yB = sc.nextInt();
		
		double d = Math.sqrt(Math.pow((xA-xB), 2) + Math.pow((yA-yB), 2));
		System.out.println("Khoang cach giua 2 diem A, B la: " + d);
	}	
}
