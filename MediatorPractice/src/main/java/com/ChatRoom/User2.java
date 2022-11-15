package com.ChatRoom;

public class User2 extends Participant {

	private String name;
	private NewChatRoom chat;
	
	@Override
	public void sendMsg(String msg) {
		// TODO Auto-generated method stub
		this.chat.showMsg(msg, this);
	}

	@Override
	public void setname(String name) {
		// TODO Auto-generated method stub
		this.name=name;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	
	public User2(NewChatRoom chat) {
		this.chat = chat;
	}

}
