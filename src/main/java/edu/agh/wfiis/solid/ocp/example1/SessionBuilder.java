package edu.agh.wfiis.solid.ocp.example1;

import javax.servlet.http.Cookie;

public class SessoinBuilder implements CookieTypeBuilder{

    @Override
    public Cookie build(HeaderType headerType, String value) {
        Cookie cookie = new Cookie(headerType.name(), value);
        cookie.setMaxAge(1000);
        cookie.setSecure(true);
        cookie.setDomain("security");
        return cookie;
    }
}