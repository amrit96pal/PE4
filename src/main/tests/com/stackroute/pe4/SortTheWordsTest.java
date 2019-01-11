package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class SortTheWordsTest {
    SortTheWords sor;

    @Before
    public void setUp() throws Exception {
        sor= new SortTheWords();
    }

    @After
    public void tearDown() throws Exception {
        sor=null;
    }

    @Test
    public void sortTheStringWordsSuccess() {
        String para="he above code will work great But list object is immutable Thus you will not be able to add new values to it In case you try to add new value to list it will throw UnsupportedOperationException Thus simply create a new List from that object See below";
        assertEquals(true,sor.sortTheStringWords(para));
    }

    @Test
    public void sortTheStringWordsFailure() {
        String para="he above code will work great But list object is immutable Thus you will not be able to add new values to it In case you try to add new value to list it will throw UnsupportedOperationException Thus simply create a new List from that object See below";
        assertNotEquals(false,sor.sortTheStringWords(para));
    }
}