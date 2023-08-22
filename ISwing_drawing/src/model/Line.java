package model;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class Line extends AShape {
	Point second;
	

	public Line(Point origin, Color color) {
		super(origin, color);
		// TODO Auto-generated constructor stub
		second = new Point(origin.x, origin.y);
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(color);
		g.drawLine(origin.x, origin.y, second.x, second.y);
		
	}

	@Override
	public void reSize(Point second) {
		// TODO Auto-generated method stub
		this.second = second;

	}

}
