package testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.netty.util.internal.SystemPropertyUtil;

public class Test2 {
	
	@BeforeMethod
	public void setup() {
		System.out.println("setup");
	}

	@Test
	public void test1() {
		System.out.println("testcase 1st run");
	}
	@Test
	public void test2() {
		System.out.println("testcase 2nd run");
	}
	@Test
	public void test3() {
		System.out.println("testcase 3rd run");
	}
	
	
}
