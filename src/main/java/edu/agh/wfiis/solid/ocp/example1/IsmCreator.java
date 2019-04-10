package edu.agh.wfiis.solid.ocp.example1;

import javax.servlet.http.Cookie;

public class IsmCreator implements CreatableCookieType {

      Cookie create(String value){

          Cookie cookie = new Cookie(HeaderType.ISM.name(), value);
          cookie.setDomain("ism");
          cookie.setSecure(true);
          return cookie;
      }
}
