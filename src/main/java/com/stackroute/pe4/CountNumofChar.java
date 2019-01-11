package com.stackroute.pe4;
/**
 *   Write a java program to count the total number of occurrences of a given character in a string
 *   without using any loop?
 * For Example- Java is java again java again count number of occurrence of a in the given string
 */


import java.io.*;

public class CountNumofChar {
    public int numOfTimes(String str, String c) {
        int answere=str.length()-str.replaceAll(c,"").length();
        return answere;
    }
}
