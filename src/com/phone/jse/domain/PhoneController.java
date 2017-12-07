package com.phone.jse.domain;

import javax.swing.JOptionPane;

public class PhoneController {
	public static void main(String[] args) {
		PhoneBean phone = null;
		CelPhoneBean celPhone = null; 
		IPhoneBean iPhone = null;
		AndroidPhoneBean android = null;
		while(true) {
			switch(JOptionPane.
					showInputDialog(
							"0.종료 "
							+ "1.일반전화"
							+ "2.휴대폰"
							+ "3.스마트폰"
							+ "4.안드로이드폰")) {
			case "0" :
				JOptionPane.showMessageDialog(null, "종료");
				return;
			case "1" :
				//어디제품?>금성전화
				//누구에게 겁니까>홍길동ㄷ
				//금성 전화기로 홍길동에거 전화를 걸다
				phone = new PhoneBean();
				phone.setCompany(JOptionPane.showInputDialog("어디 제품?"));
					phone.setCall(
						JOptionPane.
							showInputDialog("who?"));
				JOptionPane.
					showMessageDialog(null,phone.toString());
				break;
			case "2" :
				// 휴대폰 맞습니까?(맞으면 1 틀리면 0)
				//celPhone.setProtable
				//어디 제품? 노키아 휴대폰
				// 누구에게 겁니까?
				// [이동]상태에서[노키아 휴대폰]으로[홍길동]에게 전화를걸다
				celPhone = new CelPhoneBean();
				celPhone.setMove((JOptionPane.showInputDialog(
						"휴대폰 맞습니까?(맞으면 y 틀리면 n)")
						.equals("y")) ? "이동중에":"정지중에");
				celPhone.setCompany(JOptionPane.showInputDialog("어디제품입니까?"));
				celPhone.setCall(JOptionPane.showInputDialog("누구에게 겁니까?"));
				JOptionPane.showMessageDialog(null,
						celPhone.toString());
				break;
			case "3" :
				iPhone = new IPhoneBean();
				iPhone.setData(JOptionPane.showInputDialog("who?"),
								JOptionPane.showInputDialog("뭐라고보낼까요?"));
				JOptionPane.showMessageDialog(null, iPhone.toString());
				break;
			case "4" :
				android = new AndroidPhoneBean();
				android.setData(JOptionPane.showInputDialog("누구"),
						JOptionPane.showInputDialog("뭐라고보낼까요?"));
				JOptionPane.showMessageDialog(null,android.toString());
				//누구에게 보냅니까?
				//뭐라고 보낼까요?
				//[7인치] 화면사이즈로 [이동] 상태에서 [갤럭시노트] 으로 [홍길동]에게
				//[안녕] 이라고 문자를 보냄
				break;
			}
		}
	}
}
