package chuong3_bai1_32;

import java.util.Scanner;

public class frontEnd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so n: ");
		int n = sc.nextInt();
		backEnd.triangle(n);
	}
}	
