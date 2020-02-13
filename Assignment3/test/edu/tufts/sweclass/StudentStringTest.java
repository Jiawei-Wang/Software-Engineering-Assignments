package edu.tufts.sweclass;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class StudentStringTest {

    private StudentStringInterface studentstring;

    @Before
    public void setUp() {
        studentstring = new StudentString();
    }

    @After
    public void tearDown() {
        studentstring = null;
    }

    /*
     * Testing the method countNum
     * */

    @Test
    public void countNumTest1() {
        studentstring.setString("-L3t'5 try t0 add 50me d161t5!!-");
        assertEquals(6, studentstring.countNum());
    }

    @Test
    public void countNumTest2() {
        studentstring.setString("12345");
        assertEquals(1, studentstring.countNum());
    }

    @Test
    public void countNumTest3() {
        studentstring.setString("1 2 3 4 5");
        assertEquals(5, studentstring.countNum());
    }

    @Test
    public void countNumTest4() {
        studentstring.setString(null);
        assertEquals(0, studentstring.countNum());
    }

    @Test
    public void countNumTest5() {
        studentstring.setString("");
        assertEquals(0, studentstring.countNum());
    }

    @Test
    public void countNumTest6() {
        studentstring.setString("Try1ng t0 mak6 t3st case5");
        assertEquals(5, studentstring.countNum());
    }

    @Test
    public void countNumTest7() {
        studentstring.setString("111a222b333c444b555e");
        assertEquals(5, studentstring.countNum());
    }

    @Test
    public void countNumTest8() {
        studentstring.setString("sqrt(2) = 1.41");
        assertEquals(3, studentstring.countNum());
    }

    /*
     * Testing the method rotateChar
     * */

    /* length % n != 0 */
    @Test
    public void rotateCharTest1() {
        studentstring.setString("I am taking the SW Engineering Class Fall 2018");
        assertEquals(" amItak ng ihe tW ESginnerieg CnasslFal  20l81", studentstring.rotateChar(4, false));
    }

    @Test
    public void rotateCharTest2() {
        studentstring.setString("I am taking the SW Engineering Class Fall 2018");
        assertEquals("mI ak ta ing theESW nngiieerCng slasl Fa0l 281", studentstring.rotateChar(4, true));
    }

    /* length % n == 0 */
    @Test
    public void rotateCharTest3() {
        studentstring.setString("123456789012");
        assertEquals("412385672901", studentstring.rotateChar(4, true));
    }

    @Test
    public void rotateCharTest4() {
        studentstring.setString("123456789012");
        assertEquals("234167850129", studentstring.rotateChar(4, false));
    }

    /* length < n */
    @Test
    public void rotateCharTest5() {
        studentstring.setString("1234567890");
        assertEquals("0123456789", studentstring.rotateChar(12, true));
    }

    @Test
    public void rotateCharTest6() {
        studentstring.setString("1234567890");
        assertEquals("2345678901", studentstring.rotateChar(12, false));
    }

    /* length % n != 0 */
    @Test
    public void rotateCharTest7() {
        studentstring.setString("12345");
        assertEquals("41235", studentstring.rotateChar(4, true));
    }

    @Test
    public void rotateCharTest8() {
        studentstring.setString("12345");
        assertEquals("23415", studentstring.rotateChar(4, false));
    }

    /* n <= 0 */
    @Test(expected = IllegalArgumentException.class)
    public void rotateCharTest9() {
        studentstring.setString("123 456 789 ");
        studentstring.rotateChar(0, false);
    }

    @Test(expected = IllegalArgumentException.class)
    public void rotateCharTest10() {
        studentstring.setString("123 456 789 ");
        studentstring.rotateChar(-1, false);
    }

    /* Null string case */
    @Test(expected = NullPointerException.class)
    public void rotateCharTest11() {
        studentstring.setString(null);
        studentstring.rotateChar(4, true);
    }

    /* empty string case */
    @Test
    public void rotateCharTest12() {
        studentstring.setString("");
        assertEquals("", studentstring.rotateChar(4, true));
    }
}