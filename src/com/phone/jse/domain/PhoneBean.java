package com.phone.jse.domain;

public class PhoneBean {
	protected String company,call;
	
	public void setCompany(String company) {
		this.company = company;
	}
	public String getCompany() {
		return company; 
	}
	public void setCall(String call) {
		this.call = call;
	}
	public String getCall() {
		return call;
	}
	@Override
	public String toString() {
		
		return String.format("%s 제품으로 %s 에게 전화를걸다",company,call);
	}
	
}
