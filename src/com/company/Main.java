package com.company;

import jdk.nashorn.api.tree.WhileLoopTree;

import java.io.PrintStream;
import java.util.Scanner;

public class Main {
 public static void inOut(Scanner in, PrintStream out)
 {
     while(in.hasNext())
     {
         out.println(in.next());
     }
 }
    public static void main(String[] args) {
	// write your code here
   Scanner in = new Scanner (System.in);
   PrintStream out = System.out;
   inOut(in,out);
    }
}
