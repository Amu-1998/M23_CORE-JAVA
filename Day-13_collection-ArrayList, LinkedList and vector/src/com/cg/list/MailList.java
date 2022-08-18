package com.cg.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class Address
{
	private int plotno;
	private String Street;
	private String Area;
	private String  City;
	private String State;
	public Address(int plotno, String street, String area, String city, String state) {
		super();
		this.plotno = plotno;
		Street = street;
		Area = area;
		City = city;
		this.State = state;
	}
	@Override
	public String toString() {
		return String.format("Address [plotno=%s, Street=%s, Area=%s, City=%s, State=%s]", plotno, Street, Area, City,
				State);
	}
}

public class MailList {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		List<Address>obj=new LinkedList<>();
		obj.add(new Address(12, "sec-12", "Koparkhairne", "Navi Mumbai", "Maharashtra"));
		obj.add(new Address(10, "sec-22", "pimpri", "pune", "Maharashtra"));
		Iterator i=obj.iterator();
		while(i.hasNext())
		{
			Object elem=i.next();
			System.out.println(elem+"\n");
			
		}
		
	}

}
