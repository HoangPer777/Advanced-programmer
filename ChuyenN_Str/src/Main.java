
public class Main {
		public static void main(String[] args) {

//			System.out.println(thousandsSeparator(-10000));
//			System.out.println(thousandsSeparator(-1000));
//			System.out.println(thousandsSeparator(-100000));
//			System.out.println(thousandsSeparator(-0));
//			System.out.println(thousandsSeparator(-1000000000));
		
//			System.out.println(thousandsSeparator(-1));
//			System.out.println(thousandsSeparator(-1000));
			
			System.out.println(dateString("1/11/2023"));
			System.out.println(getMonth("01/12/2023"));
		}

		// định dạng kiểu hiển thị 
		public static String formatNumber(int number) {
			StringBuilder sb = new StringBuilder();
			sb.append(number);
			for (int i = sb.length() - 3; i > -1; i -= 3) {
				sb.insert(i, ',');
			}
			 return sb.toString();
		}
		
		// Dấu phân cách hàng nghìn
		public static String thousandsSeparator(int number) {
			// chuyển từ kiểu dữ liệu int sang String
			StringBuilder sb = new StringBuilder();
			int count = 0;
			if (number >= 0) {
				String s = String.valueOf(number);
				for (int i = s.length() - 1; i > -1; i--) {
					sb.append(s.charAt(i));
					count++;
					if (count % 3 == 0 && i != 0) {
						sb.append(",");
					}
				}
				return sb.reverse().toString();
			} else {
				String s = String.valueOf(Math.abs(number));
				for (int i = s.length() - 1; i > -1; i--) {
					sb.append(s.charAt(i));
					count++;
					if (count % 3 == 0 && i != 0) {
						sb.append(",");
					}
				}
				return "-" + sb.reverse().toString();
			}
		}

		public static String getMonth(String date) {
			return date.substring(date.indexOf("/") + 1, date.lastIndexOf("/"));

		}

		public static String monthString(String date) {
			return switch (getMonth(date)) {
			case "1" -> "January";
			case "2" -> "February";
			case "3" -> "March";
			case "4" -> "April";
			case "5" -> "May";
			case "6" -> "June";
			case "7" -> "July";
			case "8" -> "August";
			case "9" -> "September";
			case "10" -> "October";
			case "11" -> "November";
			case "12" -> "December";
			default -> "";
			};
		}

		public static String dateString(String date) {
			return date.substring(0, date.indexOf("/")) + " " + monthString(date) + " "
					+ date.substring(date.lastIndexOf("/") + 1);
		}
	
}
