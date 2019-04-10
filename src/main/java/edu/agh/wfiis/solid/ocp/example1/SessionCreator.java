package edu.agh.wfiis.solid.ocp.example1;

import javax.servlet.http.Cookie;

public class SessionCreator implements CreatableCookieType {

      Cookie create(String value){

              Cookie cookie = new Cookie(HeaderType.SESSION.name(), value);
              cookie.setMaxAge(1000);
              cookie.setSecure(true);
              cookie.setDomain("security");
              return cookie;
      }
}
