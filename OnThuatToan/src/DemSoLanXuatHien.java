public class DemSoLanXuatHien {
	public static int xuatHien(int x, int arr[]) {
		int count = 0;
		for (int i : arr) {
			if (arr[i] == x) {
				count++;
			}
		}
		return count;
	}

	public static void xuatHienPlus(int arr[]) {
		

	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 1, 2 };
		System.out.println(xuatHien(2, arr));
		xuatHienPlus(arr);
	}
}
