public class FormatDate {
	public static void Month_String(String date) {
		String[] months = {"","Jan","Feb","Mar","Api","May","Jun","Jul","Aug","Sep","Oct","Nov","Dev"};
		String[] Date, Month, Year;
		
//		Date = date.split("/");
		String[] result = date.split("/");
		for(int i = 0; i < 3; i++) {
			System.out.print(result[i] + ", ");
		}
		
		
		
//		System.out.println(Date + " " + Month + " " + Year);
	}
	public static void main(String[] args) {
		Month_String("12/04/2023");
	}
}

