package edu.gcccd.csis;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static edu.gcccd.csis.Recursion.*;
import static org.junit.jupiter.api.Assertions.*;

class RecursionTest {

    @Test
    public void printEveryOtherTest(){
        int[] test = new int[]{1,2,3,4,5,6,7,8,9,10};
        int[] nullTest = null;
        //Functional argument cases
        assertTrue("9753".equals(printEveryOther(test,2)));
        assertTrue("108642".equals(printEveryOther(test,1)));
        assertTrue("975".equals(printEveryOther(test,4)));
        //Error Cases
        assertNull(printEveryOther(nullTest,5));
        assertNull(printEveryOther(test,-1));
    }

    @Test
    public void printStarsTest(){

        //Functional argument cases
        assertTrue("h*he*el*lo*o".equals(printStars("hheelloo")));
        assertTrue("h*h*h*h*h".equals(printStars("hhhhh")));
        assertTrue("hel*lo".equals(printStars("hello")));
        assertTrue("as*sertion tes*seract".equals(printStars("assertion tesseract")));
        // Error-Empty Cases
        assertEquals("",printStars(""));
        assertEquals(null,printStars(null));

    }
}