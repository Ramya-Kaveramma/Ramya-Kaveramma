// creating an interface named Book
interface Book{
	void Chapter1();
	void Chapter2();
	void Chapter3();
}



// implementing the interface,Book
abstract class Reading implements Book{
	
	// Overriding two methods of the interfacem,Book
	public void Chapter1()
	{
		System.out.println("Chapter1 : Introduction");
	}
	public void Chapter2()
	{
		System.out.println("Chapter2 : Data Types");
	}

	public void Chapter3()
	{
		System.out.println("Chapter3 : Operators");
	}
}


class Java extends Reading {
    public void exam()
    {
        System.out.println("Prepare for java exam.......");
    }
}
  

public class Main {
    public static void main(String[] args)
    {
        // New Java object is created
        Java test = new Java ();
  
        // Calls to the multiple functions
        test.Chapter1();
        test.Chapter2();
        test.Chapter3();
    }
}
