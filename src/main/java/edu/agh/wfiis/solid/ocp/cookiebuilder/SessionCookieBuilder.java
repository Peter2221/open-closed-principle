package edu.agh.wfiis.solid.ocp.cookiebuilder;

import edu.agh.wfiis.solid.ocp.CookieBuilder;
import edu.agh.wfiis.solid.ocp.HeaderType;

import javax.servlet.http.Cookie;

public class SessionCookieBuilder implements CookieBuilder {

    private static SessionCookieBuilder instance;

    public static SessionCookieBuilder getInstance() {
        if(instance == null) {
            instance = new SessionCookieBuilder();
        }
        return instance;
    }

    @Override
    public Cookie build(HeaderType headerType, String value) {
        Cookie cookie = new Cookie(headerType.name(), value);
        cookie.setMaxAge(1000);
        cookie.setSecure(true);
        cookie.setDomain("security");
        return cookie;
    }

    private SessionCookieBuilder(){}
}
