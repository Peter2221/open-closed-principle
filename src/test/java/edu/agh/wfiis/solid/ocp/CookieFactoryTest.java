package edu.agh.wfiis.solid.ocp;


import org.junit.Assert;
import org.junit.Test;

import javax.servlet.http.Cookie;

public class CookieFactoryTest {

    private static final String COOKIE_VALUE = "some-value";


    private CookieFactory underTest;

    @org.junit.Before
    public void setUp() {
        underTest = new CookieFactory();
    }

    @org.junit.Test
    public void testForSessionHeader() {
        Cookie result = underTest.create(HeaderType.SESSION, COOKIE_VALUE);
        Assert.assertEquals(COOKIE_VALUE, result.getValue());
        Assert.assertEquals(HeaderType.SESSION.name(), result.getName());
        Assert.assertEquals(1000, result.getMaxAge());
        Assert.assertTrue(result.getSecure());
        Assert.assertEquals("security", result.getDomain());
    }

    @org.junit.Test
    public void testForISMHeader() {
        Cookie result = underTest.create(HeaderType.ISM, COOKIE_VALUE);
        Assert.assertEquals(COOKIE_VALUE, result.getValue());
        Assert.assertEquals(HeaderType.ISM.name(), result.getName());
        Assert.assertTrue(result.getSecure());
        Assert.assertEquals("ism", result.getDomain());
    }

    @org.junit.Test
    public void testForDefaultHeader() {
        Cookie result = underTest.create(HeaderType.REQUEST, COOKIE_VALUE);
        Assert.assertEquals(COOKIE_VALUE, result.getValue());
        Assert.assertEquals("default", result.getName());
        Assert.assertEquals("/applications/" + COOKIE_VALUE, result.getPath());
    }

    @Test
    public void testBuilder() {
        String name = "name";
        String value = "value";
        String comment = "smth";
        boolean secure = true;
        CustomCookie customCookie = new CustomCookie.Builder(name, value)
                .maxAge(10)
                .comment(comment)
                .secure(secure)
                .build();
        Assert.assertNotNull(customCookie);
        Assert.assertEquals(name, customCookie.getName());
        Assert.assertEquals(value, customCookie.getValue());
        Assert.assertEquals(comment, customCookie.getComment());
        Assert.assertEquals(secure, customCookie.isSecure());
    }
}