package chuong5_bai1_44;

/*
 * 4 Nhập vào chuỗi s. 
a) Đổi chuỗi s ra chữ in.
b) Đổi ký tự đầu của mỗi từ trong chuỗi s thành chữ in, các ký tự còn lại thành chữ thường.
c) Xóa các khoảng trắng thừa trong chuỗi s: các khoảng trắng trước và sau, xóa bớt các 
khoảng trắng ở giữa các từ chỉ để lại một.
 */
public class HoangPro {
	// cau a
	public static void InHoa(String str) {
		System.out.println(str.toUpperCase());
	}

	// cau b
	public static String TenRieng(String str) {
		String word[] = str.split(" ");
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < word.length; i++) {
			sb.append(word[i].substring(0, 1).toUpperCase() + word[i].substring(1) + " ");
			
		}
		return sb.substring(0);
	}
	
	// cau c
	public static String rmSpace(String str) {
		String Str = str.replaceAll("\\s+", " ").trim(); // \\s là khoảng trắng còn \\s+ là nhiều khoảng trắng liên tiếp
		
		return Str;
	}
	
	public static void main(String[] args) {
		InHoa("phan van hoang");
		System.out.println(TenRieng("phan van hoang"));
		System.out.println(rmSpace("   phan  van          hoang "));
	}
}
