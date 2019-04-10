package edu.agh.wfiis.solid.ocp.example1;

import org.junit.Assert;
import javax.servlet.http.Cookie;

public class CookieIsmCreatorTest extends CookieCreatorBaseTest {
    private CookieFactory cookieFactoryToTest;
    private Cookie cookieToTest;

    @org.junit.BeforeClass
    public void setUp() {
        cookieFactoryToTest = new CookieFactory(new CookieIsmCreator());
        cookieToTest = getCookieToTest();
    }

    @org.junit.Test
    public void testDomainSetting(){
        Assert.assertEquals("ism", cookieToTest.getDomain());
    }

    @org.junit.Test
    public void testSecuritySetting(){
        Assert.assertTrue(cookieToTest.getSecure());
    }
}
