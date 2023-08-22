package model;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class Rectangle extends AShape {
	Point second;

	public Rectangle(Point org, Color color) {
		super(org, color);
		second = new Point(origin.x, origin.y);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(color);
		int x = Math.min(origin.x, second.x);
		int w = Math.abs(origin.x - second.x);

		int y = Math.min(origin.y, second.y);
		int h = Math.abs(origin.y - second.y);
		g.drawRect(x, y, w, h); // điểm đầu tiên có tọa độ nhỏ nhất trong hai điểm 
								// có chiều dài và chiều rộng là 2 hiệu của 2 điểm	
	}

	@Override
	public void resize(Point second) {
		this.second = second;
	}

}
