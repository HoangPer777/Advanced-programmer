package decuoiki.de2017.decuoiki;

public class bai1 {
	public static String wordCorrect(String a) {
		String result = "";
		boolean flag;
		flag = true;
		char c;
		for (int i = 0; i < a.length(); i++) {
			c = a.charAt(i);
			if (c == ' ') {
				flag = true;
			} else if (flag) {
				c = Character.toUpperCase(c);
				flag = false;
			} else {
				c = Character.toLowerCase(c);
			}
			result += c;

		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(wordCorrect("  Aiuiu   abvc"));
		System.out.println(wordCorrect("  A   Aa"));
		System.out.println(wordCorrect("  A a   A"));
		System.out.println(wordCorrect("  A  A"));
		System.out.println(wordCorrect("  a  a"));

	}

}
