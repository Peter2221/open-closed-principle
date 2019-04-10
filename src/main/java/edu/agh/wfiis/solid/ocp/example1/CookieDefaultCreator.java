package edu.agh.wfiis.solid.ocp.example1;

import javax.servlet.http.Cookie;

public class CookieDefaultCreator implements CookieCreatable
{
	public Cookie create(HeaderType headerType, String value)
	{
		Cookie cookie = new Cookie("default", value);
        cookie.setPath("/applications/" + value);
        return cookie;
	}

}