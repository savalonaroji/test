/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;


class TestClass {
    public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running
		*/

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        String [] str = br.readLine().split(" ");
        BigInteger prev = BigInteger.ZERO;
        for (int i = 0; i < N; i++) {
        	BigInteger b = new BigInteger(str[i]);
        	b = b.multiply(BigInteger.valueOf(i+1)).subtract(prev);
            System.out.print(b);
            System.out.print(" ");
            prev = prev.add(b);
        }
        

        //System.out.println("Hello World!");
    }
}