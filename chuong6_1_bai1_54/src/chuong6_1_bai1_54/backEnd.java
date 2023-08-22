package chuong6_1_bai1_54;

/* 
 * Nhập vào n số nguyên
a) Đếm số phần âm, dương, bằng 0 của dãy.
b) Xác định số âm lớn nhất và số dương nhỏ nhất.
c) Cho biết | tổng âm| có bằng tổng dương không
 */
public class backEnd {

//	int[] arr = { -8, 3, -6, 1, 5, 3, -7, 2, 1, 7, 4, -3, 7, 2, 3 };
	public static void classify(int arr[]) {
		int count = 0;
		int count2 = 0;
		int count3 = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				count++;
			}
			if (arr[i] < 0) {
				count2++;
			}
			if (arr[i] > 0) {
				count3++;
			}
		}
		System.out.println("So phan tu bang 0 trong mang la: " + count);
		System.out.println("So phan tu lon hon 0 trong mang la: " + count2);
		System.out.println("So phan tu be hon 0 trong mang la: " + count3);
	}

	// se bi sai neu trong mang co cac phan tu lon hon 1000
	public static void cauB(int[] arr) {
//		int negativeMax = -1000;
//		int largestPositive = 1000;
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] < 0) {
//				if (arr[i] > negativeMax) {
//					negativeMax = arr[i];
//				}
//			}
//			if (arr[i] > 0) {
//				if (arr[i] < largestPositive) {
//					largestPositive = arr[i];
//				}
//			}
//		}
//		System.out.println("Cau B:");
//		System.out.println("So am lon nhat: " + negativeMax);
//		System.out.println("So duong be nhat: " + largestPositive);
		int negativeMax = Integer.MIN_VALUE; //So am lon nhat
		int positiveMin = Integer.MAX_VALUE; // So duong be nhat
		for(int i = 0; i < arr.length;i++) {
			if((arr[i] > negativeMax && arr[i]< 0)) {
				negativeMax = arr[i];
			}
			if((arr[i] < positiveMin) && arr[i] > 0) {
				positiveMin = arr[i];
			}
		}
		System.out.println("Cau B:");
		System.out.println("So am lon nhat: " + negativeMax);
		System.out.println("So duong be nhat: " + positiveMin);
		
	}

	public static void sum(int arr[]) {
		int negative_sum = 0;
		int positive_sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				negative_sum += arr[i];
			}
			if (arr[i] > 0) {
				positive_sum += arr[i];
			}
		}
		
		if(negative_sum == Math.abs(positive_sum)) {
			System.out.println("Tong duong bang tong am! ");
		}else {
			System.out.println("Tong duong khong bang tong am! ");
		}
		
	}

}
