package chuong3_bai1_32;

//Cho số nguyên dương n. Tìm các tam giác có độ dài 3 cạnh là số nguyên và chu vi là n
public class backEnd {
	public static void triangle(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				for (int k = 1; k <= n; k++) {
					if (k + i + j == n && k != 0) {
						System.out.println(i + j + k);
					}
				}
//				int k = n - i - j;

			}
		}
	}
}
