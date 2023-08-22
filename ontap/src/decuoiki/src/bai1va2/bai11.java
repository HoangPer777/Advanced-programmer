package decuoiki.src.bai1va2;

public class bai11 {
	// kiem so nto
	public static boolean isPrime(int a) {
		if (a < 2)
			return false;
		if (a == 2)
			return true;
		for (int i = 2; i < Math.sqrt(a); i++) {
			if (a % i == 0)
				return false;
		}
		return true;
	}

	// dem so
	public static int isCount(int b) {
		int count = 0;
		int result = -1;
		while (result != 0) {
			result = b % 10;
			b /= 10;
			count++;
		}
		return count;
	}

	// good bad
	public static String isPrimeOrNot(int c) {
		String g = "Good";
		String b = "Bad";
		if (isPrime(c)) {
			return g;
		}
		return b;
	}

	public static void main(String[] args) {
		// kiem so nto
		System.out.println(isPrime(13));
		System.out.println(isPrime(14));
		System.out.println(isPrime(2));
		System.out.println("-----------");
		// dem so
		System.out.println(isCount(123443));
		System.out.println("-----------");
		// good bad
		System.out.println(isPrimeOrNot(45));
		System.out.println(isPrimeOrNot(43));
		System.out.println("-----------");

	}
}
