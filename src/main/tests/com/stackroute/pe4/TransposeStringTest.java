package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TransposeStringTest {
    TransposeString tr;

    @Before
    public void setUp() throws Exception {
        tr= new TransposeString();
    }

    @After
    public void tearDown() throws Exception {
        tr=null;
    }

    @Test
    public void transposeTheStringSuccess() {
       assertEquals("tirma lap hgnis",tr.transposeTheString("amrit pal singh"));
    }

    @Test
    public void transposeTheStringFaiure() {
        assertNotEquals("amrit pal singh",tr.transposeTheString("amrit pal singh"));
    }

}