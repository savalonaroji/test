class A
{
	int i =10;
	public void display ()
	{
		System.out.println("A");
	}
}


class B extends A{
	int i =11;
	public void display ()
	{
		System.out.println("B");
	}
}

public class C
{
	public static void main(String[] args) {
		A a = new B();
		a.display();
		System.out.println(a.i);
	}
}
