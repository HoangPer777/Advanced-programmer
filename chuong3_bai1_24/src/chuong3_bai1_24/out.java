package chuong3_bai1_24;

import java.util.Scanner;

public class out {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so tien gui P: ");
		int P = sc.nextInt();
		
		System.out.println("Nhap so thang gui tiet kiem n: ");
		int n = sc.nextInt();
		
		System.out.println("So tien gui tiet kiem cua ban la: " + Method.savingMoney(P, n));
				
		
	}
}	
