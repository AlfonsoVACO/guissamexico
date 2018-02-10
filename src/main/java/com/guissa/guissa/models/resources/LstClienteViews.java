package com.guissa.guissa.models.resources;

public enum LstClienteViews {
	CLIENTE_INDEX_VIEW,CLIENTES_INDEX_VIEW;

	public String getString() {
		switch (this) {
		case CLIENTE_INDEX_VIEW: return "cliente/index";
		case CLIENTES_INDEX_VIEW: return "cliente/index2";
		}
		return "No found";
	}
}
