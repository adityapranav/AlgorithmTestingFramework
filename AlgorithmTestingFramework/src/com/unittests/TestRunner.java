package com.unittests;

import org.junit.runner.JUnitCore;

public class TestRunner {
   public static void main(String[] args) {
      JUnitCore.runClasses(AllSortingTests.class);
      System.out.println("Done");
   }
}  