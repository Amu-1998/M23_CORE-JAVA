package comcg.interfacedemo;
interface A
{
	//abstract method by default
	void print();
	void display();

}
class B implements A
{
	public void print() {
		System.out.println("Tns");
		
	}
	public void display()
	{
		System.out.println("Java full stack");
	}
}
public class InterfaceExample {

	public static void main(String[] args) {
		B b=new B();
		
		b.print();
		b.display();

	}

}
