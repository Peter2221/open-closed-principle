package edu.agh.wfiis.solid.ocp.example1;


import org.junit.Assert;

import javax.servlet.http.Cookie;

public class ISMCookieCreatorTest {

    private static final String COOKIE_VALUE = "some-value";
    
    private ISMCookieCreator underTest;

    @org.junit.Before
    public void setUp() {
        underTest = new ISMCookieCreator();
    }

    @org.junit.Test
    public void testCreate() {
        Cookie result = underTest.create(cookieCreator, COOKIE_VALUE);
        Assert.assertEquals(COOKIE_VALUE, result.getValue());
        Assert.assertEquals("ism", result.getName());
        Assert.assertTrue(result.getSecure());
        Assert.assertEquals("ism", result.getDomain());
    }

}