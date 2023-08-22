package chuong6_1_bai1_60;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * *Cho một dãy gồm n số
a) Tìm các phần tử xuất hiện đúng một lần trong dãy.
b) Tìm các phần tử xuất hiện nhiều hơn 1 lần trong dãy.
	Ví dụ dãy 8 2 7 3 7 2 4 5 2 4
		Câu a) 8 3 5
		Câu b) 2 7 4
 */

// sử dụng hashMap để đếm các phần tử trong mảng
public class Find {
	public static void main(String[] args) {
		int arr[] = { 8, 2, 7, 3, 7, 2, 4, 5, 2, 4 };
		Map<Integer, Integer> map = new HashMap<>();
		
		

		// Đếm số lần xuất hiện của các phần tử trong mảng
		// map này chưa key là các giá trị của arr còn value là số lần xuất hiện
		for (int i = 0; i < arr.length; i++) { // duyệt các phần tử trong mảng
			if (map.containsKey(arr[i])) { // kiểm tra trong map đã có phần chưa
				map.put(arr[i], map.get(arr[i]) + 1); // nếu đã có rồi thì tăng lên 1
			} else {
				map.put(arr[i], 1); // nếu chưa có thì thêm nó vào 
			}
		}

		// Duyệt lại mảng và in ra các phần tử xuất hiện đúng một lần
		System.out.print("Cac phan ta xuat hien dung mot lan trong mang la: ");
		for (int i = 0; i < arr.length; i++) {
			if (map.get(arr[i]) == 1) {
				System.out.print(arr[i] + " ");
			}
		}
		
		System.out.println();
		// tạo ra một cái list mới thêm các value nếu nó xuất hiện trên 1 lần
		List<Integer> result = new ArrayList<>(); // Dùng hashSet
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                result.add(entry.getKey());
            }
        }
        System.out.println("Cac phan tu xuat hien nhieu hon 1 lan la: " + result);
	}

}
