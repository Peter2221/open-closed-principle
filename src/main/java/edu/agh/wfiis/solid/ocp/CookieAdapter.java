package edu.agh.wfiis.solid.ocp;

import lombok.Getter;
import lombok.Setter;

import javax.servlet.http.Cookie;

@Getter
@Setter
public class CookieAdapter extends Cookie {

    private final CustomCookie customCookie;

    private String name;
    private String comment;
    private String domain;
    private String path;
    private String value;
    private int version = 0;
    private int maxAge = -1;
    private boolean secure;

    public CookieAdapter(CustomCookie customCookie) {
        super(customCookie.getName(), customCookie.getValue());
        this.customCookie = customCookie;
        setProperties();
    }

    private void setProperties() {
        setName(customCookie.getName());
        setComment(customCookie.getComment());
        setDomain(customCookie.getDomain());
        setPath(customCookie.getPath());
        setValue(customCookie.getValue());
        setVersion(customCookie.getVersion());
        setMaxAge(customCookie.getMaxAge());
        setSecure(customCookie.isSecure());
    }
}
