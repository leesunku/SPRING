package com.daumsoft.di;

// IoC/DI ������
public class House {
	private Room room;
	
	public House() {
		// �������� Ŭ���� ���� �Ұ�
		room = (Room) new BlackRoom();
	}
}
