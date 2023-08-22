//package cau2;
//
//import java.util.Comparator;
//
//public class NhanVien implements Comparator<NhanVien>{
//	int id;
//	String name;
//	double luong;
//	public NhanVien(int id, String name, double luong) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.luong = luong;
//	}
//	public String getName() {
//		return name;
//	}
//	@Override
//	public String toString() {
//		return "NhanVien [id=" + id + ", name=" + name + ", luong=" + luong + "]";
//	}
//	public double getLuong() {
//		return luong;
//	}
//	public void setLuong(double luong) {
//		this.luong = luong;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	
//	@Override
//	public int compare(NhanVien o1, NhanVien o2) {
//		// TODO Auto-generated method stub
//		if (o1.getName().equals(o2.getName())) {
//			return (int) (o1.getLuong() - o2.getLuong());
//		}
//		return o1.getName().compareTo(o2.getName());
//	}
//	
//	NhanVien nhanVien1 = new NhanVien(1, "Phan Van Hoang", 1000);
//	NhanVien nhanVien2 = new NhanVien(2, "Le Phi Hung", 1000);
//	NhanVien nhanVien3 = new NhanVien(3, "Pham Van Tinh", 1000);
//	NhanVien nhanVien4 = new NhanVien(4, "Nguyen Thi Lang", 1000);
//	NhanVien nhanVien5 = new NhanVien(5, "Vo Thi Cam Tu", 1000);
//	
//}
