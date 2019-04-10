package edu.agh.wfiis.solid.ocp.example1;

import javax.servlet.http.Cookie;

public class CookieIsmCreator implements CookieCreatable
{
	public Cookie create(HeaderType headerType, String value)
	{
		Cookie cookie = new Cookie(headerType.name(), value);
        cookie.setDomain("ism");
        cookie.setSecure(true);
        return cookie;
	}

}