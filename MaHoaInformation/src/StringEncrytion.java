public class StringEncrytion {
	/*
	 * Bài 13. Một thuật toán mã hóa một thông điệp như sau: viết chuỗi thông điệp
	 * theo dòng có n=5 cột, dòng cuối cùng được thêm các khoảng trắng cho đầy dòng,
	 * rồi viết lại các ký tự của thông điệp đó theo cột. Ví dụ: Thông điệp
	 * "I am student" Thông diệp mã hóa --> "Isn-ttau-md--e-" a) Cho một chuỗi s, mã
	 * hóa chuỗi s theo thuật toán trên b) Giải mã lại chuỗi s.
	 */
	public static String encrypt(String mess, int col) {
		String res = "";
//		int col = 5;
		int row = mess.length() / col;
		if ((mess.length() % col) > 0) { // Nếu kích thước của chuỗi ko chia hết cho 5 thì cộng 1 row
			row++;
		}
		char[][] matrix = new char[row][col]; // khởi tạo ma trận có row dòng, col cột
		char ch;
		for (int r = 0, index = 0; r < row; r++) {
			for (int c = 0; c < col; c++) {

				if (index < mess.length()) {
					ch = mess.charAt(index++);
					if (ch == ' ')
						ch = '-';
				} else
					ch = '-';
				matrix[r][c] = ch;
			}
		}

		for (int c = 0; c < col; c++) {
			for (int r = 0; r < row; r++) {
				res += matrix[r][c];
			}
		}

		return res;

	}

	// giải mã 
	public static String decrypt(String encMess, int col) {
		String res = "";
//		int col = 5;
		int row = encMess.length() / col;

		char[][] matrix = new char[row][col];
		char ch;

		for (int c = 0, index = 0; c < col; c++) {
			for (int r = 0; r < row; r++) {
				ch = encMess.charAt(index++);
				if (ch == '-') {
					ch = ' ';
				} else
					matrix[r][c] = ch;

			}
		}

		for (int r = 0; r < row; r++) {
			for (int c = 0; c < col; c++) {
				res += matrix[r][c];
			}
		}

		return res;

	}

	public static void main(String[] args) {
		String mess = "I am student";
		System.out.println(mess);

		String enMess = encrypt(mess, 5);
		System.out.println(enMess);

		System.out.println(decrypt(enMess, 5));

	}

}
