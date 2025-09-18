package edu.wit.cs.comp1000.tests;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import edu.wit.cs.comp1000.PA0a;
import junit.framework.TestCase;

public class PA0aTestCase extends TestCase {
	
	@SuppressWarnings("serial")
	private static class ExitException extends SecurityException {}
	
	public void testOutput() {
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		final String expected = "Hello World!";
		
		System.setOut(new PrintStream(outContent));
		try {
			PA0a.main(new String[] { "foo" });
		} catch (ExitException e) {}
		
		assertEquals(String.format("%s%n", expected), outContent.toString());
		
		System.setOut(null);
	}

}
