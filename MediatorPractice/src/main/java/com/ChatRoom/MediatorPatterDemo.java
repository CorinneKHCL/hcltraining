package com.ChatRoom;

import java.util.Scanner;

public class MediatorPatterDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		NewChatRoom chat = new NewChatRoomImpl();
		
		
		User1 u1 = new User1(chat);
		User2 u2 = new User2(chat);
		
		System.out.println("User1, what is your name?");
		u1.setname(scan.next());
		System.out.println("User2, what is your name?");
		u2.setname(scan.next());
		
		System.out.println("Have fun chatting. When you are done type quit");
		
		do {
			u1.sendMsg(scan.next());
			u2.sendMsg(scan.next());
		} while(!scan.next().equalsIgnoreCase("quit"));
		
		
		scan.close();
	}
}
