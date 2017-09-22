package com.pokemon.server.util;

public class Utils {
	private Utils() {
	}

	public static String getMessage(String message, String[] params) {
		for (int i = 0; i < params.length; i++) {
			message.replace("{" + i + "}", params[i]);
		}
		return message;
	}
}