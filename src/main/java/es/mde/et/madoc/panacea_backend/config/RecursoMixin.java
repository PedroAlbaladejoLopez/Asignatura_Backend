package es.mde.et.madoc.panacea_backend.config;

import com.fasterxml.jackson.annotation.JsonIgnore;

public abstract class RecursoMixin {
	@JsonIgnore
	private String base;
	
	@JsonIgnore
	public abstract String getBase();
	
	@JsonIgnore 
	public abstract void setBase(String base);
	
}
