package chuong2;

// chua xet th so tan cung la so 5.
import java.util.Scanner;

// Cho số tự nhiên n < 1000. 
//Tính ra cách viết số đó bằng chữ. Ví dụ: 125 đọc là Một trăm hai
public class bai1_14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap nhan can kiem tra: ");
		int n = sc.nextInt();

		String s = Integer.toString(n); // ep kieu int thanh String
		int length_n = s.length(); // kt so co bao nhieu chu so

		String read = null;
		String read2 = null;
		String read3 = null;
		// 2 chu so
		int chuc = n / 10;
		int donVi = n % 10;

		// 3 chu so
		int donVi3 = n % 10;
		int n1 = n / 10;
		int chuc3 = n1 % 10;
		int tram3 = n / 100;

		if (length_n == 1) {
			switch (n) {
			case 1:
				read = "Mot";
				break;
			case 2:
				read = "Hai";
				break;
			case 3:
				read = "Ba";
				break;
			case 4:
				read = "Bon";
				break;
			case 5:
				read = "Nam";
				break;
			case 6:
				read = "Sau";
				break;
			case 7:
				read = "Bay";
				break;
			case 8:
				read = "Tam";
				break;
			case 9:
				read = "Chin";
				break;
			}
			System.out.println(read);

		} else if (length_n == 2 && chuc != 1 && donVi != 1) {
			switch (n) {
			case 10:
				read2 = "Muoi";
				break;
			case 20:
				read2 = "Hai muoi";
				break;
			case 30:
				read2 = "Ba muoi";
				break;
			case 40:
				read2 = "Bon muoi";
				break;
			case 50:
				read2 = "Nam muoi";
				break;
			case 60:
				read2 = "Sau muoi";
				break;
			case 70:
				read2 = "Bay muoi";
				break;
			case 80:
				read2 = "Tam muoi";
				break;
			case 90:
				read2 = "Chin muoi";
				break;
			}
			System.out.println(read2);

		} else if (length_n == 2 && chuc == 1) {
			switch (donVi) {
			case 1:
				read = "Mot";
				break;
			case 2:
				read = "Hai";
				break;
			case 3:
				read = "Ba";
				break;
			case 4:
				read = "Bon";
				break;
			case 5:
				read = "Nam";
				break;
			case 6:
				read = "Sau";
				break;
			case 7:
				read = "Bay";
				break;
			case 8:
				read = "Tam";
				break;
			case 9:
				read = "Chin";
				break;
			}
			System.out.println("Muoi " + read);
		} else if (length_n == 2 && donVi == 1) {
			switch (chuc) {
			case 1:
				read = "Mot";
				break;
			case 2:
				read = "Hai";
				break;
			case 3:
				read = "Ba";
				break;
			case 4:
				read = "Bon";
				break;
			case 5:
				read = "Nam";
				break;
			case 6:
				read = "Sau";
				break;
			case 7:
				read = "Bay";
				break;
			case 8:
				read = "Tam";
				break;
			case 9:
				read = "Chin";
				break;
			}
			System.out.println(read + " Mot");
		} else if (length_n == 3 && chuc3 == 0 && donVi3 == 0) {
			switch (tram3) {
			case 1:
				read = "Mot";
				break;
			case 2:
				read = "Hai";
				break;
			case 3:
				read = "Ba";
				break;
			case 4:
				read = "Bon";
				break;
			case 5:
				read = "Nam";
				break;
			case 6:
				read = "Sau";
				break;
			case 7:
				read = "Bay";
				break;
			case 8:
				read = "Tam";
				break;
			case 9:
				read = "Chin";
				break;
			}
			System.out.println(read + " tram");
		} else if (length_n == 3 && chuc3 == 0) {
			switch (donVi3) {
			case 1:
				read = "Mot";
				break;
			case 2:
				read = "Hai";
				break;
			case 3:
				read = "Ba";
				break;
			case 4:
				read = "Bon";
				break;
			case 5:
				read = "Nam";
				break;
			case 6:
				read = "Sau";
				break;
			case 7:
				read = "Bay";
				break;
			case 8:
				read = "Tam";
				break;
			case 9:
				read = "Chin";
				break;
			}

			switch (tram3) {
			case 1:
				read2 = "Mot";
				break;
			case 2:
				read2 = "Hai";
				break;
			case 3:
				read2 = "Ba";
				break;
			case 4:
				read2 = "Bon";
				break;
			case 5:
				read2 = "Nam";
				break;
			case 6:
				read2 = "Sau";
				break;
			case 7:
				read2 = "Bay";
				break;
			case 8:
				read2 = "Tam";
				break;
			case 9:
				read2 = "Chin";
				break;
			}
			System.out.println(read2 + " tram linh " + read);

		} else if (length_n == 3 && chuc3 != 0 && donVi == 1) {
			switch (tram3) {
			case 1:
				read2 = "Mot";
				break;
			case 2:
				read2 = "Hai";
				break;
			case 3:
				read2 = "Ba";
				break;
			case 4:
				read2 = "Bon";
				break;
			case 5:
				read2 = "Nam";
				break;
			case 6:
				read2 = "Sau";
				break;
			case 7:
				read2 = "Bay";
				break;
			case 8:
				read2 = "Tam";
				break;
			case 9:
				read2 = "Chin";
				break;
			}

			switch (chuc3) {
			case 1:
				read = "Mot";
				break;
			case 2:
				read = "Hai";
				break;
			case 3:
				read = "Ba";
				break;
			case 4:
				read = "Bon";
				break;
			case 5:
				read = "Nam";
				break;
			case 6:
				read = "Sau";
				break;
			case 7:
				read = "Bay";
				break;
			case 8:
				read = "Tam";
				break;
			case 9:
				read = "Chin";
				break;
			}
			System.out.println(read2 + " tram " + read + " muoi mot");

		} else if (length_n == 3 && chuc3 != 0 && donVi == 0) {
			switch (tram3) {
			case 1:
				read2 = "Mot";
				break;
			case 2:
				read2 = "Hai";
				break;
			case 3:
				read2 = "Ba";
				break;
			case 4:
				read2 = "Bon";
				break;
			case 5:
				read2 = "Nam";
				break;
			case 6:
				read2 = "Sau";
				break;
			case 7:
				read2 = "Bay";
				break;
			case 8:
				read2 = "Tam";
				break;
			case 9:
				read2 = "Chin";
				break;
			}

			switch (chuc3) {
			case 1:
				read = "Mot";
				break;
			case 2:
				read = "Hai";
				break;
			case 3:
				read = "Ba";
				break;
			case 4:
				read = "Bon";
				break;
			case 5:
				read = "Nam";
				break;
			case 6:
				read = "Sau";
				break;
			case 7:
				read = "Bay";
				break;
			case 8:
				read = "Tam";
				break;
			case 9:
				read = "Chin";
				break;
			}
			System.out.println(read2 + " tram " + read + " muoi");

		} else if (length_n == 3) {
			switch (tram3) {
			case 1:
				read2 = "Mot";
				break;
			case 2:
				read2 = "Hai";
				break;
			case 3:
				read2 = "Ba";
				break;
			case 4:
				read2 = "Bon";
				break;
			case 5:
				read2 = "Nam";
				break;
			case 6:
				read2 = "Sau";
				break;
			case 7:
				read2 = "Bay";
				break;
			case 8:
				read2 = "Tam";
				break;
			case 9:
				read2 = "Chin";
				break;
			}

			switch (chuc3) {
			case 1:
				read = "Mot";
				break;
			case 2:
				read = "Hai";
				break;
			case 3:
				read = "Ba";
				break;
			case 4:
				read = "Bon";
				break;
			case 5:
				read = "Nam";
				break;
			case 6:
				read = "Sau";
				break;
			case 7:
				read = "Bay";
				break;
			case 8:
				read = "Tam";
				break;
			case 9:
				read = "Chin";
				break;
			}

			switch (donVi3) {
			case 1:
				read3 = "Mot";
				break;
			case 2:
				read3 = "Hai";
				break;
			case 3:
				read3 = "Ba";
				break;
			case 4:
				read3 = "Bon";
				break;
			case 5:
				read3 = "Nam";
				break;
			case 6:
				read3 = "Sau";
				break;
			case 7:
				read3 = "Bay";
				break;
			case 8:
				read3 = "Tam";
				break;
			case 9:
				read3 = "Chin";
				break;
			}
			System.out.println(read2 + " tram " + read + " muoi " + read3);
		}
	}
}
