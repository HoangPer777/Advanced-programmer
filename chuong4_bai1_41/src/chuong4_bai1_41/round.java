package chuong4_bai1_41;
/*
 * Viết hàm làm tròn double round(double x, int n) với x là số thực cần làm tròn và n>0 
 * là vị trí muốn làm tròn
 */
public class round {
	public static double Round(double x, int n) {
	    double power = Math.pow(10, n);
	    return Math.round(x * power) / power;
	}
//	Trong đó, Math.pow(10, n) tính giá trị của 10^n, 
//	và Math.round(x * power) / power làm tròn x * power đến số nguyên gần nhất, 
//	sau đó chia cho power để quay trở lại vị trí thập phân cần làm tròn.
	public static void main(String[] args) {
		System.out.println(Round(0.126456789, 2));
	}
}
