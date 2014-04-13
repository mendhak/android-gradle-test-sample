package com.example.sampleproject.app;

import android.test.ActivityInstrumentationTestCase2;

public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {
    public MainActivityTest(){
        super(MainActivity.class);
    }

    public void testReallySlowTest(){
        assertEquals(1,1);
    }

}
