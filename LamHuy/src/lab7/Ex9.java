package lab7;

public class Ex9 {
	// Để đếm số từ trong một chuỗi đã cho ta có thể sử dụng phương thức split() của lớp String
	// Để tách chuỗi thành một mảng các từ, sau đó đếm số lượng phần tử trong mảng đó.
	
	public static int countWord(String input) {
		// kiểm tra nếu chuỗi đầu vào là null hoặc rỗng (isEmpty()), phương thức sẽ trả
		// về 0.
		if (input == null || input.isEmpty()) {
			return 0;
		}
		// Phương thức split() để tách chuỗi thành một mảng các từ, với biểu thức chính quy (regex) \\s+.
		// Biểu thức này tương ứng với một hoặc nhiều khoảng trắng (dấu cách, tab, xuống dòng, v.v.).
		String[] counts = input.split("\\s+");
		return counts.length;
	}
}
