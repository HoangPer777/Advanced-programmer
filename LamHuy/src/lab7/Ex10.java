package lab7;

public class Ex10 {
	// Để kiểm tra xem một chuỗi đã cho chỉ chứa các chữ số hay không,
	//chúng ta có thể sử dụng phương thức matches() của lớp String với biểu thức chính quy (regex) để kiểm tra.
	public static boolean checkStringOnlyDigits(String input) {
		if (input ==  null || input.isEmpty()) {
			return false;
		}
		// sử dụng phương thức matches() để kiểm tra xem chuỗi đầu vào có chỉ chứa các chữ số hay không ? 
		//[0-9]+ ương ứng với một hoặc nhiều chữ số từ 0 đến 9.
		  return input.matches("[0-9]+");
	}
}
