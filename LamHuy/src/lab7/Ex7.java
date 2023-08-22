package lab7;

public class Ex7 {

	public static char findTheSecondMostFrequentCharacter(String input) {

		// Tạo mảng lưu trữ .
		int numberOfCharacters[] = new int[256];
		// Đếm số lần xuất hiện của từng kí tự trong mảng .
		for (int i = 0; i < numberOfCharacters.length; i++) {
			numberOfCharacters[input.charAt(i)]++;
		}
		// Xác định kí tự nhiều nhát và thứ hai trong chuỗi .
		int max = Integer.MIN_VALUE;
		char secondMax = ' ';
		for (int i = 0; i < numberOfCharacters.length; i++) {
			// Xác định kÍ tự nhiều nhát trong mảng .
			if (numberOfCharacters[i] > numberOfCharacters[secondMax]) {
				max = numberOfCharacters[i];
				secondMax = (char) i;
			} else if ((numberOfCharacters[i] > max && numberOfCharacters[i] < numberOfCharacters[secondMax])) {
				max = numberOfCharacters[i];
				secondMax = (char) i;
			}
		}
		return secondMax;
	}
}
