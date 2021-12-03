package leapYear;

import static org.junit.Assert.*;

import org.junit.Test;

import leapYear.LeapYear;


public class LeapYearTest {

	@Test
	 public void testIsLeapYear() {
        assertTrue("Result", LeapYear.checkLeapYear(2020));  
        assertEquals(true,LeapYear.checkLeapYear(2012));

    }

}
