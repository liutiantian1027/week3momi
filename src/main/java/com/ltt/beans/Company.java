package com.ltt.beans;

import java.io.Serializable;
import java.util.Date;

public class Company{
	
	private Integer id;
	 private String name;
	 private String corporation;
	 private String address;
	 private Integer capital;
	 private String regist_no;
	 private Integer tid;
	 private Date period;
	 private Date created;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCorporation() {
		return corporation;
	}
	public void setCorporation(String corporation) {
		this.corporation = corporation;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getCapital() {
		return capital;
	}
	public void setCapital(Integer capital) {
		this.capital = capital;
	}
	public String getRegist_no() {
		return regist_no;
	}
	public void setRegist_no(String regist_no) {
		this.regist_no = regist_no;
	}
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	public Date getPeriod() {
		return period;
	}
	public void setPeriod(Date period) {
		this.period = period;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + ", corporation=" + corporation + ", address=" + address
				+ ", capital=" + capital + ", regist_no=" + regist_no + ", tid=" + tid + ", period=" + period
				+ ", created=" + created + "]";
	}
	 
	 
	
	
}
