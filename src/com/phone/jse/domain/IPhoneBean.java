package com.phone.jse.domain;

public class IPhoneBean extends CelPhoneBean{
	protected String data;
	public final static String KIND = "스마트폰",
								BRAND = "아이폰";
	public void setData(String data) {
		this.data = data;
	}
	public void setData(String name,String data) {
		super.setCompany(BRAND);
		super.setPortable(true);
		super.setCall(name);
		this.data = data;
	}
	public String getData() {
		return data;
	}
	//[스마트폰]이기 떄문에 [이동] 상태에서 [아이폰] 으로 [홍길동] 
	//[안녕] 이라고 문자를 보램
	@Override
	public String toString() {
		return String.format("%s 이기떄문에 %s 상태에서 %s 으로 %s %s 이라고 문자를 보냄"
				,KIND,move,BRAND,call,data);
	}
}
