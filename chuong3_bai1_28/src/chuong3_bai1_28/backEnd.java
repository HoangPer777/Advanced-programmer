package chuong3_bai1_28;
//Vừa gà vừa chó có 36 con, 100 chân. Hỏi có mấy con gà mấy con chó?
public class backEnd {
	public static void chicken_dog(){
		/*
		 *  x + y = 36
		 *  2x + 4y = 100
		 * => 2 * (36 - y) + 4y = 100
		 */
		for(int y = 1; y <= 36 ; y++) {
			if(2 * (36 - y) + 4*y == 100) {
				System.out.println("Dog is: " + y);
				System.out.println("Chicken is: " + (36 - y));
			}
		}
	}
}
