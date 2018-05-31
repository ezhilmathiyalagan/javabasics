package com.basic;

public class Rectangle {
	float Length;
	float Width;
	public Rectangle() {
		
	}
	public float getLength() {
		return Length;
	}
	public void setLength(float length) {
		if(Length<0.0)
		Length = length;
	}
	public float getWidth() {
		return Width;
	}
	public void setWidth(float width) 
	{
	if(Width>20.0)
		Width = width;
	}
public double getPerimeter()
{
	return 2*(Length+Width);
}
public double getArea()
{
	return (Length*Width);
}
public static void main(String[]arg)
{
	Rectangle r1=new Rectangle();
	r1.setLength(1);
	r1.setWidth(1);
	System.out.println(r1.getPerimeter());
	System.out.println(r1.getArea());
	}
}
