package model;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class Line extends AShape {
	protected Point second;

	public Line(Point org, Color color) {
		super(org, color);
		second = new Point(org.x, org.y);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(color);
		g.drawLine(origin.x, origin.y, second.x, second.y);
	}

	@Override
	public void resize(Point second) {
		this.second = second;
	}

}
