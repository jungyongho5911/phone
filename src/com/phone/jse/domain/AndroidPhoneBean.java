package com.phone.jse.domain;

public class AndroidPhoneBean extends IPhoneBean {
	public static String BRAND = "안드로이드폰"; 
	private String size;
	@Override
	public void setData(String name,String data) {
		super.setCompany(BRAND);
		super.setPortable(true);
		super.setCall(name);
		setSize("7");
		this.data = data;
	}
	public void setSize(String size) {
		this.size =size;
	}
	public String getSize() {
		return size;
	}
	@Override
	public String toString() {
		return String.format("%s화면사이즈로 %s 상태에서 %s 으로 %s 에게 %s 문자를보냄", 
								size,move,BRAND,call,data);
	}
}
