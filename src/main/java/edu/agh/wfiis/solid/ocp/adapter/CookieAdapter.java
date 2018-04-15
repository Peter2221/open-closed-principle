package edu.agh.wfiis.solid.ocp.adapter;

import javax.servlet.http.Cookie;

public class CookieAdapter extends Cookie {

    public CookieAdapter(CustomCookie customCookie) {
        super(customCookie.getName(), customCookie.getValue());
        super.setComment(customCookie.getComment());
        if (customCookie.getDomain() != null) {
            super.setDomain(customCookie.getDomain());
        }
        super.setPath(customCookie.getPath());
        super.setVersion(customCookie.getVersion());
        super.setMaxAge(customCookie.getMaxAge());
        super.setSecure(customCookie.isSecure());
    }
}
