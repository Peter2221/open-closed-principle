package edu.agh.wfiis.solid.ocp.cookiebuilder;

import edu.agh.wfiis.solid.ocp.CookieBuilder;
import edu.agh.wfiis.solid.ocp.HeaderType;

import javax.servlet.http.Cookie;

public class DefaultCookieBuilder implements CookieBuilder {

    private static DefaultCookieBuilder instance;

    public static DefaultCookieBuilder getInstance() {
        if(instance == null) {
            instance = new DefaultCookieBuilder();
        }
        return instance;
    }

    @Override
    public Cookie build(HeaderType headerType, String value) {
        Cookie cookie = new Cookie("default", value);
        cookie.setPath("/applications/" + value);
        return cookie;
    }

    private DefaultCookieBuilder(){}
}
