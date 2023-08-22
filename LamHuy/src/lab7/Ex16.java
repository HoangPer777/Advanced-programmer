package lab7;

public class Ex16 {
	public static boolean isPalindrome(String input) {
//		Biến left được khởi tạo giá trị là 0, tức là trỏ tới ký tự đầu tiên của chuỗi.
//		Biến right được khởi tạo giá trị là str.length() - 1, tức là trỏ tới ký tự cuối cùng của chuỗi.
		int left = 0;
	    int right = input.length() - 1;
	    while (left < right) {
	        if (input.charAt(left) != input.charAt(right)) {
	            return false;
	        }
	        left++;
	        right--;
	    }
	    return true;
	}

}
