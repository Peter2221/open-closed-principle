package edu.agh.wfiis.solid.ocp.example1;

import javax.servlet.http.Cookie;

public class CookieWithSessionHeader implements CookieCreateable {
    @Override
    public Cookie createCookie(String value) {
        Cookie cookie = new Cookie(HeaderType.SESSION.name(), value);
        cookie.setMaxAge(1000);
        cookie.setSecure(true);
        cookie.setDomain("security");
        return cookie;
    }
}
