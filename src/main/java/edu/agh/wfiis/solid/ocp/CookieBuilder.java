package edu.agh.wfiis.solid.ocp;

import javax.servlet.http.Cookie;

public interface CookieBuilder
{
    Cookie build(HeaderType headerType, String value);
}
