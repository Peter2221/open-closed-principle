package edu.agh.wfiis.solid.ocp.example1;

import javax.servlet.http.Cookie;

interface CookieCreatable 
{ 
	public Cookie create(HeaderType headerType, String value); 
}
