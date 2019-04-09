package edu.agh.wfiis.solid.ocp.example1;
import javax.servlet.http.Cookie;

public final class CookieFacory {

	public Cookie create(CookieCreating cookieCreator, String value) {
		return cookieCreator.create(value);
	}
}
