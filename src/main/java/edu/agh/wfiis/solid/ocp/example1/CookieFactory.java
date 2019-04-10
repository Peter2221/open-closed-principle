package edu.agh.wfiis.solid.ocp.example1;

import javax.servlet.http.Cookie;

public class CookieFactory {

    public Cookie create(HeaderType headerType, String value) {

        CookieTypes cookieTypes  = new CookieTypes();
        CreatableCookieType cookieType = cookieTypes.getCookieTypeCreator(headerType);

        return cookieType.create(value);
    }
}
