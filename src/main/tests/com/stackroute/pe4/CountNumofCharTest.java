package com.stackroute.pe4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CountNumofCharTest {

    CountNumofChar nc;

    @org.junit.Before
    public void setUp() throws Exception {
        nc = new CountNumofChar();
    }

    @org.junit.After
    public void tearDown() throws Exception {
        nc =null;
    }

    @Test
    public void ocuurenaceCheckSuccess(){
        assertEquals(3, nc.numOfTimes("Amrit pal singh is","i"));
    }

    @Test
    public void ocuurenaceCheckFailure(){
        assertNotEquals(3, nc.numOfTimes("Amrit pal singh","i"));

    }

}