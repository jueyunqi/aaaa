package com.jueyunqi.simple.entity;

import java.io.Serializable;

public class AbstractEntity implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1142795998895451674L;
	private Long id;
	private Long version;
	
	public Long getVersion() {
		return version;
	}
	public void setVersion(Long version) {
		this.version = version;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

}
