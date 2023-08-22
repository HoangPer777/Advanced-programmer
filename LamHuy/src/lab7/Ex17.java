package lab7;

import java.util.ArrayList;
import java.util.List;

public class Ex17 {
	public static List<String> getAllSubstrings(String input) {
	    List<String> substrings = new ArrayList<>();
	    int n = input.length();
	    for (int i = 0; i < n; i++) {
	        for (int j = i + 1; j <= n; j++) {
	            substrings.add(input.substring(i, j));
	        }
	    }
	    return substrings;
	}

}
