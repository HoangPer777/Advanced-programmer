import java.util.HashMap;
import java.util.Map;

public class UserManagement {
	Map<String, String> users; // HashMap<Key, Value> numbers 
//	Key là code định danh duy nhất được sử dụng để liên kết từng phần tử (value) trong map	
//	Value là các phần tử được liên kết bởi các key trong map
	
	public UserManagement() { // một hàm constractor khởi tạo user
		users = new HashMap<>();
		/*
		 * new HashMap<>(8, 0.6). Ở đây, tham số đầu tiên là capacity - dung lượng của Hashmap
		 * và tham số thứ hai là loadFactor - Hệ số tải là 0,6. Điều này có nghĩa là bất cứ khi 
		 * nào bảng băm của chúng ta được lấp đầy 60%, các mục mới sẽ được chuyển sang bảng băm 
		 * mới có kích thước gấp đôi bảng băm ban đầu.
		 * 
		 * Nếu để trống <> thì sẽ từ động điền tùy vào ngữ cảnh
		 */
		generateUserData();
	}

	private void generateUserData() {
		users.put("pvthuan", "12345");
		users.put("lphung", "LPHung");
		users.put("HoangPhan", "MatKhau!");
		
	}
	
	public boolean login(String username, String pass) {
		String storedPass = users.get(username);
		return storedPass.equals(pass);
	}
	
	public static void main(String[] args) {
		UserManagement um = new UserManagement();
		String username = "pvthuan";
		String pass = "12345";
		
		boolean isLogin = um.login(username, pass);
		System.out.println(isLogin? "Dang nhap than cong!" : "Ten dang nhap hoac mat khau khong hop le!");
				
	}
	
	
}
