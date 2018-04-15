package edu.agh.wfiis.solid.ocp.builders;

import edu.agh.wfiis.solid.ocp.HeaderType;

import javax.servlet.http.Cookie;

public interface CookieBuilder {

    Cookie build(HeaderType headerType, String value);
}
