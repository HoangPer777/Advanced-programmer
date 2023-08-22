package chuong2;

import java.util.Scanner;

/*
 * Cho vào 1 năm dương lịch. Xét năm đó có phải là năm nhuận không.
 * Cho vào tháng và năm. Tính số ngày trong tháng.
 * Dùng swich-case
 */
public class bai1_7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap nam ban muon kiem: ");
		int year = sc.nextInt();

		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
			System.out.println(year + " la nam nhuan!");
		else
			System.out.println(year + " khong phai nam nhuan!");

		cauB();
	}

	static void cauB() {
		Scanner in = new Scanner(System.in);
		System.out.print("Nhap thang: ");
		int month = in.nextInt();
		System.out.print("Nhap nam: ");
		int year = in.nextInt();
		int days = 0;

		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			days = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			days = 30;
			break;
		case 2:
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
				days = 29;
			else
				days = 28;
			break;
		}
		System.out.println("So ngay la : " + days);
	}

}
