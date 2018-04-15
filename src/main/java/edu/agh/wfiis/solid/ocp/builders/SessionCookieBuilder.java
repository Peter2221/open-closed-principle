package edu.agh.wfiis.solid.ocp.builders;

import edu.agh.wfiis.solid.ocp.adapter.CookieAdapter;
import edu.agh.wfiis.solid.ocp.HeaderType;
import edu.agh.wfiis.solid.ocp.adapter.CustomCookie;

import javax.servlet.http.Cookie;

public class SessionCookieBuilder implements CookieBuilder {

    @Override
    public Cookie build(HeaderType headerType, String value) {
        CustomCookie customCookie = new CustomCookie.Builder(headerType.name(), value)
                .maxAge(1000)
                .secure(true)
                .domain("security")
                .build();
        return new CookieAdapter(customCookie);
    }
}
