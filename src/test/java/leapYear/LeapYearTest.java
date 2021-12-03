package leapYear;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import leapYear.LeapYear;

class LeapYearTest {

	@Test
	 public void testIsPrime() {
        assertTrue("Result", LeapYear.checkLeapYear(2020));  
        assertEquals(true,LeapYear.checkLeapYear(2012));

    }

}
