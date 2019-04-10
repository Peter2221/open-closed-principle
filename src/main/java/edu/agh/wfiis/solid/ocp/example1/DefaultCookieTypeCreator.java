package edu.agh.wfiis.solid.ocp.example1;

import javax.servlet.http.Cookie;

public class DefaultCookieTypeCreator implements CreatableCookieType {

      Cookie create(String value){
        
              Cookie cookie = new Cookie("default", value);
              cookie.setPath("/applications/" + value);
              return cookie;
      }
}
