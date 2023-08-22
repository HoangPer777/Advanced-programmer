package chuong2;

//Cho 3 số a, b, c. Xét 3 số đó có là 3 cạnh của tam giác. 
//Nếu đúng, thì kiểm tra tam giác đó là 
//tam giác gì? (đều, cân, vuông, vuông cân,thường)
public class bai1_12 {

	public int a, b, c;

	public bai1_12(int a, int b, int c) {
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
	

	public String triangle() {
		if(isTriangle() == true) {
			if (a == b && a == c && b == c) {
				return "Tam giac deu!";
			}
			if (a==b && Math.sqrt(a*a + b*b) == c*c || 
				a==c && Math.sqrt(a*a + c*c) == b*b || 
				b==c && Math.sqrt(b*b + c*c) == a*a)
					return "Tam giac vuong can";  
			
			 if(a==b || a==c || b==c)
				 	return "Tam giac can";	
			 
			 if(Math.sqrt(a*a + b*b) == c*c || 
				Math.sqrt(a*a + c*c) == b*b || 
				Math.sqrt(b*b + c*c) == a*a)
				 return "Tam giac vuong";
			 return "Tam giac thuong";	
		}else
			return null;
	}
	
	
	
	public static void main(String[] args) {
		bai1_12 trianggle = new bai1_12(3, 4, 5); // tam giac vuong
		if (!trianggle.isTriangle()) {
			System.out.println("Day khong la tam giac");
		} else {
			System.out.println(trianggle.triangle());
		}

	}
	
}
