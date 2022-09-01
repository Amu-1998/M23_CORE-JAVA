package com.cg.applications;

import com.cg.Framework.SavingAcc;

public class MMSavingAcc extends SavingAcc
{

	//constructors
	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal, isSalaried);
		
	}

	@Override
	public String toString() {
		return String.format("MMSavingAcc []");
	}
	
}
