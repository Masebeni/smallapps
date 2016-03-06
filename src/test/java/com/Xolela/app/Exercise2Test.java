package com.Xolela.app;

import junit.framework.Assert;
import org.junit.Ignore;
import org.junit.internal.runners.statements.Fail;
import org.junit.rules.ExpectedException;
import org.omg.CORBA.Object;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static junit.framework.Assert.*;
import static org.testng.Assert.fail;

/**
 * Created by student on 2016/03/03.
 */
public class Exercise2Test {

    private   Exercise2 e2;

    @BeforeMethod
    public void setUp() throws Exception {
        e2 = new Exercise2();
    }

    @Test
    public void testInt() throws Exception {
        assertEquals(e2.TestInt(2,5),7);
    }

    @Test
    public void testFloat() throws Exception {
        assertEquals(e2.TestFloat(8,4),12f);
    }

    @Test
    public void testObjectEquality() throws Exception {
        assertTrue(e2.TestObjectEquality(5,5));
    }

    @Test
    public void testObjectIdentity() throws Exception {
        ObjectIdentity objectA = new ObjectIdentity();
        ObjectIdentity objectB = new ObjectIdentity();

        assertNotSame(objectA,objectB);
    }

    @Test
    public void testTruth() throws Exception {
        assertTrue(e2.evenNumber(2));
    }

    @Test
    public void testFalse() throws Exception {
        assertFalse(e2.oddNumber(3));

    }

    @Test
    public void testNull() throws Exception {
        assertNull(e2.isNull());

    }

    @Test
    public void testNonNull() throws Exception {
        assertNotNull(e2.nonNull());
    }

    @Test
    public void testFailingTest() throws Exception {
        assertEquals(e2.failingTest(),1);
        //fail("Application failed!");
    }

    @Test
    public void testArrayContent() throws Exception {
        char[] list ={'a','b','c'};
        assertArrayEquals(e2.arrayContent(),list);
    }
    private void assertArrayEquals(char[] chars, char[] array) {
    }
}
