package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

public class FuzzySearcherTest
{
    FuzzySearcher s;

    @BeforeEach
    void setUpSearcher()
    {
        s = new FuzzySearcher();

    }

    @Test
    void fuzzyList1Linear()
    {
        ArrayList<Fuzzy> l1 = new ArrayList<>();
        l1.add(new Fuzzy("blue"));
        l1.add(new Fuzzy("gold"));
        l1.add(new Fuzzy("red"));
        assertEquals(s.linearFuzzySearcher(l1, "gold"), 1);

    }

    @Test
    void fuzzyList2Linear()
    {
        ArrayList<Fuzzy> l2 = new ArrayList<>();
        l2.add(new Fuzzy("blue"));
        l2.add(new Fuzzy("crimson"));
        l2.add(new Fuzzy("gold"));
        l2.add(new Fuzzy("green"));
        l2.add(new Fuzzy("tan"));
        assertEquals(s.linearFuzzySearcher(l2, "green"), 3);

    }

    @Test
    void fuzzyList3Linear()
    {
        ArrayList<Fuzzy> l3 = new ArrayList<>();
        l3.add(new Fuzzy("blue"));
        l3.add(new Fuzzy("crimson"));
        l3.add(new Fuzzy("gold"));
        l3.add(new Fuzzy("gray"));
        l3.add(new Fuzzy("green"));
        l3.add(new Fuzzy("indigo"));
        l3.add(new Fuzzy("orange"));
        l3.add(new Fuzzy("red"));
        l3.add(new Fuzzy("white"));
        l3.add(new Fuzzy("yellow"));
        assertEquals(s.linearFuzzySearcher(l3, "yellow"), 9);

    }

    @Test
    void fuzzyList1Binary()
    {
        ArrayList<Fuzzy> b1 = new ArrayList<>();
        b1.add(new Fuzzy("black"));
        b1.add(new Fuzzy("blue"));
        b1.add(new Fuzzy("gold"));
        b1.add(new Fuzzy("pink"));
        b1.add(new Fuzzy("tan"));
        b1.add(new Fuzzy("violet"));
        assertEquals(s.binaryFuzzySearcher(b1, "violet"), 5);

    }

    @Test
    void fuzzyList2Binary()
    {
        ArrayList<Fuzzy> b2 = new ArrayList<>();
        b2.add(new Fuzzy("aquamarine"));
        b2.add(new Fuzzy("black"));
        b2.add(new Fuzzy("blue"));
        b2.add(new Fuzzy("crimson"));
        b2.add(new Fuzzy("gold"));
        b2.add(new Fuzzy("gray"));
        b2.add(new Fuzzy("pink"));
        b2.add(new Fuzzy("red"));
        b2.add(new Fuzzy("tan"));
        b2.add(new Fuzzy("violet"));
        b2.add(new Fuzzy("white"));
        b2.add(new Fuzzy("yellow"));
        assertEquals(s.binaryFuzzySearcher(b2, "black"), 1);

    }

    @Test
    void fuzzyList3Binary()
    {
        ArrayList<Fuzzy> b3 = new ArrayList<>();
        b3.add(new Fuzzy("aquamarine"));
        b3.add(new Fuzzy("black"));
        b3.add(new Fuzzy("blue"));
        b3.add(new Fuzzy("brown"));
        b3.add(new Fuzzy("crimson"));
        b3.add(new Fuzzy("gold"));
        b3.add(new Fuzzy("gray"));
        b3.add(new Fuzzy("green"));
        b3.add(new Fuzzy("indigo"));
        b3.add(new Fuzzy("lime"));
        b3.add(new Fuzzy("navy"));
        b3.add(new Fuzzy("magenta"));
        b3.add(new Fuzzy("orange"));
        b3.add(new Fuzzy("pink"));
        b3.add(new Fuzzy("purple"));
        b3.add(new Fuzzy("red"));
        b3.add(new Fuzzy("tan"));
        b3.add(new Fuzzy("violet"));
        b3.add(new Fuzzy("white"));
        b3.add(new Fuzzy("yellow"));
        assertEquals(s.binaryFuzzySearcher(b3, "tan"), 16);

    }

}