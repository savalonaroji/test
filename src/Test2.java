
class ABC extends Thread
{
	int i = 2;
	
	public ABC()
	{
		System.out.println("test");
		i = 5;
		start();
	}
	
	@Override
	public void start() 
	{
		System.out.println("abc");
		i *= 2;
	}
	
	public void display() throws InterruptedException
	{
		join();
		i = i - 1;
	}
}

public class Test2 
{
	public static void main(String[] args) throws InterruptedException {
		
		ABC A = new ABC();
		A.display();
		System.out.println(A.i);
		
	}
}
