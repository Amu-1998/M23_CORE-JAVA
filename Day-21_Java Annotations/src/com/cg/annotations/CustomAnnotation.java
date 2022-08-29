package com.cg.annotations;
@interface  Custom
{
	//abstract method
	//If any custom annotation as single method then it is called as single-value annotation
	String print() default "Ahmed";
	int speed() default 3;
	float percentage() default 7.3f;
}
class B
{
	@Custom (print="Hello Students",speed =50,percentage=87.2f)
	public void diplay()
	{
		System.out.println("Hurrat! Its a holiday");
	}
}

public class CustomAnnotation {

	public static void main(String[] args) {
		B b=new B();
		b.diplay();
		
	}

}
