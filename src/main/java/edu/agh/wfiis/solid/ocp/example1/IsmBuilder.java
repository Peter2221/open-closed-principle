package edu.agh.wfiis.solid.ocp.example1;

import javax.servlet.http.Cookie;

public class IsmBuilder implements CookieTypeBuilder{

    @Override
    public Cookie build(HeaderType headerType, String value) {
        Cookie cookie = new Cookie(headerType.name(), value);
        cookie.setDomain("ism");
        cookie.setSecure(true);
        return cookie;
    }
}