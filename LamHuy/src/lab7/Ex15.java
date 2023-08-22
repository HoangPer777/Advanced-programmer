package lab7;

public class Ex15 {
	public static String capitalizeWords(String input) {
	    String[] words = input.split("\\s+");
	    //Sử dụng phương thức split("\\s+") để tách câu thành các từ riêng biệt
	    
	    StringBuilder sb = new StringBuilder();
	    for (String word : words) {
	    	//Sau đó, với mỗi từ, phương thức sẽ lấy ký tự đầu tiên và viết hoa nó bằng cách sử dụng phương thức toUpperCase()
	    	sb.append(word.substring(0, 1).toUpperCase());
	        sb.append(word.substring(1));
	        sb.append(" ");
	    }
	    return sb.toString().trim();
	}

}
