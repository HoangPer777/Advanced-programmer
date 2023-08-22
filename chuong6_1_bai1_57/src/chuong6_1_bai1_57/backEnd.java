package chuong6_1_bai1_57;

import java.util.Arrays;
import java.util.List;

/*
 *  Cho n số và số x. 
a) Xác định xem số x có xuất hiện trong dãy không? 
b) Cho biết số x xuất hiện trong dãy bao nhiêu lần và tại các vị trí nào?
c) Cho n số và số x. Loại bỏ khỏi dãy tất cả các phần tử bằng x. In cả 2 dãy ra màn hình.
 */
public class backEnd {

	// cau a
	public static boolean appearCount(int arr[], int x) {
		for (int i : arr) {
			if (i == x) {
				return true;
			}
		}
		return false;

	}

	// cau b
	public static void appearLocation(int arrB[], int x) {
		int Count = 0; // so lan xuat hien
		int index = 1; // vi tri xuat hien
		for (int i : arrB) {
			if (i == x) {
				Count++;
				System.out.println("xuat hien o vi tri " + index);
			}
			index++;
		}
		System.out.println("Tong co " + Count + " lan xuat hien");
	}

	// Cau C
	// nếu element cần xóa ở 2 vị trí liên tiếp thì nó bị sai
	
	// Nếu rảnh đổi thuật toán thành 
	/*
	 * + đếm xem có bao nhiêu phần tử cần xóa
	 * + tạo mảng mới với kích thước = arr cũ trừ đi số phần tử cần xóa
	 * + duyệt từng phần tử mảng cũ nên nó khác phần tử cần xóa thì import vào
	 */
	public static void removeElement(int arr3[], int element) {
		// in đề ra trước
//		for (int j = 0; j < arr3.length; j++) {
//			System.out.print(arr3[j] + ", ");
//		}
		System.out.println(Arrays.toString(arr3));
		System.out.println();

		for (int i = 0; i < arr3.length; i++) {
			if (element == arr3[i]) {
				for (int j = i; j < arr3.length - 1; j++) {
					arr3[j] = arr3[j + 1];
				}
				arr3 = Arrays.copyOf(arr3, arr3.length - 1);
			}
			

		}

		// in kết quả
//		for (int j = 0; j < arr3.length; j++) {
//			System.out.print(arr3[j] + ", ");
//		}
		System.out.println(Arrays.toString(arr3));

	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		System.out.println("x co trong mang phai khong: " + appearCount(arr, 2));
		System.out.println("////////////");

		int arrB[] = { 1, 3, 6, 4, 8, 3, 2, 9, 10, -4, -2 };
		appearLocation(arrB, 3);
		System.out.println("///// ///");

		System.out.println("Cau c");
		int arr3[] = { 6, 3, 3, 4, 8, 3, 2, 9, 10, -4, -3, 3, 8 };
		removeElement(arr3, 3);
//		System.out.println(arr3);

	}

}
