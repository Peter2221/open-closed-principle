package edu.agh.wfiis.solid.ocp;

import javax.servlet.http.Cookie;

public class CookieFactory {

    private final CookieBuildingStrategy cookieBuildingStrategy;

    CookieFactory() {
        cookieBuildingStrategy = CookieBuildingStrategy.getInstance();
    }

    public Cookie create(HeaderType headerType, String value) {
        return cookieBuildingStrategy
                .get(headerType)
                .build(headerType, value);
    }
}