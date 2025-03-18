package org.example;
import java.util.ArrayList;

public class App 
{

  public static void main(String[] args) 
  {
    System.out.println("Your code goes here!");
    FuzzyListGenerator generator = new FuzzyListGenerator(7000);
    FuzzySearcher searcher = new FuzzySearcher();

    ArrayList<Fuzzy> randomized = generator.randomizedRainbowFuzzies();
    ArrayList<Fuzzy> sorted = generator.sortedRainbowFuzzies();

    System.out.println(searcher.linearFuzzySearcher(sorted, "gold"));
    System.out.println(searcher.binaryFuzzySearcher(sorted, "gold"));
    System.out.println(searcher.linearFuzzySearcher(randomized, "gold"));
    System.out.println(searcher.binaryFuzzySearcher(randomized, "gold"));
    
  }
}
