package model;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class Rect extends AShape {
	Point second;

	

	public Rect(Point origin, Color color) {
		super(origin, color);
		second = new Point(origin.x, origin.y);
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(color);
		int x = Math.min(origin.x, second.x);
		int y = Math.min(origin.y, second.y);
		
		int weight = Math.abs(origin.x - second.x);
		int height = Math.abs(origin.y - second.y);
		g.drawRect(x, y, weight, height);
		
	}

	@Override
	public void reSize(Point second) {
		// TODO Auto-generated method stub
		this.second = second;
	}

}
