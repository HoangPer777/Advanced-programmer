
public class ArrayOperation {
	public static int[] arrPlus(int arr1[], int arr2[]) {
		int [] result;
		int [] minArr, maxArr;
		
		// kiểm tra xem mảng nào dài hơn 
		if(arr1.length > arr2.length) {
			maxArr = arr1;
			minArr = arr2;
		}else {
			maxArr = arr2;
			minArr = arr1;
		}
		
		
		result = new int [maxArr.length]; // result là mảng có độ dai bằng độ dài mảng dài nhất 
		// cộng 2 phần tử trên mảng có cùng độ dài
		for(int i = 0; i < minArr.length; i++) {
			result[i] = arr1[i] + arr2[i];
			
		}
		
		// điền các phần tử của mảng dài hơn vào các phần tử trống trong mảng kết quả 
		for(int i = minArr.length; i< maxArr.length; i++) {
			result[i] = maxArr[i];	
		}
		return result; // là mảng kết quả 
	}
	
 // để xuất các phần tử ra màng hình 
	public static void displayArray(int[] arr) {
		for(int a:arr) { // duyệt từng phần tử trong mảng 
			System.out.print(a + ",");
		}
	}
	
	public static void main(String[] args) {
		int[] arr1 = {9,8,7};
		int[] arr2 = {4,2};

		int[] res = arrPlus(arr1, arr2);
		displayArray(res);
	}
}
