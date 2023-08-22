package lab7;

public class Ex3 {
	public static int[] countTheNumber(String input) {
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

//			char chu = input.charAt(i);
//			// Kiểm tra xem chuỗi có chạy từ A - Z hay không ?
//			// chữ số nguyên âm là các chữ "a,e,i,o,u" .