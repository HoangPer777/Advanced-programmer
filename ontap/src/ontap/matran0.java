package ontap;

public class matran0 {
	public static boolean isIncrease(int[][] arr) {
		int n = arr.length;
		int[] numbers = new int[n];
		for (int i = 0; i < n; i++) {
			numbers[i] = arr[i][n - 1 - i];
		}
		
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 != 0 && numbers[i] < numbers[i + 1]) {
				return true;
			} else
				return false;
		}

		return true;
	}

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		if (isIncrease(arr)) {
			System.out.println("Cac so tren duong cheo phu la so le tang dan");
		} else {
			System.out.println("Cac so tren duong cheo phu khong phai la so le tang dan");
		}
	}
}
