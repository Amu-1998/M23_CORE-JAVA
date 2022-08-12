package coom.cg.array;

public class Varags {
	//variable argument ...(ellipse)=>
	
	static void print(int a,int b, String...s)
	{
		System.out.println(a+","+b);
		
	//To print VARAGS
	    for(int i=0;i<s.length;i++)
	    {
		    System.out.println(s[i]+"\t");
	    }
	}

	public static void main(String[] args) {
		//function call
		print(13,65,"Python","Java","c++");

	}

}
