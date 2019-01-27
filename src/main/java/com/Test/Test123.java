package com.Test;

import com.common.Helper;
import com.common.Webservices;

public class Test123 {
	
	public static void main(String...s) {
		System.out.println(Webservices.getCall("/api/users/2").readEntity(String.class));
		String payload=Helper.generatePayLoadString("first");
		System.out.println(payload);
		System.out.println(Webservices.postCall("/api/users", payload).readEntity(String.class));
	}
	


}
