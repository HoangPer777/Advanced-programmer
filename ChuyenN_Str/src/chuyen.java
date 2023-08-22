
public class chuyen {
	public static StringBuilder Num_String_Duong(int num) {
		StringBuilder string = new StringBuilder(Integer.toString(num));
		for (int i = string.length() - 3; i > 0; i -= 3) {
			string.insert(i, ",");
		}
		return string;
	}
	public static StringBuilder Num_String(int num) {
		if(num >= 0) {
			return Num_String_Duong(num);
		}else {
			num = - num;
			System.out.print("-");
			return Num_String_Duong(num);
		}
		
	}
	public static void main(String[] args) {
		System.out.println(Num_String(314));
		System.out.println(Num_String(1000000000));
		System.out.println(Num_String(1));
		
		System.out.println(Num_String(-100));
		System.out.println(Num_String(-1000000));


	}
}
