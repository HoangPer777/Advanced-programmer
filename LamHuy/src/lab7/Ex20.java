package lab7;

public class Ex20 {
	public static String removeSpecialChars(String input) {
	    return input.replaceAll("[^a-zA-Z0-9]", "");
	}

}
