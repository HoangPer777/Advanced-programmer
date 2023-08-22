package chuong2;

import java.util.Scanner;

// Cho các hệ số a, b và c của phương trình ax2+ bx + c = 0.
// Tìm nghiệm của phương trình
public class bai1_9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap 3 he so nguyen duong a, b, c" + " cua phuong tring ax2 + bx + c = 0: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		double delta = b*b - 4*a*c;
		if(a==0 && b==0) {
			System.out.println("Nguyen cua pt la: " + c);
		}else if(a==0 && b!=0) {
			System.out.println("Nghiem cua pt la:" + -c/b);
		}else if(delta == 0) {
			System.out.println("Pt co nghiem kep: " + -b/(2*a));
		}else if(delta < 0) {
			System.out.println("pt vo nghiem.");
		}else if(delta > 0) {
			System.out.println("pt co 2 nghiem phan biet:" );
			System.out.println("x1 = "+ (-b + (float) Math.sqrt(delta)) / (2 * a));
			System.out.println("x2 = "+ (-b - (float) Math.sqrt(delta)) / (2 * a));
		}
			
			
	}
}
