package model;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public abstract class AShape {
	protected Point origin;
	protected Color color;
	
	public AShape(Point origin, Color color) {
		super();
		this.origin = origin;
		this.color = color;
	}
	public abstract void draw(Graphics g);
	public abstract void reSize(Point second);
	
}
