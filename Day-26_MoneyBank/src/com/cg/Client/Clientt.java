package com.cg.Client;

import com.cg.Framework.BankFactory;
import com.cg.Framework.CurrentAcc;
import com.cg.Framework.SavingAcc;
import com.cg.applications.MMBankFactory;
import com.cg.applications.MMCurrentAcc;
import com.cg.applications.MMSavingAcc;

public class Clientt {

	public static void main(String[] args) 
	{
		BankFactory b=new MMBankFactory();
		SavingAcc s=new MMSavingAcc(101, "Ahmed Najeeb", 5000, true);
		CurrentAcc c=new MMCurrentAcc(102, "Fidha Mariyam", 7000, 200);
		
		System.out.println("Saving Account: ");
		s.withdraw(5000);
		
		System.out.println("Current Account: ");
		c.withdraw(7000);
		
		System.out.println(s);
		System.out.println(c);
		

	}

}
