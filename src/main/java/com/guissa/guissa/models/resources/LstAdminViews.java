package com.guissa.guissa.models.resources;

public enum LstAdminViews {
	ADMIN_INDEX_VIEW,
	ADMIN_SLIDES_INDEX_VIEW,
	ADMIN_SLIDES_CRUD_VIEW,
	ADMIN_SLIDES_LISTA_VIEW,
	ADMIN_PRODUCTOS_INDEX_VIEW,
	ADMIN_PRODUCTOS_CRUD_VIEW,
	ADMIN_PRODUCTOS_LISTA_VIEW;
	
	public String getString() {
		switch(this) {
			case ADMIN_INDEX_VIEW: return "admin/index";			
			case ADMIN_SLIDES_INDEX_VIEW: return "admin/vistas/slides/index";
			case ADMIN_SLIDES_CRUD_VIEW: return "admin/vistas/slides/crud";
			case ADMIN_SLIDES_LISTA_VIEW: return "admin/vistas/slides/lstVista";
			case ADMIN_PRODUCTOS_INDEX_VIEW: return "admin/vistas/productos/index";
			case ADMIN_PRODUCTOS_CRUD_VIEW: return "admin/vistas/productos/crud";
			case ADMIN_PRODUCTOS_LISTA_VIEW: return "admin/vistas/productos/lstVista";
		}
		return "No found";
	}

}
