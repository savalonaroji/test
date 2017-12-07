/*class Test
{
    public static void main(String[] args)
    {
        Test obj = new Test()
        {
            public int hashCode()
            {
                return 40;
            }
        };
        System.out.println(obj.hashCode());
    }
}*/

class Person
{
    public int number;
}
public class Test{
    public void doIt(int i , Person p){
        i = 5;
        p.number = 8;
    }

    public static void main(String args[]){
        int x = 0;
        Person p = new Person();
        new Test().doIt(x, p);
        System.out.println(x + " " + p.number);

    }
}