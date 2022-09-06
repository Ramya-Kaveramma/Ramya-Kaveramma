// Java Program for Method overloading. Compile-time polymorphism

class Calculate{

	
	static int Multiply(int a, int b)
	{
		return a * b;
	}

	static double Multiply(double a, double b)
	{
		return a * b;
	}
}


class Method_Overloading_Eg {
	public static void main(String[] args)
	{
		System.out.println(Calculate.Multiply(10, 255));
		System.out.println(Calculate.Multiply(5.52, 8.3));
	}
}
