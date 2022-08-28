package com.cg.enums;

enum TrafficLight
{
	RED(30),Yellow(10),Green(30);
	private final int seconds;

	//constructor
	private TrafficLight(int seconds) {
		this.seconds = seconds;
	}
	//getter method only because we use constructor to set the value
	public int getSeconds() {
		return seconds;
	}
	
}

public class EnumWithTrafficLights {

	public static void main(String[] args) {
		for(TrafficLight i:TrafficLight.values())
		{
			//value method is used to access all the values inside the constants.
			System.out.printf("%s: %d seconds\n",i,i.getSeconds());
		}
		

	}

}
