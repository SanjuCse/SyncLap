package com.core.string;

public class ObjCls {
	int id;
	String name;

	public ObjCls(int id, String name) {
		this.id = id;
		this.name = name;
	}

	void display() {
		System.out.println(id + " " + name);

	}

}

class OCEx {
	public static void main(String[] args) {
		ObjCls cls = new ObjCls(111, "sanju");
		ObjCls cls2 = new ObjCls(222, "kanhu");
		cls.display();
		cls2.display();
	}
}
