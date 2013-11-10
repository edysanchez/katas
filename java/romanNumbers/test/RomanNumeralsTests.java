import static org.junit.Assert.*;

import org.junit.Test;


public class RomanNumeralsTests {

    @Test 
    public void noZero() {
        assertEquals("", RomanNumerals.translate(0));
    }
    
    @Test 
    public void one() {
        assertEquals("I", RomanNumerals.translate(1));
    }
    
    @Test 
    public void two() {
        assertEquals("II", RomanNumerals.translate(2));
    }
    
    @Test 
    public void three() {
        assertEquals("III", RomanNumerals.translate(3));
    }
    
    @Test
    public void four() {
        assertEquals("IV",RomanNumerals.translate(4));
    }
    
    @Test
    public void five() {
        assertEquals("V",RomanNumerals.translate(5));
    }
    
    @Test
    public void six() {
        assertEquals("VI",RomanNumerals.translate(6));
    }
    @Test
    public void nine() {
        assertEquals("IX",RomanNumerals.translate(9));
    }  
    @Test
    public void ten() {
        assertEquals("X",RomanNumerals.translate(10));
    }
    
}
