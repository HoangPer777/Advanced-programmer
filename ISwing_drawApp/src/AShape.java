import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public abstract class AShape {
	protected Point origin;
	protected Color colors;
	protected Point second;
	public AShape(Point origin, Color colors) {
		super();
		this.origin = origin;
		this.colors = colors;
	}
	
	protected abstract void draw(Graphics g);
	protected abstract void reSize(Point second);
	
	
}
