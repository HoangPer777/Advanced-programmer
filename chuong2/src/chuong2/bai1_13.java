package chuong2;

import java.util.Scanner;

// Cho năm dương lịch n. 
// Xác định năm âm lịch tương ứng. Ví dụ: 1998 là năm Mậu Dần.

public class bai1_13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap nhan can kiem tra: ");
		int year = sc.nextInt();
		
		int ch = year % 12;
		String chi = null;
		
		switch(ch) {
		case 0: 
			chi = "Than";
			break;
		case 1: 
			chi = "Dau";
			break;
		case 2: 
			chi = "Tuat";
			break;
		case 3: 
			chi = "Hoi";
			break;
		case 4: 
			chi = "Tys";
			break;
		case 5: 
			chi = "Suu";
			break;
		case 6: 
			chi = "Dan";
			break;
		case 7: 
			chi = "Mao";
			break;
		case 8: 
			chi = "Thin";
			break;
		case 9: 
			chi = "Ty.";
			break;
		case 10: 
			chi = "Ngo";
			break;
		case 11: 
			chi = "Mui";
			break;
		}
		
		int ca = year % 10;
		String can = null;
		
		switch(ca) {
		case 4:
			can = "Giap";
			break;
		case 5:
			can = "At";
			break;
		case 6:
			can = "Binh";
			break;
		case 7:
			can = "Dinh";
			break;
		case 8:
			can = "Mau";
			break;
		case 9:
			can = "Ky";
			break;
		case 0:
			can = "Canh";
			break;
		case 1:
			can = "Tan";
			break;
		case 2:
			can = "Nham";
			break;
		case 3:
			can = "Quy";
			break;
		}
		
		System.out.println("Nam "+ year + " la nam: "+ can +" "+ chi);
	}
}
