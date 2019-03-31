package model;
import java.lang.Math;

public class Rectangle{
	
	//Atributes
	private double base;
	private double height;
	
	//Constructor
	public Rectangle(){
		
		base=1;
		height=1;
		
	}
	
	//Do
	public double calculateArea(){
		
		double area=base*height;
		
		return area;
		
	}
	
	public double calculatePerimeter(){
		
		double perimeter=(2*base)+(2*height);
		
		return perimeter;
		
	}
	
	public double calculateDiagonal(){
		
		double math=((base*base)+(height*height));
		double diagonal=Math.sqrt(math);
		
		return diagonal;
		
	}
	
	//Get
	public double getBase(){
		
		return base;
		
	}
	
	public double getHeight(){
		
		return height;
		
	}
	
	//Set
	public void setBase(double base){
		
		this.base=base;
		
	}
	
	public void setHeight(double height){
		
		this.height=height;
		
	}
	
}