
public class Cau1 {
	public static int[][] MuoiDiem(int arr[]) {
		// tạo và thêm vào arr đường chéo phụ
		int arr2[][] = new int[arr.length][arr.length];
		for (int i = 0; i <= arr.length - 1; i++) {
			arr2[i][arr.length - i - 1] = arr[arr.length - i - 1];
		}

		// thêm các phần tử còn lại bên trái
		for (int i = 0; i <= arr.length - 1 - 1; i++) {
			for (int j = arr.length - 1 - 1 - i; j >= 0; j--) {
				arr2[i][j] = arr2[i][j + 1] - 2;

			}
		}

		// thêm các phần tử còn lại bên phải
		for (int i = arr.length - 1; i >= 0; i--) {
			for (int j = 1 + (arr.length - 1 - i); j <= arr.length - 1; j++) {
				arr2[i][j] = arr2[i][j - 1] + 2;

			}
		}

		// in ra màng hình
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				System.out.print(arr2[i][j] + "\t");
			}
			System.out.println();
		}
		return null;
	}

	public static void main(String[] args) {
		int arr[] = { 9, 5, 3, 10, 8, 20 };	
		int arr2[] = { 9, 5, 3, 10, 8, 20, 5,-3 };
		int arr3[] = {  5,-3 };
		int arr4[] = {  -5,3 };
		int arr5[] = {  -5};
		int arr6[] = { 10, 8, 20 };	
		MuoiDiem(arr);
		System.out.println();
		MuoiDiem(arr2);
		System.out.println();
		MuoiDiem(arr3);
		System.out.println();
		MuoiDiem(arr4);
		System.out.println();
		MuoiDiem(arr5);
		System.out.println();
		MuoiDiem(arr6);
		
	}
}
