package com.apiconfig;

import java.util.Map;

public class HeaderConfig {

	public Map<String,String> defultHeader(){
		defultHeader().put("content-Type","application/json");
		return defultHeader();
		
	}
	
	public Map<String,String> headerwithtoken(){
		defultHeader().put("content-Type","application/json");
		defultHeader().put("Acess_Token", "nsajnfansdsasda");
		defultHeader().put("jwt_Token","afsdkjsaffas");
		
		return defultHeader();
		
	}
	
	
	
}
