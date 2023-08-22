package lab7;

public class Ex8 {
	public static String removeFirstAndLastChar(String input) {
		// str == null || str.length() < 2) kiểm tra xem chuỗi đầu vào có null
		// hoặc có ít hơn hai ký tự không. Nếu điều kiện này đúng
		// => chuỗi đầu vào không hợp lệ để loại bỏ ký tự đầu tiên và ký tự cuối cùng

		if (input == null || input.length() < 2) {
			return "";
		}
		// sử dụng phương thức substring() của lớp String để trích xuất một chuỗi
		// con từ chuỗi đầu vào bắt đầu từ vị trí thứ hai (str.substring(1))
		// và kết thúc trước vị trí cuối cùng (str.length() - 1).
		return input.substring(1, input.length() - 1);
	}

}
