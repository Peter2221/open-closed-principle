package edu.agh.wfiis.solid.ocp.example1;

import javax.servlet.http.Cookie;

public class CookieFactory {
    public Cookie create(CookieCreateable cookieCreateable, String value) {
        return cookieCreateable.createCookie(value);
    }
}
