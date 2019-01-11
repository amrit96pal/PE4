package com.stackroute.pe4;

/**
 *  Write a program that sets up a String variable containing a paragraph of text of your choice.
 * a. Extract the words from the text and sort them into alphabetical order.
 * b. Display the sorted list of words.
 */

import java.util.Set;
import java.util.TreeSet;

public class SortTheWords {
    public Boolean sortTheStringWords(String para) {
        para=para.toLowerCase();
        Set<String> ans=new TreeSet<String>();
        String[] temp=para.split(" ");
        for(int i=0;i<temp.length;i++){
            ans.add(temp[i]);
        }
        return true;
    }
}
