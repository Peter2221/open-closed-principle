package edu.agh.wfiis.solid.ocp.example1;

import org.junit.Assert;
import javax.servlet.http.Cookie;

public class CookieDefaultCreatorTest {
    private CookieFactory cookieFactoryToTest;
    private Cookie cookieToTest;
    private static final String COOKIE_VALUE = "some-value";

    @org.junit.BeforeClass
    public void setUp() {
        cookieFactoryToTest = new CookieFactory(new CookieDefaultCreator());
        cookieToTest = cookieFactoryToTest.create(HeaderType.SESSION, COOKIE_VALUE);
    }

    @org.junit.Test
    public void testCreatedWithGoodValues(){
        Assert.assertEquals(COOKIE_VALUE, cookieToTest.getValue());
        Assert.assertEquals(HeaderType.SESSION.name(), cookieToTest.getName());
    }

    @org.junit.Test
    public void testPathSetting(){
        Assert.assertEquals("/applications/"+COOKIE_VALUE, cookieToTest.getPath());
    }
}
