package lab7;

public class Ex4 {
	public static String findLargestWord(String input) {
		// " \\s " đại diện cho ký tự khoảng trắng, và + là ký tự đặc biệt để chỉ một
		// hoặc nhiều ký tự liên tiếp.
		// Tách chuỗi input thành một mảng các từ, phân tách bởi khoảng trắng.
		String[] words = input.split("\\s+");
		
		// output(largest word) là chuỗi rỗng các từ lớn nhất để lưu trữ từ dài nhất trong chuỗi
		// input.
		String output = "";
		// Vòng lặp for-each trong Java để duyệt qua mỗi từ trong mảng words .
		for (String word : words) {
			if (word.length() > output.length()) {
				// "if" để so sánh độ dài của từ word đang được duyệt với độ dài của từ output
				// hiện tại.
				output = word;
			}
		}
		return output;
	}
}
