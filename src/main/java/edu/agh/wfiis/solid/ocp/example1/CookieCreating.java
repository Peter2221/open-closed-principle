package edu.agh.wfiis.solid.ocp.example1;
import javax.servlet.http.Cookie;

public interface CookieCreating {
	
	Cookie create(String value);
}
