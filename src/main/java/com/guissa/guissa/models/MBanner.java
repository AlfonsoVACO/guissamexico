package com.guissa.guissa.models;


public class MBanner {
	
	private Integer idBanner;
    private String nombre;
    private String subTitle;
    private String imagen;
	public Integer getIdBanner() {
		return idBanner;
	}
	public void setIdBanner(Integer idBanner) {
		this.idBanner = idBanner;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getSubTitle() {
		return subTitle;
	}
	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public MBanner(Integer idBanner, String nombre, String subTitle, String imagen) {
		super();
		this.idBanner = idBanner;
		this.nombre = nombre;
		this.subTitle = subTitle;
		this.imagen = imagen;
	}
    public MBanner() {}
    
}
