package lab7;

public class Ex11 {
	public static int[] countNegativeIntegers(String input) {
		int soNguyenAm = 0;
		int soPhuAm = 0;
		char[] str = input.toCharArray();

		for (int i = 0; i < input.length(); i++) {

			if (str[i] == 'a' || str[i] == 'e' || str[i] == 'i' || str[i] == 'o' || str[i] == 'u') {
				soNguyenAm++;

			} else {
				soPhuAm++;
			}
		}
		int[] ketQua = { soNguyenAm, soPhuAm };
		return ketQua;

	}
}
