package chuong1; //Các phép toán – PHÉP GÁN:
// Nhập vào bán kính hình tròn. Tính chu vi và diện tích hình tròn. 
import java.util.Scanner;

public class bai1_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap ban kinh: ");
		double r = sc.nextDouble();

		double acreage = Math.PI * r * r;
		double perimeter = 2 * r * Math.PI;

		System.out.println("Dien tich hinh tron la: " + acreage);
		System.out.println("Chu vi hinh tron la: " + perimeter);
	}

}
