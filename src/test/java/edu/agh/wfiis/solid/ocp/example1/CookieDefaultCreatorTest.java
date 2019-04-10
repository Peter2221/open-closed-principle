package edu.agh.wfiis.solid.ocp.example1;

import org.junit.Assert;
import javax.servlet.http.Cookie;

public class CookieDefaultCreatorTest extends CookieCreatorBaseTest {
    private CookieFactory cookieFactoryToTest;
    private Cookie cookieToTest;

    @org.junit.BeforeClass
    public void setUp() {
        cookieFactoryToTest = new CookieFactory(new CookieSessionCreator());
        cookieToTest = getCookieToTest();
    }

    @org.junit.Test
    public void testPathSetting(){
        Assert.assertEquals("/applications/"+getCookieValue(), cookieToTest.getPath());
    }
}
