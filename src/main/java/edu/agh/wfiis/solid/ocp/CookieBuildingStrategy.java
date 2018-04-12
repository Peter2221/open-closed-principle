package edu.agh.wfiis.solid.ocp;

import edu.agh.wfiis.solid.ocp.cookiebuilder.DefaultCookieBuilder;
import edu.agh.wfiis.solid.ocp.cookiebuilder.SessionCookieBuilder;
import edu.agh.wfiis.solid.ocp.cookiebuilder.IsmCookieBuilder;

import java.util.HashMap;
import java.util.Map;

public class CookieBuildingStrategy
{
    private static CookieBuildingStrategy instance;

    private Map<HeaderType, CookieBuilder> strategies = new HashMap<>();

    private CookieBuilder defaultBuilder;

    public static CookieBuildingStrategy getInstance() {
        if(instance == null) {
            instance = new CookieBuildingStrategy();
        }
        return instance;
    }

    public CookieBuilder get(HeaderType headerType)
    {
        return strategies.get(headerType) != null
                ? strategies.get(headerType)
                : defaultBuilder;
    }

    private CookieBuildingStrategy()
    {
        defaultBuilder = DefaultCookieBuilder.getInstance();
        strategies.put(HeaderType.SESSION, SessionCookieBuilder.getInstance());
        strategies.put(HeaderType.ISM, IsmCookieBuilder.getInstance());
    }
}
