package chuong3;

import java.util.Scanner;

//Cho 2 số tự nhiên a và b. 
//Tìm ước số chung lớn nhất và bội số chung nhỏ nhất của 2 số đó.
public class bai1_19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap hai so a va b: ");
		int a = sc.nextInt();
		int b = sc.nextInt();

		int ucln = UCLN(a, b);
		int bcnn = BCNN(a, b);
		System.out.println("UCLN cua " + a + " va " + b + " la: " + ucln);
		System.out.println("BCNN cua " + a + " va " + b + " la: " + bcnn);
	}
/*
 * VD: 48 va 36 
 * vong lap 1. r=12, a=36, b=12(!=0) tiep tuc while
 * vong 2. r=0, a=12, b=0(==0) ket thuc while toi cau lenh tiep theo
 * 	la return a
 * 
 * VD2: 30 va 6
 * 1. r=5, a=6, b=5(!=0)
 * 2. r=1, a=5, b=1(!=0)
 * 3. r=0, a=1, b=0(==0) => return a;
 */
	public static int UCLN(int a, int b) {
//		while (b != 0) {
//			int r = a % b;
//			a = b;
//			b = r;
//		}
//		return a;

// cách củ chuối đó! 
		for(int min = (a < b) ? a : b; min >= 0; min--) {
			if(a % min == 0 && b % min == 0) {
				return min;
			}
				
		}
		return a;
	}

	public static int BCNN(int a, int b) {
		return (a * b) / UCLN(a, b);
	}

}
