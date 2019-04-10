package edu.agh.wfiis.solid.ocp.example1;

import javax.servlet.http.Cookie;

public class CookieWithDefaultHeader implements CookieCreateable {
    @Override
    public Cookie createCookie(String value) {
        Cookie cookie = new Cookie("default", value);
        cookie.setPath("/applications/" + value);
        return cookie;
    }
}
