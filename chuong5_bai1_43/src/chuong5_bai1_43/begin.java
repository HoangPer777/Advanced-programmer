package chuong5_bai1_43;

/*
 * Nhập vào chuỗi s. 
a) Đếm số từ trong chuỗi.
b) In các từ trong chuỗi s mỗi từ một dòng.
c) Đảo ngược thứ tự các từ trong chuỗi
 */
import java.util.Scanner;

public class begin {
	// cau a
	public static int size(String string) {
		int length = string.length();
		return length;
	}

	// cau b
	public static void Inln(String string) {
//		for (int i = 0; i < string.length(); i++) {
//			System.out.print("" + string.charAt(i));
//			char c = string.charAt(i);
//			if (String.valueOf(c).equals(" ")) {  // cách so sánh char với String
//				System.out.println();
//			}
//		}
		String arr[] = string.split(" ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

//	public static String reverseWords(String str) {
//		String arr[] = new String [str.length()];
//	    StringBuilder result = new StringBuilder();
//	    String[] words = str.split(" ");
//	    for (int i = words.length - 1; i >= 0; i--) {
//	        result.append(words[i]).append(" ");
//	    }
//	    for(int i = 0; i < words.length -1 ; i++) {
//	    	arr[i] = words[i];
//	    }
//	    return result.toString().trim(); //trim để xóa khoảng trắng ở đầu và cuối chuỗi
//	}
//	public static String reverseWords(String str) {
//	    String[] words = str.split(" ");
//	    if (words.length == 1) {
//	        return str;
//	    } else {
//	        return words[words.length - 1] 	+ " " + 
//        	 reverseWords(str.substring(0, str.length() - words[words.length - 1].length() - 1));
//	    }
//	}
	public static void reverseWords(String str) {
		String word[] = str.split(" ");
		for (int i = word.length - 1; i >= 0; i--) {
			System.out.print(word[i] + " ");
		}

	}

	public static void main(String[] args) {
		System.out.print("Nhap chuoi muon xu ly: ");
		Scanner sc = new Scanner(System.in);
		String string = sc.nextLine();

		System.out.println("Do dai chuoi la: " + size(string));

		System.out.println("inln");
		Inln(string);

		System.out.println("\n//////");
//		System.out.println(reverseWords(string));
		reverseWords(string);
	}
}
