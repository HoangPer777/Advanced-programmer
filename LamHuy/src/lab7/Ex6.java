package lab7;

public class Ex6 {
	public static String removeSpaces(String input) {
	    // sử dụng biểu thức chính quy để tìm và thay thế tất cả các khoảng trắng trong chuỗi bằng ""
	    return input.replaceAll("\\s", "");
	}
}
