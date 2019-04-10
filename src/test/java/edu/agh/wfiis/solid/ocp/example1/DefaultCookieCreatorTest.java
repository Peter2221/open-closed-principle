package edu.agh.wfiis.solid.ocp.example1;


import org.junit.Assert;

import javax.servlet.http.Cookie;

public class DefaultCookieCreatorTest {

    private static final String COOKIE_VALUE = "some-value";
    
    private DefaultCookieCreator underTest;

    @org.junit.Before
    public void setUp() {
        underTest = new DefaultCookieCreator();
    }

    @org.junit.Test
    public void testCreate() {
        Cookie result = underTest.create(cookieCreator, COOKIE_VALUE);
        Assert.assertEquals(COOKIE_VALUE, result.getValue());
        Assert.assertEquals("default", result.getName());
        Assert.assertEquals("/applications/" + COOKIE_VALUE, result.getPath());
    }

}