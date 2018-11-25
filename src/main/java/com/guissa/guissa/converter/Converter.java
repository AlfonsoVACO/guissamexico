package com.guissa.guissa.converter;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class Converter<T>  {
	
	public Map<String, Object> convertClassToMap(T clazz) {
		
		Map<String, Object> mapa = new HashMap<>();
		for (Field field : clazz.getClass().getDeclaredFields()) {
			field.setAccessible(true);
			try {
				mapa.put(field.getName(), field.get(clazz));
			} catch (IllegalArgumentException | IllegalAccessException e) {
				mapa.put("error", e.getMessage());
			}
		}

		return mapa;
	}
}
