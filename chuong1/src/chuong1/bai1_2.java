package chuong1;

import java.util.Scanner;

// Nhập vào một góc có số đo độ. Đổi góc đó ra đơn vị radian 
// và tính sin, cosin, tg, cotg của góc đó
public class bai1_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so do goc don vi do: ");

		int angle = sc.nextInt();

		float radian = (float) (angle * Math.PI / 180);
//		double radian = angle * Math.PI /180;
		
		double s = Math.sin(radian);
		s = Math.round(s *100);
//		double s = Math.round(Math.sin(radian)*100);
		
		s = s/100;
		System.out.println("sin cua " + angle + " la: " + s);

		System.out.println("sin cua " + angle + " la: " + Math.sin(radian));
		System.out.println("sin cua " + angle + " la: " + Math.round(Math.sin(radian)));
		System.out.println("cos cua " + angle + " la: " + Math.round(Math.cos(radian)));
		System.out.println("tan cua " + angle + " la: " + Math.round(Math.tan(radian)));
		System.out.println("cot cua " + angle + " la: " + Math.round(1 / Math.tan(radian)));

	}
}
