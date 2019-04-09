package edu.agh.wfiis.solid.ocp.example1;
import javax.servlet.http.Cookie;

public final class SessionCookieCreator implements CookieCreating {
	
	Cookie create(String value) {
		Cookie cookie = new Cookie("session", value);
		cookie.setMaxAge(1000);
		cookie.setSecure(true);
		cookie.setDomain("security");
		return cookie;
	}
}
