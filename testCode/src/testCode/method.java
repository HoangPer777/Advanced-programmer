package testCode;

public class method {
	public boolean isPrime(int n) {
		if (n <= 1) { // be hơn hoặc bằng 1 ko phải là số nguyên tố
			return false;
		}
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

}
