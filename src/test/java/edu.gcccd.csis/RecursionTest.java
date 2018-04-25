package edu.gcccd.csis;

import org.junit.Test;

import java.util.Random;
import static edu.gcccd.csis.Recursion.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

public class RecursionTest {

    @Test
    public void printEveryOtherTest() {
        int[] test = new int[]{1,2,3,4,5,6,7,8,9,10};
        int[] nullTest = null;
        //Functional argument cases
        assertTrue("9753".equals(printEveryOther(test,2)));
        assertTrue("108642".equals(printEveryOther(test,1)));
        assertTrue("975".equals(printEveryOther(test,4)));
        //Error Cases
        assertNull(printEveryOther(nullTest,5));
        assertNull(printEveryOther(test,-1));
        assertEquals("",printEveryOther(new int[] {},600));
        assertEquals("",(printEveryOther(test,11)));
    }

    @Test
    public void printStarsTest() {
        //Functional argument cases
        assertTrue("h*he*el*lo*o".equals(printStars("hheelloo")));
        assertTrue("h*h*h*h*h".equals(printStars("hhhhh")));
        assertTrue("hel*lo".equals(printStars("hello")));
        assertTrue("as*sertion tes*seract".equals(printStars("assertion tesseract")));
        // Error-Empty Cases
        assertEquals("",printStars(""));
        assertEquals(null,printStars(null));
    }

    @Test
    public void sumTest() {
        for (int i = 0; i < 10; i++) {
            int k = new Random().nextInt(100);
            assertEquals(k * (k + 1) / 2, Recursion.sum(k));
        }
        // corner cases
        assertEquals(0, Recursion.sum(-1));
        assertEquals(0, Recursion.sum(0));
        try {
            int x = Recursion.sum(Integer.MAX_VALUE); // stackoverflow
            fail("");
        } catch (StackOverflowError error) {
            assertTrue(true);
        }
    }


}

