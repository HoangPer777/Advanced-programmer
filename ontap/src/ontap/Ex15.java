package ontap;

import java.util.Arrays;

public class Ex15 {
	public static boolean isContains(int[] arr1, int[] arr2) {
		String str1 = Arrays.toString(arr1);
		String str2 = Arrays.toString(arr2);
		return str1.contains(str2);

	}
	
	public static void main(String[] args) {
		int arr1[] = { 0, 1, 2, 3, 4, 5, 6 };
		int arr2[] = { 1, 2, 3 };
		System.out.println("mang 1 chua mang 2: " + isContains(arr1, arr2));

	}
}
