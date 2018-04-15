package edu.agh.wfiis.solid.ocp.builders;

import edu.agh.wfiis.solid.ocp.adapter.CookieAdapter;
import edu.agh.wfiis.solid.ocp.adapter.CustomCookie;
import edu.agh.wfiis.solid.ocp.HeaderType;

import javax.servlet.http.Cookie;

public class IsmCookieBuilder implements CookieBuilder {

    @Override
    public Cookie build(HeaderType headerType, String value) {
        CustomCookie customCookie = new CustomCookie.Builder(headerType.name(), value)
                .domain("ism")
                .secure(true)
                .build();
        return new CookieAdapter(customCookie);
    }
}
