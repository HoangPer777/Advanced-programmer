package lab7;

import java.util.Arrays;

public class Ex13 {
	public static boolean isAnagramOfEachOver(String input1, String input2) {
	    //Kiểm tra độ dài của hai chuỗi và trả về giá trị false nếu chúng không bằng nhau.
		if (input1.length() != input2.length()) {
	        return false;
	    }
	    //Dùng phương thức toCharArray() để chuyển đổi chuỗi đầu vào 
		//str1 và str2 thành mảng các ký tự tương ứng chars1 và chars2
	    char[] chars1 = input1.toCharArray();
	    char[] chars2 = input2.toCharArray();
	    //Phương thức sort() của lớp Arrays để sắp xếp các ký tự trong hai mảng chars1 và chars2 theo thứ tự của từ điển
	    Arrays.sort(chars1);
	    Arrays.sort(chars2);
	    //equals() so sánh từng phần tử của hai mảng và trả về true nếu các phần tử của hai mảng đều giống nhau.
	    return Arrays.equals(chars1, chars2);
	}
}
