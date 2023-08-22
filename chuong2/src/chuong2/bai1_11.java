package chuong2;
//Cho 3 số a, b, c. Xét 3 số đó có là 3 cạnh của tam giác. Nếu đúng, thì tính chu vi, 
//diện tích, và số đo độ của các góc của tam giác.

public class bai1_11 {
	public int a, b, c;

	public bai1_11(int a, int b, int c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	

	public boolean isTriangle() {
		if (a + b >= c && b + c >= a && c + a >= b)
			return true;
		else
			return false;
	}

//	public int perimeter() { // chu vi
//		return a + b + c;
//	}
	public int perimeter() {
		if(isTriangle()) {
			return a+b+c;
		}else
			return 0;	
	}

	public double area() { // dien tich
		double p = (a + b + c) / 2;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}

	public double angleA() {
		double cosA = (b * b + c * c - a * a) / (2 * b * c);
		double tgA = Math.sqrt(1 / (cosA * cosA) - 1);
		return (Math.atan(tgA) * 180) / Math.PI;
	}

	public static void main(String[] args) {
		bai1_11 triangle = new bai1_11(5, 4, 3);
		if (!triangle.isTriangle())
			System.out.println("Day khong la tam giac");
		else {
			System.out.println("Day la tam giac");
			System.out.printf("Chu vi = "+ triangle.perimeter());
			System.out.printf("\nDien tich = %.2f\n", triangle.area()); // \n xuống hàng
			System.out.printf("Goc A = %.2f", triangle.angleA());  // %.2f làm tròn đến 2 chữ số thập phân
		}
	}

}
