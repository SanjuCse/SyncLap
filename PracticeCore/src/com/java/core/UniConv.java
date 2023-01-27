package com.java.core;

import java.util.Scanner;

public class UniConv {
	public static void main(String[] args) {
		String a = "0x0061";
		String b = "0x0062";
		String c = "0x0063";
		String d = "0x0064";
		String e = "0x0065";
		String f = "0x0066";
		String g = "0x0067";
		String h = "0x0068";
		String i = "0x0069";
		String j = "0x006A";
		String k = "0x006B";
		String l = "0x006C";
		String m = "0x006D";
		String n = "0x006E";
		String o = "0x006F";
		String p = "0x0070";
		String q = "0x0071";
		String r = "0x0072";
		String s = "0x0073";
		String t = "0x0074";
		String u = "0x0075";
		String v = "0x0076";
		String w = "0x0077";
		String x = "0x0078";
		String y = "0x0079";
		String z = "0x007A";

		String A = "0x0041";
		String B = "0x0042";
		String C = "0x0043";
		String D = "0x0044";
		String E = "0x0045";
		String F = "0x0046";
		String G = "0x0047";
		String H = "0x0048";
		String I = "0x0049";
		String J = "0x004A";
		String K = "0x004B";
		String L = "0x004C";
		String M = "0x004D";
		String N = "0x004E";
		String O = "0x004F";
		String P = "0x0050";
		String Q = "0x0051";
		String R = "0x0052";
		String S = "0x0053";
		String T = "0x0054";
		String U = "0x0055";
		String V = "0x0056";
		String W = "0x0057";
		String X = "0x0058";
		String Y = "0x0059";
		String Z = "0x005A";

		String result = null;
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		result = string.replace("A", A);
		
	    switch(string){  
	    //Case statements  
	    case "A": System.out.println(A);  
	    break;  
	    case "B": System.out.println(B);  
	    break;
	    case "C": System.out.println(C);
	    break;
	    }
//		result = result + string.replaceFirst("A", A);
//		result = result + string.replaceFirst("B", B);
//		result = result + string.replaceFirst("C", C);
//		result = result + string.replaceFirst("D", D);
//		result = result + string.replaceFirst("E", E);
//		result = result + string.replaceFirst("F", F);
//		result = result + string.replaceFirst("G", G);
//		result = result + string.replaceFirst("H", H);
//		result = result + string.replaceFirst("I", I);
//		result = result + string.replaceFirst("J", J);
//		result = result + string.replaceFirst("K", K);
//		result = result + string.replaceFirst("L", L);
//		result = result + string.replaceFirst("M", M);
//		result = result + string.replaceFirst("N", N);
//		result = result + string.replaceFirst("O", O);
//		result = result + string.replaceFirst("P", P);
//		result = result + string.replaceFirst("Q", Q);
//		result = result + string.replaceFirst("R", R);
//		result = result + string.replaceFirst("S", S);
//		result = result + string.replaceFirst("T", T);
//		result = result + string.replaceFirst("U", U);
//		result = result + string.replaceFirst("V", V);
//		result = result + string.replaceFirst("W", W);
//		result = result + string.replaceFirst("X", X);
//		result = result + string.replaceFirst("Y", Y);
//		result = result + string.replaceFirst("Z", Z);
		System.out.println(result);

	}
}
