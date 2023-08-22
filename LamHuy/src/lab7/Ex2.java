package lab7;

public class Ex2 {
	// Xuôi ngược (palindrome) là một số, tổ hợp chữ cái, từ hoặc văn bản đọc giống nhau theo cả hai hướng. 
	public static boolean isPalindrome(String input) {

		// phương thức replaceAll của lớp String để loại bỏ các ký tự không phải chữ cái
		// trong chuỗi str đã cho.
		// phương thức toLowerCase của lớp String để chuyển tất cả các ký tự trong chuỗi
		// input thành chữ thường.
		// Xóa các ký tự không phải chữ cái trong chuỗi và chuyển thành chữ thường
		input = input.replaceAll("[^a-zA-Z]", "").toLowerCase();

		// Đảo ngược chuỗi
		String reversedStr = new StringBuilder(input).reverse().toString();

		// So sánh chuỗi đã cho với chuỗi đã đảo ngược
		return input.equals(reversedStr);

	}
}