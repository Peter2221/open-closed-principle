package edu.agh.wfiis.solid.ocp.example1;

import javax.servlet.http.Cookie;

public class CookieFactory {
    private final CookieCreatable cookieCreator;

    public CookieFactory(CookieCreatable cookieCreator)
    {
        this.cookieCreator = cookieCreator;
    }

    public Cookie create(HeaderType headerType, String value) 
    {
        return this.cookieSCreator.create(headerType, value);
    }
}