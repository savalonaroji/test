
/*public class Main {

	
	public static synchronized void main(String[] args) throws InterruptedException {
		
		Thread t = new Thread();
		t.start();
		System.out.println("X");
		t.wait(10000);
		System.out.println("Y");
		
		LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
		Period p = Period.ofDays(1).ofYears(2);
		d = d.minus(p);
		DateTimeFormatter f = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		System.out.println(f.format(d));
	}
}*/

import java.util.*;
public class Main {
public static void addNumbers(List<? super Integer> list) {
for (int i = 1; i <= 10; i++) {
list.add(i);
}
}
public static void main(String args[]) {
   List<Double> ld = Arrays.asList();
   //addNumbers(10.4);
   System.out.println("getList(2)");
}
}
