package chuong3;

// chua hieu sao trong vong lap while no ko gan vao sum gt dau tien?
import java.util.Scanner;

/*
 * Nhập từ bàn phím vào các số nguyên và dừng lại khi nhập giá trị 0. 
 * Tính tổng, trung bình cộng
 * và tìm giá trị lớn nhất của các số nguyên vừa nhập.
 */
public class bai1_16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap cac so nguyen: ");
		System.out.println("[Nhan 0 de dung!]");
		int n = sc.nextInt();
		int max = n;
		int i = 0;
		int sum = 0;

//		do {
//			n = sc.nextInt();
//	
//			if (n > max) {
//				max = n;
//			}
//			while (n != 0) {
//				sum += max;
//			}
//			sum = sum + max;
//			i++;
//		} while (n != 0); // n khac 0 thi chay tiep
		sum += n;
		while (true) {
			n = sc.nextInt();

			if (n > max) {
				max = n;
			}

			sum += n;
			i++;
			if (n == 0) {
				break;
			}
		}
		
		System.out.println("Tong= " + sum);
		System.out.println("Trung binh cong: " + sum / i);
		System.out.println("max= " + max);
	}
}
