package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceDandITest {
    ReplaceDandI rep;

    @Before
    public void setUp() throws Exception {
        rep= new ReplaceDandI();
    }

    @After
    public void tearDown() throws Exception {
        rep=null;
    }

    @Test
    public void replaceDandISuccess() {
        assertEquals("ffstttfg",rep.replaceDandI("ddsiiifg"));
    }

    @Test
    public void replaceDandIFailure() {
        assertNotEquals("ffsttfg",rep.replaceDandI("ddsiiifg"));
    }

    @Test
    public void replaceDandIIntInput() {
        assertEquals("Length of string should be more than 1 in length",rep.replaceDandI("145"));
    }


    @Test
    public void replaceDandINoDandIPresent() {
        assertEquals("no d or i present in the input",rep.replaceDandI("amrrrr"));
    }

    @Test
    public void replaceDandNullInput() {
        assertEquals("ERROR-You have entered null value",rep.replaceDandI(null));
    }

}