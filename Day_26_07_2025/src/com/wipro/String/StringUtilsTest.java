package com.wipro.String;
import static org.Junit.jupiter.api.Assertions.*;
import Org.Junit.jupiter.api.Test;
class StringUtilsTest {

    public void testUpperCaseTrue() {
        assertTrue(StringUtils.isUpperCase("HELLO"));
    }
    public void testUpperCaseFalse() {
        assertFalse(StringUtils.isUpperCase("Hello"));
    }
    private void assertFalse(boolean upperCase) {
		// TODO Auto-generated method stub
		
	}
	public void testEmptyString() {
        assertTrue(StringUtils.isUpperCase(""));
    }
    public void testWithSymbolsAndNumbers() {
        assertTrue(StringUtils.isUpperCase("123!@#"));
    }
	private void assertTrue(boolean upperCase) {
		// TODO Auto-generated method stub
		
	}
}
