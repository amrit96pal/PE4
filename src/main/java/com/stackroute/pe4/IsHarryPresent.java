package com.stackroute.pe4;

/**
 * Write a program with the implementation of Regular Expression to find the presence of the name Harry
 * in a string.
 *  Input: This is Harry.
 *  Output: Is Harry here ? true
 *  Input : This is Henry.
 *  Output: Is Harry here ? false
 */

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IsHarryPresent {
    public Boolean isHarryPresent(String inp) {
        Pattern p=Pattern.compile(".*Harry.*");
        Matcher mat=p.matcher(inp);
        Boolean ans=mat.matches();
        return ans;
    }
}

