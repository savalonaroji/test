/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;


class TestClass2 {
    public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running
		*/

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        
        for (int i = 0; i < N; i++) {
        	String [] str = br.readLine().split(" ");
        	BigInteger no1 = new BigInteger(str[0]);
        	BigInteger no2 = (new BigInteger(str[1])).subtract(BigInteger.ONE);
        	BigInteger rem = BigInteger.ZERO;
        	String result = "";
        	if(no2 == BigInteger.ZERO)
        	{
        		System.out.println("(" + no1 + "<<" + rem + ")");
        	}
        	else
        	{
        		rem = no2.mod(BigInteger.valueOf(2));
        		no2 = no2.divide(BigInteger.valueOf(2));
        		result = "(" + no1 + "<<" + rem + ")" + result;
        		
        		while(no2 != BigInteger.ZERO)
            	{
        			rem = no2.mod(BigInteger.valueOf(2));
            		no2 = no2.divide(BigInteger.valueOf(2));
            		result = "(" + no1 + "<<" + rem + ")" + " + " + result;
            	}
        		
        		System.out.println(result);
        	}
        }
        
        //System.out.println("Hello World!");
    }
}