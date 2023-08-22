import java.util.ArrayList;
import java.util.List;

public class SumInt {
	public static boolean isNghichDao(int n) {
		String m = String.valueOf(n);
		String m1 = Integer.toString(n);
		StringBuilder strB = new StringBuilder(m);
		StringBuilder b = strB.reverse(); // đảo ngược chuỗi
		String c = b.toString(); // dạng StringBuilder thành string
		int n1 = Integer.parseInt(c);// rồi chuyển lại thành int

		if (n == n1) {
			return true;
		}
		return false;
	}

	public static int sumInt(int n) {
		int sum = 0;
		String m = String.valueOf(n);
		List<Character> charList = new ArrayList<>();
		for (char ch : m.toCharArray()) { // chuyển string thành char array
			charList.add(ch);
		}

		List<Integer> intList = new ArrayList<>();
		for (Character ch : charList) {
			intList.add(Character.getNumericValue(ch)); // chuyển char thành int rồi add vào intList
		}

		for (Integer integer : intList) {
			sum += integer;
		}

		return sum;
	}

	public static void main(String[] args) {
		int n = 1234321;
		System.out.println(isNghichDao(n));
		System.out.println();
		System.out.println(sumInt(n));

	}

}
