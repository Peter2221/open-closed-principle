package edu.agh.wfiis.solid.ocp.example1;

import org.junit.Assert;

import javax.servlet.http.Cookie;

public abstract class CookieCreatorBaseTest {
    private CookieFactory cookieFactoryToTest;
    private Cookie cookieToTest;
    private static final String COOKIE_VALUE = "some-value";

    @org.junit.BeforeClass
    public abstract void setUp();

    protected Cookie getCookieToTest(){
        return cookieFactoryToTest.create(HeaderType.SESSION, getCookieValue());
    }

    protected String getCookieValue(){
        return COOKIE_VALUE;
    }

    @org.junit.Test
    public void testCreatedWithGoodValues(){
        Assert.assertEquals(COOKIE_VALUE, cookieToTest.getValue());
        Assert.assertEquals(HeaderType.SESSION.name(), cookieToTest.getName());
    }
}
