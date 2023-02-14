package com.core.string;

import org.apache.commons.lang3.StringEscapeUtils;

//import org.apache.commons.lang3.StringEscapeUtils;

public class UniConv {

	public static void main(String[] args) {

		String foreignText = "برنامه نویسی";
		
		String response = StringEscapeUtils.escapeJava(foreignText);
		System.out.println(response);

	}
}
