package chuong3_bai1_22;
//In ra màn hình bảng cửu chương (8 bảng từ 2 đến 9).
public class multiplicationTable {
	public static void multiplication() {
		for (int i = 2; i < 9; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.println(i + "*" + j + " = " + i*j);
			}
			System.out.println("///////////");
		}
	}
	

}
