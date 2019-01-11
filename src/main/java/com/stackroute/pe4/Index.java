package com.stackroute.pe4;

public class Index {

    int startIndex;
    int endIndex;
    Index(int startIndex,int endIndex){
        this.startIndex=startIndex;
        this.endIndex=endIndex;
    }
    public String toString(){
        return startIndex+" "+endIndex;
    }
}
