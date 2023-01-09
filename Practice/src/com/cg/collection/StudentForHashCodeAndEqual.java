package com.cg.collection;

import java.util.Objects;

public class StudentForHashCodeAndEqual {
	private int rollno;
	private String name;
	
	
	public StudentForHashCodeAndEqual(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}
	@Override
	public String toString() {
		return "StudentForHashCodeAndEqual [rollno=" + rollno + ", name=" + name + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(rollno);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentForHashCodeAndEqual other = (StudentForHashCodeAndEqual) obj;
		return rollno == other.rollno;
	}

	
	
	
	

}
