package edu.agh.wfiis.solid.ocp.example1;

import javax.servlet.http.Cookie;

public class CookieWithISMHeader implements CookieCreateable{
    @Override
    public Cookie createCookie(String value) {
        Cookie cookie = new Cookie(HeaderType.ISM.name(), value);
        cookie.setDomain("ism");
        cookie.setSecure(true);
        return cookie;
    }
}
