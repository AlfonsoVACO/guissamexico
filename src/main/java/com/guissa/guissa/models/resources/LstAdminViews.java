package com.guissa.guissa.models.resources;

public enum LstAdminViews {
	ADMIN_INDEX_VIEW;
	
	public String getString() {
		switch(this) {
			case ADMIN_INDEX_VIEW: return "admin/index";			
		}
		return "No found";
	}

}
