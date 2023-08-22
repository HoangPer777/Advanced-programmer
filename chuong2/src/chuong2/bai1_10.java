package chuong2;

import java.util.Scanner;

//Cho a1, b1, a2, b2 là các điểm đầu mút của 2 đoạn [a1, b1] và [a2, b2] trên trục số. 
//Tìm độ dài phần giao và phần hợp của 2 đoạn.
public class bai1_10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap a1 va b1: ");
		int a1 = sc.nextInt();
		int b1 = sc.nextInt();
		System.out.print("Nhap a2 va b2: ");
		int a2 = sc.nextInt();
		int b2 = sc.nextInt();

		int d1 = a1 < a2 ? a2 : a1;
		int d2 = b1 < b2 ? b1 : b2;
		
		if (d1 <= d2)
			System.out.println("Doan chung la [" + d1 + "," + d2 + "]");
		else
			System.out.println("Khong co doan chung! ");
	}
}
