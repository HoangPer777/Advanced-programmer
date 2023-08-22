package chuong3_bai1_24;
/*
 * Cho số tiền gởi ngân hàng P, lãi suất tiền gởi từng tháng r, số tháng gởi n. 
 * Tính và xuất số tiền sẽ được rút ra F sau n tháng theo công thức F = P(1 + r)^n

 */
public class Method {
	public static double savingMoney(int P, int n) {
		double savingMoney = Math.pow(P * (1 + 0.05), n);
		return savingMoney;
	}
}
