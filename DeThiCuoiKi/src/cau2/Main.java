package cau2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	public List<NhanVien> sapXep(NhanVien[] data) {
		List<NhanVien> NhanViens = new ArrayList<>();

		NhanViens.add(new NhanVien(1, "Phan Van Hoang", 1000));
		NhanViens.add(new NhanVien(2, "Le Phi Hung", 1000));
		NhanViens.add(new NhanVien(3, "Pham Van Tinh", 1000));
		NhanViens.add(new NhanVien(4, "Nguyen Thi Lang", 1000));
		NhanViens.add(new NhanVien(5, "Phan Van Hoang", 2000));

		Collections.sort(NhanViens, new Comparator<NhanVien>() {

			@Override
			public int compare(NhanVien o1, NhanVien o2) {
				// TODO Auto-generated method stub
				if (o1.getName().equals(o2.getName())) {
					return (int) (o2.getLuong() - o1.getLuong());
				}
				return o1.getName().compareTo(o2.getName());
			}

		});

		for (NhanVien nhanVien : NhanViens) {
			System.out.println(nhanVien.toString());
		}

		return NhanViens;

	}

	static class NhanVien {
		int id;
		String name;
		double luong;

		public NhanVien(int id, String name, double luong) {
			super();
			this.id = id;
			this.name = name;
			this.luong = luong;
		}

		public String getName() {
			return name;
		}

		@Override
		public String toString() {	
			return "NhanVien [id=" + id + ", name=" + name + ", luong=" + luong + "]";
		}

		public double getLuong() {
			return luong;
		}

	public void setLuong(double luong) {
		this.luong = luong;
	}

		public void setName(String name) {
		this.name = name;
		}
}


		

	public static void main(String[] args) {
		Main main= new Main();
		NhanVien nhanVien1 = new NhanVien(1, "Phan Van Hoang", 1000);
		NhanVien nhanVien2 = new NhanVien(2, "Le Phi Hung", 1000);
		NhanVien nhanVien3 = new NhanVien(3, "Pham Van Tinh", 1000);
		NhanVien nhanVien4 = new NhanVien(4, "Nguyen Thi Lang", 1000);
		NhanVien nhanVien5 = new NhanVien(5, "Phan Van Hoang", 2000);
		NhanVien[] nhanvien= { nhanVien1, nhanVien2,nhanVien3,nhanVien4,nhanVien5};
		main.sapXep(nhanvien);


	}
}