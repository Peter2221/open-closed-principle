package edu.agh.wfiis.solid.ocp.example1;


import org.junit.Assert;

import javax.servlet.http.Cookie;

public class SessionCookieCreatorTest {

    private static final String COOKIE_VALUE = "some-value";
    
    private SessionCookieCreator underTest;

    @org.junit.Before
    public void setUp() {
        underTest = new SessionCookieCreator();
    }

    @org.junit.Test
    public void testCreate() {
        Cookie result = underTest.create(cookieCreator, COOKIE_VALUE);
        Assert.assertEquals(COOKIE_VALUE, result.getValue());
        Assert.assertEquals("session", result.getName());
        Assert.assertEquals(1000, result.getMaxAge());
        Assert.assertTrue(result.getSecure());
        Assert.assertEquals("security", result.getDomain());
    }

}