package com.cg.oops;
class Pulser
{
  public int speed;
  public String color;
  
  Pulser(int speed,String color){
	  this.speed=speed;
	  this.color=color;
  }
  void accept()
  {
	  
	  System.out.println("Speed is: "+speed+"km/hr" +" and color is: "+color);
	  
  }
}
public class ParameterizedConstructor {

	public static void main(String[] args) {
		Pulser p=new Pulser(50,"Black");
		p.accept();

	}

}
