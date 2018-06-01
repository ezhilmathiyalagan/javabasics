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
		if(Length<0.0) {
			this.Length=0;
		}else {
		Length = length;}
	}
	public float getWidth() {
		return Width;
	}
	public void setWidth(float width) 
	{
	if(Width>20.0) {
		Width=0;
	}else {
		Width = width;}
	}
public float getPerimeter()
{
	return 2*(Length+Width);
}
public float getArea()
{
	return (Length*Width);
}
public static void main(String[]arg)
{
	Rectangle r1=new Rectangle();
	r1.setLength(5);
	r1.setWidth(5);
	System.out.println(r1.getPerimeter());
	System.out.println(r1.getArea());
	}
}
