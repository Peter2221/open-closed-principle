package edu.agh.wfiis.solid.ocp.cookiebuilder;

import edu.agh.wfiis.solid.ocp.CookieAdapter;
import edu.agh.wfiis.solid.ocp.CookieBuilder;
import edu.agh.wfiis.solid.ocp.CustomCookie;
import edu.agh.wfiis.solid.ocp.HeaderType;

import javax.servlet.http.Cookie;

public class IsmCookieBuilder implements CookieBuilder {

    private static IsmCookieBuilder instance;

    public static IsmCookieBuilder getInstance() {
        if(instance == null) {
            instance = new IsmCookieBuilder();
        }
        return instance;
    }

    @Override
    public Cookie build(HeaderType headerType, String value) {
        CustomCookie customCookie = new CustomCookie.Builder(headerType.name(), value)
                .domain("ism")
                .secure(true)
                .build();
        return new CookieAdapter(customCookie);



//        Cookie cookie = new Cookie(headerType.name(), value);
//        cookie.setDomain("ism");
//        cookie.setSecure(true);
//        return cookie;
    }

    private IsmCookieBuilder(){}
}
