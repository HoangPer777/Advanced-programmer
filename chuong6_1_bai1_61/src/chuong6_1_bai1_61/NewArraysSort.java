package chuong6_1_bai1_61;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/*
 * Cho một dãy gồm n số. Hãy tạo ra một dãy mới gồm các phần tử khác nhau trong dãy và sắp 
xếp theo thứ tự tăng dần. In dãy kết quả ra màn hình.
 */
public class NewArraysSort {
	public static void main(String[] args) {
		int[] arr = { 5, 2, 8, 1, 3, 2, 8, 7 , 4, 6};
		
// các phần tử có sự trung lặp cần thay bằng set để loại bỏ sự trùng lặp với set có value lặp sẽ đc ghi đè
//		List<Integer> list = new ArrayList<>();
//		for (int x : arr) {
//			list.add(x);
//		}
//		Collections.sort(list);
		
		Set<Integer> set = new HashSet<>();
		for (int x : arr) {
			set.add(x);
		}
		List<Integer> list = new ArrayList<>(set);
		Collections.sort(list);

		System.out.print("Day moi gom cac phan tu khac nhau trong day va sap xep theo thu tu tang dan: ");
		for (int x : list) {
			System.out.print(x + " ");
		}
		

	}

}
