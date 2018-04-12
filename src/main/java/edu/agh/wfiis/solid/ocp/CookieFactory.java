package edu.agh.wfiis.solid.ocp;

import javax.servlet.http.Cookie;

public class CookieFactory {
    public Cookie create(HeaderType headerType, String value) {
        CookieBuildingStrategy cookieBuildingStrategy = CookieBuildingStrategy.getInstance();
        return cookieBuildingStrategy
                .get(headerType)
                .build(headerType, value);
    }
}