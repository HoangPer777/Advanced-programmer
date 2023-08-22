package chuong2;

import java.util.Scanner;

//Cho các hệ số a và b của phương trình ax + b = 0. Tìm nghiệm của phương trình.
public class bai1_8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap 2 he so nguyen duong a,"
				+ " b cua phuong tring ax + b = 0: ");
		int a = sc.nextInt();
		int b = sc.nextInt();

		if (a == 0) {
			System.out.println("Phuong trinh co nghiem x= " + b);
		} else
			System.out.println("Phuong trinh co nghiem x= " + -b/a);

	}
}
