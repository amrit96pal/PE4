package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class OcuurenceOfStringTest {
    OcuurenceOfString occ;

    @Before
    public void setUp() throws Exception {
        occ= new OcuurenceOfString();
    }

    @After
    public void tearDown() throws Exception {
        occ=null;
    }

  @Test
    public void numberOfOccurencesSuccess() {
        List<Index> lis= new ArrayList<Index>();
        Index ind= new Index(7,8);
        lis.add(ind);
        assertEquals(true,occ.numberOfOccurences("Amrit Pal Singh","a"));
    }

    @Test
    public void numberOfOccurences() {
        List<Index> lis= new ArrayList<Index>();
        Index ind= new Index(7,8);
        lis.add(ind);
        assertNotEquals(false,occ.numberOfOccurences("Amrit Pal Singh","i"));
    }
}