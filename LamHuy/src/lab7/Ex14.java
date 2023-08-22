package lab7;

public class Ex14 {
	public static String removeAllSpaces(String input) {
	    // sử dụng biểu thức chính quy để tìm và thay thế tất cả các khoảng trắng trong chuỗi bằng ""
	    return input.replaceAll("\\s", "");
	}
}
