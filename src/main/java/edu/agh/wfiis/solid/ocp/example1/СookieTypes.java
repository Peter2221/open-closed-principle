package edu.agh.wfiis.solid.ocp.example1;

import javax.servlet.http.Cookie;

import java.util.Map;
import java.util.HashMap;

public class CookieTypes{

    private static Map<HeaderType, CreatableCookieType> cookieTypes;
    private static CreatableCookieType defaultCookieType;

    public CookieTypes(){
      cookieTypes = new HashMap<>();
      cookieTypes.put(HeaderType.ISM, new IsmCreator());
      cookieTypes.put(HeaderType.SESSION, new SessionCreator());
      defaultCookieType = new DefaultCookieTypeCreator();
    }

    public CreatableCookieType getCookieTypeCreator(HeaderType headerType){

          CreatableCookieType cookieType = cookieTypes.get(headerType);
          if(cookieType != null)
              return cookieType;

          return defaultCookieType;
    }
}
