package protectedaccessmodifierpackage2;

import protectedaccessmodifierpackage1.*;
public class ProtectedB extends ProtectedA{

	public static void main(String[] args) {
		
		ProtectedB obj = new ProtectedB();
		System.out.println(obj.a);
		obj.msg();

	}

}
