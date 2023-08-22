package ontap;

//public class Matran {
//	public static boolean isIncrease(int[][] arr) {
//		int n = arr.length;
//		int[] numbers = new int[n];
//		for (int i = 0; i < n; i++) {
//			numbers[i] = arr[i][n - 1 - i];
//		}
//		
	
//		for (int i = 0; i < numbers.length - 1; i++) {
//			if (numbers[i] % 2 == 0 || numbers[i] >= numbers[i + 1]) {
//				return false;
//			}
//		}
//		return true;
//	}
//
//	public static void main(String[] args) {
//		int[][] arr = { { 1, 2, 3 }, { 4, 9, 6 }, { 11, 11, 9 } };
//		int[][] arr1 = { { 1, 3, 5, 3 }, { 7, 8, 9, 2}, { 7, 5 ,2, 3 } , { 7, 5, 1, 2 }};
//		int[][] arr2 = { { 1, 2, 3, 4 }, { 5, 6, 7, 8}, { 9, 10 ,11, 12 } , { 13, 14, 15, 16 }};
//		
//		if (isIncrease(arr)) {
//			System.out.println("Cac so tren duong cheo phu la so le tang dan");
//		} else {
//			System.out.println("Cac so tren duong cheo phu khong phai la so le tang dan");
//			
//		}
//	}
//}
public class Matran {
	public static boolean isIncrease(int[][] arr) {
		int n = arr.length;
		int[] numbers = new int[n];
		for (int i = 0; i < n; i++) {
			numbers[i] = arr[i][n - 1 - i];
		}
		boolean isIncrease = true;
		for (int i = 0; i < numbers.length - 1; i++) {
			if (numbers[i] % 2 == 0 || numbers[i] >= numbers[i + 1]) {
				isIncrease = false;
				break;
			}
		}
		return isIncrease;
	}
	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 9, 6 }, { 11, 11, 9 } };
		int[][] arr1 = { { 1, 3, 5, 3 }, { 7, 8, 9, 2}, { 7, 5 ,2, 3 } , { 7, 5, 1, 2 }};
		int[][] arr2 = { { 1, 2, 3, 0 }, { 5, 6, 7, 8}, { 9, -10 ,11, 12 } , { 13, 14, 15, 16 }};
		
		if (isIncrease(arr2)) {
			System.out.println("Cac so tren duong cheo phu la so le tang dan");
		} else {
			System.out.println("Cac so tren duong cheo phu khong phai la so le tang dan");
			
		}
	}
}