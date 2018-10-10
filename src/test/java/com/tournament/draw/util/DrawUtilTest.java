package com.tournament.draw.util;

import junit.framework.TestCase;
import org.junit.Assert;

public class DrawUtilTest extends TestCase {

    public void testDrawSizeExactPowerOfTwo() {
        DrawUtil util = new DrawUtil();
        int count = util.getDrawSize(8);
        Assert.assertTrue("Draw size should be 8 if there are 8 players",8 == count);
    }

    public void testDrawSizeOddNumber() {
        DrawUtil util = new DrawUtil();
        int count = util.getDrawSize(3);
        Assert.assertTrue("Draw size should be 4 if there are 3 players",4 == count);
    }

    public void testDrawSizeOddNumberGreaterThanTen() {
        DrawUtil util = new DrawUtil();
        int count = util.getDrawSize(17);
        Assert.assertTrue("Draw size should be 32 if there are 17 players",32 == count);
    }
}
