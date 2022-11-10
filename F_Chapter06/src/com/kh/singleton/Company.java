package com.kh.singleton;

public class Company {
	private static Company instance = new Company();
	
	private Company() {
	}
	
	public static Company getInstance() {
//		String str = null;
//		int i = null;
		
		if(instance == null) {
			instance = new Company();
		}
		
		return instance;
	}

}
