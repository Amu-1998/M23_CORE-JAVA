package com.cg.statickeyword;

public class StaticBox {
	double width;
	double height;
	static int count=7;
	public StaticBox(double width, double height) {
	}
	{
		this.width=width;
		this.height=height;
	}
	public StaticBox()
	{
		super();
		int cnt=0;
		cnt++;
		System.out.println("count is: "+cnt);
		cnt++;
		System.out.println("count is: "+count);
		
	}

	public static void main(String[] args) {
		StaticBox s=new StaticBox (11,12);
		
		System.out.println(s.width);

	}

}
