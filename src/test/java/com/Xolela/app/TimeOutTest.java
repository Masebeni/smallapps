package com.Xolela.app;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by Lenovo on 3/6/2016.
 */
public class TimeOutTest extends TestCase {
    @Test(expected = ArithmeticException.class)
    public void testName() throws Exception {
        Timeout time = new Timeout();
        time.timeout(5,4);
    }
}
