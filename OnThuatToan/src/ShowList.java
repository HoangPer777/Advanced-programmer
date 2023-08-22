import java.util.ArrayList;
import java.util.List;

/*
 * Viết chương trình tìm tất cả các số chia hết cho 7 nhưng không phải bội số của 5,
 *  nằm trong đoạn 10 và 200 (tính cả 10 và 200). 
 *  Các số thu được sẽ được in thành chuỗi trên một dòng, cách nhau bằng dấu phẩy.
 */
public class ShowList {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for (int i = 10; i <= 200; i++) {
			if ((i % 7 == 0) && (i % 5 != 0)) {
				list.add(i);
			}
		}
		inList(list);
		
		
	}

	private static void inList(List<Integer> list) {
		// TODO Auto-generated method stub
		if (list != null && !list.isEmpty()) {
			int size = list.size();
			for (int i = 0; i <= size - 1; i++) {
				System.out.print(list.get(i) + ", ");
			}
//			System.out.println(list.get(size - 1)); // nếu ko cmt chỗ này và đk for chỉ là < chứ ko phải <= size -1 thì gt cuối sẽ ko có dấu phẫy
		}

	}

	
	

}
