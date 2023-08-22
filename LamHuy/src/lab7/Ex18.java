package lab7;

public class Ex18 {
	public static String reverseString(String str) {
		StringBuilder sb = new StringBuilder(str);
		// reverse() để đảo ngược các ký tự trong chuỗi.
		sb.reverse();
		return sb.toString();
	}

}
