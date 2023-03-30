package studio7;

import edu.princeton.cs.introcs.StdDraw;

public class Rectangles {
	
	private double width;
	private double length;
	
	public Rectangles(double initWidth, double initLength)
	{
		width = initWidth;
		length = initLength;
	}
	
	public double getWidth()
	{
		return width;
	}
	
	public double getLength()
	{
		return length;
	}
	
	public void setWidth(double newWidth)
	{
		width = newWidth;
	}
	
	public void setLength(double newLength)
	{
		length = newLength;
	}
	
	public String toString()
	{
		return "Rectangle: length = " + length + ", width = " + width + ", area = " + length * width;
	}
	public void drawRectangle()
	{
		StdDraw.filledRectangle(0.1, 0.1, width, length);
	}
	
	public double calculateArea()
	{
		return length*width;
	}
	
	public double calculatePerimeter()
	{
		return 2*length+2*width;
	}
	
	public boolean squareMaybe()
	{
		if (length == width)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args) {
		Rectangles r1 = new Rectangles(0.1,0.3);
		r1.drawRectangle();
		System.out.println(r1.calculateArea());
		System.out.println(r1.calculatePerimeter());
		System.out.print(r1.squareMaybe());
	}

}
