package edu.agh.wfiis.solid.ocp.example1;

import javax.servlet.http.Cookie;

public class DefaultBuilder implements CookieTypeBuilder{

    @Override
    public Cookie build(String value) {
        Cookie cookie = new Cookie("default", value);
        cookie.setPath("/applications/" + value);
        return cookie;
    }
}