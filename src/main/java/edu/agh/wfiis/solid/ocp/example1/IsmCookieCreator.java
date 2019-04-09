
package edu.agh.wfiis.solid.ocp.example1;
import javax.servlet.http.Cookie;

public final class ISMCookieCreator implements CookieCreating {
	
	Cookie create(String value) {
		Cookie cookie = new Cookie("ism", value);
		cookie.setDomain("ism");
		cookie.setSecure(true);
		return cookie;
	}
}
