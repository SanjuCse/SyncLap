package com.core.java.hk;

import java.lang.reflect.Field;

public class stringLength {
	public static void main(String[] args){
		String string = "abc";
		Class<?> class1 = string.getClass();
		try {
			Field field = class1.getDeclaredField("value");
			field.setAccessible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
