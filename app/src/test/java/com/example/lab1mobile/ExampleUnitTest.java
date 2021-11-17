package com.example.lab1mobile;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    Myclass obj =  new Myclass();
    @Test
    public void test1max() {
        int result = obj.Maximum(12,4);
        assertEquals(result, 12);
    }
    @Test
    public void test2max() {
        int result = obj.Maximum(1000,9);
        assertEquals(result, 1000);
    }
    @Test
    public void test3max() {
        int result = obj.Maximum(10,9);
        assertEquals(result, 10);
    }
    @Test
    public void test4max() {
        int result = obj.Maximum(1,9);
        assertEquals(result, 9);
    }
    @Test
    public void test1min() {
        int result = obj.Minimum(12,4);
        assertEquals(result, 4);
    }
    @Test
    public void test2min() {
        int result = obj.Minimum(0,4);
        assertEquals(result, 0);
    }
    @Test
    public void test3min() {
        int result = obj.Minimum(12,20);
        assertEquals(result, 12);
    }
    @Test
    public void test4min() {
        int result = obj.Minimum(1,7);
        assertEquals(result, 1);
    }
}