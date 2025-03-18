package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FuzzyGetColorTest
{
    @Test
    void colorCheck1()
    {  
        Fuzzy color1 = new Fuzzy("Blue");
        assertEquals(color1.getColor(), "Blue");

    }

    @Test
    void colorCheck2()
    {  
        Fuzzy color1 = new Fuzzy("Black");
        assertEquals(color1.getColor(), "Black");

    }

    @Test
    void colorCheck3()
    {  
        Fuzzy color1 = new Fuzzy("Aquamarine");
        assertEquals(color1.getColor(), "Aquamarine");

    }

    @Test
    void colorCheck4()
    {  
        Fuzzy color1 = new Fuzzy("Not a color, just a string");
        assertEquals(color1.getColor(), "Not a color, just a string");

    }

}