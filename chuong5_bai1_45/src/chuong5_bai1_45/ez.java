package chuong5_bai1_45;
//Cho 2 chuỗi s và s1. Tìm vị trí đầu tiên chuỗi s1 xuất hiện trong chuỗi s
public class ez {
	public static int StartXuatHien(String s, String s1) {
		int i = s.indexOf(s1);
		
		return i;
		
	}
	public static void main(String[] args) {
		String s = "toi la Hoang ne ae";
		String s1 = "la";
		System.out.println(StartXuatHien(s, s1));
	}
}
