package org.example;
import java.util.ArrayList;

public class FuzzySearcher
{

    public int linearFuzzySearcher(ArrayList<Fuzzy> list, String color)
    {
        for (int i = 0; i < list.size(); i++)
        {
            if (list.get(i).getColor() == color)
            {
                return i;

            }

        }

        return -1;

    }

    public int binaryFuzzySearcher(ArrayList<Fuzzy> list, String color)
    {
        int start = 0;
        int end = list.size() - 1;
        int middle;

        while (start <= end)
        {
            middle = (start + end) / 2;

            String fuzzyColor = list.get(middle).getColor();

            if (fuzzyColor == color)
            {
                return middle;

            } else if (fuzzyColor.compareTo(color) < 0) {
                start = middle + 1;

            } else {
                end = middle - 1;

            }

        }

        return -1;

    }

}