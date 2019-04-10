

public class CookieIsmCreator implements CookieCreatable
{
	public Cookie create(HeaderType headerType, String value)
	{
		Cookie cookie = new Cookie(headerType.name(), value);
        cookie.setDomain("ism");
        cookie.setSecure(true);
        return cookie;
	}

}