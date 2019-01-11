package com.stackroute.pe4;

/**
 * Write a program to replace all d with f and all l with t in the given String
 * Input: daily dry
 * Output: faity fry
 * Original string: daily dry
 * New String: faity fry
 */

import java.util.*;

public class ReplaceDandI {
    public String replaceDandI(String temp) {
        if(temp==null){
            return "ERROR-You have entered null value";
        }
        try{
            int x= Integer.parseInt(temp);
            return "Length of string should be more than 1 in length";
        }catch (Exception e) {

        }
        if(!temp.contains("d") && !temp.contains("i")){
            return "no d or i present in the input";
        }
        temp=temp.toLowerCase();
        String ans=temp.replaceAll("d","f");
        ans=ans.replaceAll("i","t");
        return ans;
    }
}
