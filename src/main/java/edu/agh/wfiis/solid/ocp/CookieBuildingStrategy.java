package edu.agh.wfiis.solid.ocp;

import com.google.common.collect.ImmutableMap;
import edu.agh.wfiis.solid.ocp.builders.CookieBuilder;
import edu.agh.wfiis.solid.ocp.builders.DefaultCookieBuilder;
import edu.agh.wfiis.solid.ocp.builders.SessionCookieBuilder;
import edu.agh.wfiis.solid.ocp.builders.IsmCookieBuilder;

public class CookieBuildingStrategy {

    private static CookieBuildingStrategy instance;

    private final ImmutableMap<HeaderType, CookieBuilder> builders;
    private final CookieBuilder defaultBuilder;

    public static CookieBuildingStrategy getInstance() {
        if (instance == null) {
            instance = new CookieBuildingStrategy();
        }
        return instance;
    }

    public CookieBuilder get(HeaderType headerType) {
        return builders.get(headerType) != null
                ? builders.get(headerType)
                : defaultBuilder;
    }

    private CookieBuildingStrategy() {
        builders = ImmutableMap.<HeaderType, CookieBuilder>builder()
                .put(HeaderType.SESSION, new SessionCookieBuilder())
                .put(HeaderType.ISM, new IsmCookieBuilder())
                .build();
        defaultBuilder = new DefaultCookieBuilder();
    }
}
