package ui;
import model.*;
import java.util.Scanner;

public class Main{
	
	public static void main(String[]args){
		
		Main m=new Main();
		m.menu();
		
	}
	
	public void menu(){
		
		Rectangle rectangle = new Rectangle();
		Scanner s=new Scanner(System.in);
		
		System.out.print("Digite la base:");
		
		double base=s.nextDouble();
		s.nextLine();
		
		rectangle.setBase(base);
		
		System.out.print("Digite la altura:");
		
		double height=s.nextDouble();
		s.nextLine();
		
		rectangle.setHeight(height);
		
		System.out.print("Informacion del rectangulo \n Area:"+rectangle.calculateArea()+"\n Perimetro:"+rectangle.calculatePerimeter()+"\n Diagonal:"+rectangle.calculateDiagonal());
		
	}
	
}