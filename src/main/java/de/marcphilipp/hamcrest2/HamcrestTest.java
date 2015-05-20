package de.marcphilipp.hamcrest2;

import static org.hamcrest.CoreMatchers.startsWith;
import static org.hamcrest.junit.MatcherAssert.assertThat;

public class HamcrestTest {

	public static void main(String[] args) {
		assertThat(System.getProperty("java.runtime.version"), startsWith("1.6.0"));
	}
}
