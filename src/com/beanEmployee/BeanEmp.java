package com.beanEmployee;

public class BeanEmp {
	
	private int id;
	private String name;
	private String city;
	private String des;
	private long phoneNo;
	private long password;
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	public long getPassword() {
		return password;
	}
	public void setPassword(long password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "BeanEmp [id=" + id + ", name=" + name + ", city=" + city + ", des=" + des + ", phoneNo=" + phoneNo
				+ ", password=" + password + "]";
	}
	
	
	

}
