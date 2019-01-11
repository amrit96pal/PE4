package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IsHarryPresentTest {
    IsHarryPresent is;

    @Before
    public void setUp() throws Exception {
        is= new IsHarryPresent();
    }

    @After
    public void tearDown() throws Exception {
        is=null;
    }

    @Test
    public void isHarryPresent() {
        assertEquals(true,is.isHarryPresent("AmritHarry"));
    }

    @Test
    public void isHarryFailure() {
        assertNotEquals(false,is.isHarryPresent("AmritHarry"));
    }

}