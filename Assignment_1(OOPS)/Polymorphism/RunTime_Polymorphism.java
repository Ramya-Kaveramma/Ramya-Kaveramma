// Java Program for Method Overriding. Run time polymorphism

class Mathematics{

	void calculations()
	{

		System.out.println("Calculations");
	}
}


class addition extends Mathematics{

	void calculations() { 
		System.out.println("Addition "); }
}


class subtraction extends Mathematics{
	void calculations()
	{
		System.out.println("Subtraction ");
	}
}


class RunTime_Polymorphism {
	public static void main(String[] args)
	{

		// Creating object of class 1
		Mathematics m;

		// Now we will be calling print methods
		// inside main() method

		m = new addition();
		m.calculations();

		m = new subtraction();
		m.calculations();
	}
}
