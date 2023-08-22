package testCode;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		method no = new method();
		
		System.out.println("Nhap so nguyen bat ky: ");
		Scanner sc = new Scanner(System.in);
	
		int n = sc.nextInt();
		if(no.isPrime(n))
			System.out.println(n + " la so NT");
		else
			System.out.println(n + " ko la so NT");
		
		
	}
}
