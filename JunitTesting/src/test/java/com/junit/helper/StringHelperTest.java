package com.junit.helper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class StringHelperTest {

	StringHelper helper = new StringHelper();

	String input;
	String expectResult;

	@BeforeClass
	public static void BeforeClass() {
		System.out.println("Before class");
	}

	public StringHelperTest(String input, String expectResult) {
		super();
		this.input = input;
		this.expectResult = expectResult;
	}

	@Parameters
	public static Collection<String[]> parameters() {

		String expectedresult[][] = { { "AACD", "CD" }, { "ABAD", "BD" } };
		return Arrays.asList(expectedresult);
	}

	@Before
	public void setup() {
		System.out.println("Before test");
	}

	@Test
	public void testTruncateAInFirst2Positions() {
		assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
		System.out.println("test1");
	}

	@Test
	public void testTruncateAInFirst2Positions2() {
		System.out.println("test2");
		assertEquals("BD", helper.truncateAInFirst2Positions("ABAD"));
	}

	@Test
	public void testAreFirstAndLastTwoCharactersTheSame() {
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
		System.out.println("test3");
	}

	@Test
	public void testAreFirstAndLastTwoCharactersTheSame2() {
		System.out.println("test4");
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
	}

	@After
	public void teardown() {
		System.out.println("After test");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("Afters class");
	}

}
