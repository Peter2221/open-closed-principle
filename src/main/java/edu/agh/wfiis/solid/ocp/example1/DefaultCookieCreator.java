
package edu.agh.wfiis.solid.ocp.example1;
import javax.servlet.http.Cookie;

public final class DefaultCookieCreator implements CookieCreating {
	
	Cookie create(String value) {
		Cookie cookie = new Cookie("default", value);
		cookie.setPath("/applications/" + value);
		return cookie;
	}
}
