package com.tiamaes.demo;

public class User {

	private int fleet_no;
	private String name;
	private String contact;
	private String telephone;
	private int parentId;
	private String remark;
	public int getFleet_no() {
		return fleet_no;
	}
	public void setFleet_no(int fleet_no) {
		this.fleet_no = fleet_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public int getParentId() {
		return parentId;
	}
	public void setParentId(int parentId) {
		this.parentId = parentId;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	@Override
	public String toString() {
		return "User [fleet_no=" + fleet_no + ", name=" + name + ", contact=" + contact + ", telephone=" + telephone
				+ ", parentId=" + parentId + ", remark=" + remark + "]";
	}
	
	
}
