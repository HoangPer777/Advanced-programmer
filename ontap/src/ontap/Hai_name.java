package ontap;

public class Hai_name {

	public static void numberToString(int num) {
		String[] words = { "Không", "Một", "Hai", "Ba", "Bốn", "Năm", "Sáu", "Bảy", "Tám", "Chín" };
		if (num < 10) {
			System.out.println(words[num]);
		}
		if (num >= 10 && num < 100) {
			int chuc = num / 10;
			int donVi = num % 10;
			if(donVi==1) {
				words[donVi]="Mốt ";
			}
			System.out.println(words[chuc] + " Mươi " + words[donVi]);
		}
		if (num >= 100 && num < 1000) {
			int tram = num / 100;
			int chuc1 = num % 100;
			int chuc2 = chuc1 / 10;
			int donVi = num % 10;
			if(donVi==1 && chuc2!=0) {
				words[donVi]="Mot";
				System.out.println(words[tram] + " Tram " + words[chuc2] + " Mươi " + words[donVi]);
			}
			else if(chuc2==0) {
				words[chuc2]="Lẻ ";
				System.out.println(words[tram] + " Trăm " + words[chuc2] + words[donVi]);
			}
			else System.out.println(words[tram] + " Trăm " + words[chuc2] + " Mươi " + words[donVi]);
		}

	}

	public static void main(String[] args) {
		int num = 131;
		numberToString(num);
	}


}
