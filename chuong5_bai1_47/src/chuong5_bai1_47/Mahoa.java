package chuong5_bai1_47;
//Cho chuỗi s. Mã hóa chuỗi s bằng cách dịch chuyển các ký tự trong chuỗi s tiến tới 3 vị trí 
//trong bảng chữ cái. Chỉ mã hóa với các kí tự trong khoảng: a-z; A-Z và 0-9. Các kí tự khác giữ 
//nguyên
public class Mahoa {
	public static String MaHoaDichChuoi(String str) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if('a' <= ch && ch <= 'z') {
				 ch = (char) ((ch - 'a' + 3) % 26 + 'a');
			}
			if('A' <= ch && ch <= 'Z') {
				ch = (char) ((ch - 'A' + 3) % 26 + 'A');
			}
			if('0' <= ch && ch <= '9') {
				 ch = (char) ((ch - '0' + 3) % 10 + '0');
			}
			sb.append(ch);
		}
		return sb.toString();
		
	}
	
	public static void main(String[] args) {
		System.out.println(MaHoaDichChuoi("1Phan 2Van 3Hoang"));
		System.out.println(MaHoaDichChuoi("abcxyz"));
	}
}
