package com.guissa.guissa.utils;

import java.lang.reflect.Field;

import org.springframework.data.domain.Example;

public class ExamplesClass <T>{
	private T classe;
	private Object[] value;
	
	public ExamplesClass(T classe, Object[] value) {
		this.classe = classe;
		this.value = value;
	}

	public Example<T> getExample(){
		Class<? extends Object> nuevaClase = this.classe.getClass();
		Field field = null;
		try {
			field = nuevaClase.getDeclaredField( (String) value[0] );
		} catch (NoSuchFieldException | SecurityException e) {
			e.printStackTrace();
		}
		field.setAccessible(true);
		try {
			field.set( this.classe, value[1] );
		} catch (IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}
		return (Example<T>) Example.of( this.classe );
	}

}