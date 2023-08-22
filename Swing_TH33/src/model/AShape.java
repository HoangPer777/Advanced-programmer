package model;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public abstract class AShape {
	protected Point origin; // điểm để bắt đầu vẽ
	protected Color color; // màu
	public AShape (Point org, Color color) {
		this.origin = org;
		this.color = color;
	}
	
	public abstract void draw(Graphics g);
	public abstract void resize(Point second);
}
