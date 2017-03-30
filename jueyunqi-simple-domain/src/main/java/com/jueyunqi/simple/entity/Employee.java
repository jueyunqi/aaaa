package com.jueyunqi.simple.entity;

public class Employee extends AbstractEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6523479430736729798L;
	
	private String name;
	private String passwd;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", passwd=" + passwd +",id="+getId()+ "]";
	}
	
	
}
