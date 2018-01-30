package com.guissa.guissa.models.resources;

public enum LstViews {
	INDEX_VIEW,
	CATEGORIAS_VIEW,
	UBICACION_VIEW,
	NEGOCIOS_VIEW,
	NOTICIAS_VIEW,
	NOTICIAS_VISTA_VIEW,
	EVENTOS_VIEW,
	EVENTOS_VISTA_VIEW,
	PRODUCTOS_VISTA_VIEW,
	PRECIOS_VIEW,
	CONTACTO_VIEW,
	REGISTRO_VIEW,
	HISTORIAS_VIEW,
	SOLICITUD_VIEW,
	ERROR403_VIEW,
	ERROR404_VIEW,
	ERROR405_VIEW,
	ERROR500_VIEW,
	ERROR503_VIEW,
	ERRORCONSTRUCT,
	ERROR_DES_VIEW,
	MENUSS_VIEWS,LOGIN_VIEW;
	
	public String getString() {
		switch(this) {
			case INDEX_VIEW: return "views/index";
			case CATEGORIAS_VIEW: return "views/categorias";
			case UBICACION_VIEW: return "views/ubicacion";
			case NEGOCIOS_VIEW: return "views/negocios";
			case NOTICIAS_VIEW: return "views/noticias";
			case EVENTOS_VIEW: return "views/eventos";
			case PRECIOS_VIEW: return "views/precios";
			case CONTACTO_VIEW: return "views/contacto";
			
			case NOTICIAS_VISTA_VIEW: return "views/noticias-vista";
			case EVENTOS_VISTA_VIEW: return "views/eventos-vista";
			case PRODUCTOS_VISTA_VIEW: return "views/productos-vista";
			
			case REGISTRO_VIEW: return "views/registro";
			case HISTORIAS_VIEW: return "views/historias";
			case SOLICITUD_VIEW: return "views/solcitud";
			
			case LOGIN_VIEW: return "views/logina";
			
			case MENUSS_VIEWS: return "views/header";
			case ERROR403_VIEW: return "errores/403";
			case ERROR404_VIEW: return "errores/404";
			case ERROR405_VIEW: return "errores/405";
			case ERROR500_VIEW: return "errores/500";
			case ERROR503_VIEW: return "errores/503";
			case ERRORCONSTRUCT: return "errores/under-construction";
			case ERROR_DES_VIEW: return "errores/desco";
			
			
		}
		return "No found";
	}
}
