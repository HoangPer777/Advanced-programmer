package chuong3;
//Năm nay cha 35 tuổi, con 4 tuổi. 
//Tính xem sau bao nhiêu năm nữa tuổi cha gấp đôi tuổi con.
public class bai1_18 {
	public static void main(String[] args) {
		int cha = 35;
		int con = 4;
		
		do {
			cha ++;
			con ++;
		}while(cha == 2*con);
		
//		while(true){
//			cha ++;
//			con ++;
//			
//			if(cha == 2*con) {
//				break;
//			}
//			
//		}
		System.out.println(cha +" "+ con);
		
	}
}
