package com.daumsoft.di;

// IoC/DI 미적용
public class House {
	private Room room;
	
	public House() {
		// 동적으로 클래스 정의 불가
		room = (Room) new BlackRoom();
	}
}
