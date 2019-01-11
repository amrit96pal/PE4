package com.stackroute.pe4;

/**
 * Write a program to transpose the given string.
 *  Input String : a quick brown fox jumps over the lazy dog
 *  Output String: a  kciuq  nworb  xof  spmuj  revo  eht  yzal  god
 */

import java.util.*;


public class TransposeString {
    public String transposeTheString(String str) {
        StringBuffer sb;
        String[] temp=str.split(" ");
        String answer="";
        for(int i=0;i<temp.length;i++){
            sb= new StringBuffer(temp[i]);
            sb.reverse();
            sb.append(" ");
            String temp1=sb.toString();
            answer+=temp1;
        }
        answer=answer.trim();
        return answer;
    }
}
