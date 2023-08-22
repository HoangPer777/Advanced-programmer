package chuong4_bai1_37;
/*
 * 1.37 Viết hàm int freheit(int c) để đổi từ độ Celsius (bách phân) 
 * sang độ Frenheit theo công thức F = 9*C/5 + 32 và in ra bảng chuyển đổi từ -50 đến 50
 */
// còn làm tròn số lẻ, phải xuất theo kiểu double
public class TemperatureChange {
	public static int freheit(int c) {
		int F = 9*c/5 +32;
		
		System.out.println("Bang chuyen doi C -> F");
		for(int i = -50; i < 50; i++) {
			int T = 9*i/5 +32;
			System.out.println( i + " == " + T);
		}
		System.out.print(c +  "*C =");
		return F;
	}
	
	public static void main(String[] args) {
		System.out.println(freheit(30)+ "*F");
		
	}
	 
}
