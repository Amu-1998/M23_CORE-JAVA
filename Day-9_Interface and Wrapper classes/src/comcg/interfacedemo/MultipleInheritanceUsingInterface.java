package comcg.interfacedemo;
interface Father
{
	void property();
}
interface Mother
{
	void love();
}
class Daughter implements Father,Mother {
	public void love() {
		System.out.println("Mother loves her child");
	}
	public void property() {
		System.out.println("Father gives property to his child");
	}
	
	
	
}
public class MultipleInheritanceUsingInterface {

	public static void main(String[] args) {
		
		Daughter d= new Daughter();
		d.love();
		d.property();

	}

}
