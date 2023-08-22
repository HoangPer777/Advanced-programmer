package lab7;

public class Ex12 {
	public static String reverseString(String input) {
		String reversed = "";
		// lấy chiều đài ban đầu của chuỗi
		int length = input.length();
		// lenght - 1 : bắt đầu từ phần cuối cùng của chuỗi .
		// Nếu i lớn hơn hoặc bằng 0, tiếp tục lặp lại vòng lặp.
		// Trong mỗi vòng lặp, lấy ký tự ở vị trí i của chuỗi ban đầu bằng phương thức
		// str.charAt(i) và nối ký tự đó vào đầu chuỗi reversed bằng phép cộng chuỗi (+).

		for (int i = length - 1; i >= 0; i--) {
			reversed = reversed + input.charAt(i);
		}
		return reversed;
	}
}
