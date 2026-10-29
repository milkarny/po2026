package agh.po.lab3;

import org.junit.Test;
import static org.junit.Assert.*;

public class CodingBatTest {

    CodingBat cb=new CodingBat();

    @Test
    public void sleepIn() {
        assertTrue(cb.sleepIn(false,false));
        assertFalse(cb.sleepIn(true,false));
        assertTrue(cb.sleepIn(false,true));
    }

    @Test
    public void loneTeen() {
        assertTrue(cb.loneTeen(13,99));
        assertTrue(cb.loneTeen(21,19));
        assertFalse(cb.loneTeen(13,13));
    }

    @Test
    public void sum13() {
        assertEquals(6,cb.sum13(new int[]{1,2,2,1}));
        assertEquals(2,cb.sum13(new int[]{1,1}));
        assertEquals(3,cb.sum13(new int[]{1,13,5,2}));
    }

    @Test
    public void firstHalf() {
        assertEquals("Woo",cb.firstHalf("WooHoo"));
        assertEquals("Hello",cb.firstHalf("HelloThere"));
        assertEquals("abc",cb.firstHalf("abcdef"));
    }
}