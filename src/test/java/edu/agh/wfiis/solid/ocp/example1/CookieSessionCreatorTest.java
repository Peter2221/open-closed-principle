package edu.agh.wfiis.solid.ocp.example1;

import org.junit.Assert;

import javax.servlet.http.Cookie;

public class CookieSessionCreatorTest extends CookieCreatorBaseTest {
    private CookieFactory cookieFactoryToTest;
    private Cookie cookieToTest;

    @org.junit.BeforeClass
    public void setUp() {
        cookieFactoryToTest = new CookieFactory(new CookieSessionCreator());
        cookieToTest = getCookieToTest();
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

}
