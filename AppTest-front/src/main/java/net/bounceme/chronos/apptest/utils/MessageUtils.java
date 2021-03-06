package net.bounceme.chronos.apptest.utils;

import java.util.Locale;

import net.bounceme.chronos.apptest.common.Constantes.Locales;

public class MessageUtils {

	public static String getMessage(String key, String lang) {
		Locale locale = (Locales.valueOf(Locales.class, lang)).value();
		return MessageProperties.getInstance().getString(key, locale);
	}
	
	public static String getMessage(String key, String lang, String value) {
		Locale locale = (Locales.valueOf(Locales.class, lang)).value();
		return MessageProperties.getInstance().getString(key, locale, value);
	}

}
