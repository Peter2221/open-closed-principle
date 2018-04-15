package edu.agh.wfiis.solid.ocp.builders;

import edu.agh.wfiis.solid.ocp.adapter.CookieAdapter;
import edu.agh.wfiis.solid.ocp.HeaderType;
import edu.agh.wfiis.solid.ocp.adapter.CustomCookie;

import javax.servlet.http.Cookie;

public class DefaultCookieBuilder implements CookieBuilder {

    @Override
    public Cookie build(HeaderType headerType, String value) {
        CustomCookie customCookie = new CustomCookie.Builder("default", value)
                .path("/applications/" + value)
                .build();
        return new CookieAdapter(customCookie);
    }
}
