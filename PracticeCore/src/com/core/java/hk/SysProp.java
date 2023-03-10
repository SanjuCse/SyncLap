package com.core.java.hk;

import java.util.Enumeration;
import java.util.Properties;

public class SysProp {
	public static void main(String[] args) {
		Properties properties = System.getProperties();
		Enumeration enumeration = properties.propertyNames();
//		System.out.println(properties);
//		System.out.println(properties.elements());
		while (enumeration.hasMoreElements()) {
			String key = (String) enumeration.nextElement();
			String value = properties.getProperty(key);
			System.out.println(key + " : " + value);
		}
	}
}
