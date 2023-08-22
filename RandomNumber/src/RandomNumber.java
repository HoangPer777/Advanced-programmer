import java.util.ArrayList;
import java.util.List;

public class RandomNumber {
	public static List<Double> generateNumber(double threshold) {

		List<Double> res = new ArrayList<Double>();
		double value = Math.random();
		while (value > threshold) {
			res.add(value);
			value = Math.random();
		}
		return res;
	}
	
	public static void main(String[] args) {
		List<Double> res = generateNumber(0.1);
		System.out.println("So phan tu: " + res.size());
		for (double value : res) {
			System.out.println(value);
		}
		
	}
}
