package decuoiki.src.bai1va2;

public class bai22 {
	//bo chu hoa
	public static String lowerString(String a) {
		String s="";
		if(a.length()!=0||a!=null) {
			for (int i = 0; i < a.length(); i++) {
				char c=a.charAt(i);
				if(c>='a'&&c<='z') {
					s+=c;
				}
			}
		}
		return s;
		//bo chu hoa va chu giong nhau
	}
public static void main(String[] args) {
	//bo chu hoa
	System.out.println(lowerString("HhAapPpyY"));
}
}
