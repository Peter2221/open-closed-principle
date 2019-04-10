package edu.agh.wfiis.solid.ocp.example1;

import org.junit.Assert;

import javax.servlet.http.Cookie;

public class CookieSessionCreatorTest {
    private CookieFactory cookieFactoryToTest;
    private Cookie cookieToTest;
    private static final String COOKIE_VALUE = "some-value";

    @org.junit.BeforeClass
    public void setUp() {
        cookieFactoryToTest = new CookieFactory(new CookieSessionCreator());
        cookieToTest = cookieFactoryToTest.create(HeaderType.SESSION, COOKIE_VALUE);
    }

    @org.junit.Test
    public void testCreatedWithGoodValues(){
        Assert.assertEquals(COOKIE_VALUE, cookieToTest.getValue());
        Assert.assertEquals(HeaderType.SESSION.name(), cookieToTest.getName());
    }

    @org.junit.Test
    public void testMaxAgeSetting(){
        Assert.assertEquals(1000, cookieToTest.getMaxAge());
    }

    @org.junit.Test
    public void testSecureSetting(){
        Assert.assertTrue(cookieToTest.getSecure());
    }

    @org.junit.Test
    public void testDomainSetting(){
        Assert.assertEquals("security", cookieToTest.getDomain());
    }

//    cookie.setMaxAge(1000);
//        cookie.setSecure(true);
//        cookie.setDomain("security");

}
