import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class Circle extends AShape {

	public Circle(Point origin, Color colors) {
		super(origin, colors);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(colors);
		int x = Math.min(origin.x, second.x);
		int y = Math.min(origin.y, second.y);
		int weight = Math.abs(origin.x - second.x);
		int height = Math.abs(origin.y - second.y); 
		g.drawOval(x, y, weight, height);
	}

	@Override
	protected void reSize(Point second) {
		// TODO Auto-generated method stub
		this.second = second;
	}

}
