package com.stackroute.pe4;
/**
 * Write a program to find out the multiple occurrences of the given word in a string using Matcher methods.
 *  Input : She sells seashells by the seashore
 *  Given word: se
 *  Output :
 *         Found at: 4 - 6
 *         Found at: 10 - 12
 *        Found at: 27 - 29
 */

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OcuurenceOfString {
    public Boolean numberOfOccurences(String inp, String mat) {
        Index ind;
        List<Index> index= new ArrayList<Index>();
        Pattern p= Pattern.compile(mat);
        Matcher matcher=p.matcher(inp);
        while (matcher.find()){
            ind= new Index(matcher.start(),matcher.end());
            index.add(ind);
        }
        return true;
    }
}
