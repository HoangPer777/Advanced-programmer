package lab7;

public class Ex5 {
	public static boolean isAnagram(String a1, String a2) {
		if (a1.length() != a2.length()) {
			return false;
			// kiểm tra xem độ dài hai chuỗi có bằng nhau k ? nếu có thì huỗi đã cho có phải
			// là đảo chữ và ngược lại .
		}
		int[] count = new int[26];

		for (int i = 0; i < a1.length(); i++) {
			// tính toán vị trí tương ứng của ký tự đó trong bảng chữ cái bằng cách trừ đi
			// mã ASCII của ký tự 'a' ('a' có mã ASCII là 97) và sử dụng kết quả như là chỉ
			// số của mảng đếm count.
			count[a1.charAt(i) - 'a']++;
			count[a2.charAt(i) - 'a']--;
		}

		for (int i = 0; i < count.length; i++) {
			if (count[i] != 0) {
				return false;
			}

		}
		return true;
	}
}
