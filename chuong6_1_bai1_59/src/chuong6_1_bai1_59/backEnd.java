package chuong6_1_bai1_59;

/*
 * Cho một dãy gồm n số.
a) Kiểm tra xem dãy có đối xứng hay không. Ví dụ dãy sau là đối xứng: 4 2 7 3 7 2 4
b) Kiểm tra xem dãy có đan dấu hay không. Ví dụ dãy sau là đan dấu: 2 -1 7 -3 4 -5 6
 */
public class backEnd {
	public static boolean symmetry(int arr[]) {
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[arr.length - 1 - i]) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean knittingChain(int arr2[]) {
		for(int i = 0; i < arr2.length -1; i++) {
			if(arr2[i] * arr2[i+1] > 0) {
				return false;
			}
		} 
		return true;
	}

	public static void main(String[] args) {
		int arr[] = { 4, 2, 7, 3, 7, 2, 4 };
		int arr2[] = { 2, -1, 7, -3, 4, -5, 6 };
		
		System.out.println("Mang tren doi xung phai khong: " + symmetry(arr));
		System.out.println();
		System.out.println("Mang tren co dan dau phai ko: " + knittingChain(arr2));
	}
}
