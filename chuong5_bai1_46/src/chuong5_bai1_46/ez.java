package chuong5_bai1_46;
//Cho 3 chuỗi s, s1 và s2. Tìm và thay thế tất cả các chuổi s1 trong chuỗi s bằng chuỗi s2.
public class ez {
	public static String Hoang(String s, String s1, String s2) {
		if(s.contains(s1)) {
			return s.replaceAll(s1, s2);
		}else
			return "s ko chua s1"; 
		
		
	}
	public static void main(String[] args) {
		String s = "Hoang Phann pro mai dinh!";
		String s1 = "Phann";
		String s2 = "phan";
		
		System.out.println(Hoang(s, s1, s2));
	}
}
