
public class Encode {
	public static void encode(String string) { // int arr[][]
		int lengthString = string.length();
		char arr[][] = new char[5][lengthString / 5 + 10]; // chưa biết bao nhiêu dòng
//		System.out.println(" length string " + lengthString  );

		for (int i = 0; i < 4; i++) {
			for (int j = 0, k =0; j < 4 ; j++ ) {
					arr[i][j] = string.charAt(k++);
				
//				if(char[k].equals(" ")) {
//					
//				}

			}
		}

		// In ra màn hình các giá trị 
		for (int i = 0; i <= arr.length - 1; i++) {
			for (int j = 0; j <= arr.length - 1; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	

	}

	public static void main(String[] args) {

		encode("I am student");
	}
}
