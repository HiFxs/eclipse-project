package test_demo;

import org.junit.Test;

public class java_demo extends Thread {
	public static java_demo t;
@Test
public void test() {
	StringBuilder str=new StringBuilder("stringBulider");
	str.append("success!");
	System.out.println(str);
	System.out.println(str.capacity());
	System.out.println(str.charAt(4));
	
	
	
}
	
}
