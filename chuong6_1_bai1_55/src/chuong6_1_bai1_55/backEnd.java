package chuong6_1_bai1_55;

import java.util.Arrays;

/*
 *	Bai 1.55 
 * Cho n số. Đảo thứ tự của dãy theo nguyên tắc sau: 
 * A[1] đổi cho với A[n], A[2] đổi cho với A[n-1], ... 
 * In kết quả ra màn hình. 
 */
public class backEnd {
	public static void ReverseArray(int[] array) {
		
		// dễ hiểu hơn.
		int n = array.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = array[i];
            array[i] = array[n - 1 - i];
            array[n - 1 - i] = temp;
        }
        System.out.println("Reversed array: " + Arrays.toString(array));
        
        // tạo ra các arr mới rồi import các phần tử vào theo thứ tụ ngược
//        int n = array.length;
//        int[] reversedArray = new int[n];
//        for (int i = 0; i < n; i++) {
//            reversedArray[i] = array[n - 1 - i];
//        }
//        System.out.println("Reversed array: " + Arrays.toString(reversedArray));
	}
}
