package org.Add;

public class GreenTech {
	
	//method
	private void greensOMR() {
		System.out.println("GREENS TECHNOLOGY");
	}
	//1.based on type
	private void greensOMR(char c) {
		System.out.println('@'+c);
}
	//2.based on DT count
	private void greensOMR(int i,float f,String name) {
		System.out.println("integer"+i);
		System.out.println("float25.67f"+f);
		System.out.println("monisha"+name);
	}
	//based on Order chnaged 
	private void greensOMR(float f,int i,String name) {
		System.out.println("float25.67f"+f);
		System.out.println("integer"+i);
		System.out.println("monisha"+name);
	}
	public static void main(String[] args) {
	GreenTech g=new GreenTech();
	g.greensOMR();
	g.greensOMR('m');
	g.greensOMR(25.77f, 12,"sona");	
	g.greensOMR(22.22f, 12, "nina");
		
	}
	
}
