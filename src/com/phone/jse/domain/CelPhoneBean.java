package com.phone.jse.domain;

public class CelPhoneBean extends PhoneBean{
	protected String move;
	protected boolean portable;
	public void setMove(String move) {
		this.move = move;
	}
	public String getMove() {
		return move;
	}
	public void setPortable(boolean portable) {
		this.setMove((portable)?"이동":"정지");
		this.portable = portable;
	}
	@Override
	public String toString() {
		
		return String.format("%s 상태에서 %s 전화기로  %s 에게 전화를걸다.",move,company,call);
	}
}
