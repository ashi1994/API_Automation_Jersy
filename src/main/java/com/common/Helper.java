package com.common;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Helper {
	
	public static String generatePayLoadString(String filename){
		
		String filePath = System.getProperty("user.dir")+"/src/test/resources/com/jsonpayload/"+filename+".json";
		try {
			return new String(Files.readAllBytes(Paths.get(filePath)));
			
		} catch (Exception e) {
			
			return null;
		}

}
}