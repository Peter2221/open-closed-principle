package edu.agh.wfiis.solid.ocp.example1;
import javax.servlet.http.Cookie;

public class CookieFacory {

	public Cookie create(CookieCreating CookieCreating, String value) {
		return CookieCreating.create(value);
	}
}