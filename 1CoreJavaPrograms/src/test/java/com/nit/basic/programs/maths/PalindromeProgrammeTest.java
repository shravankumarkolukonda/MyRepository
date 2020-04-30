package com.nit.basic.programs.maths;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import com.nit.basic.maths.PalindromeProgramme;

public class PalindromeProgrammeTest {

	@Test
	public void testCheckPalindorme() {
		Assert.assertEquals("353 is palindrome number", PalindromeProgramme.checkPalindorme(353));
	}

//	@Test
//	public void testPrintPalindorme() {
//		fail("Not yet implemented");
//	}

}
