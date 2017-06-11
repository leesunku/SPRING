package com.daumsoft.ex1;

public class BraveKnightTest {
	public void knightShouldEmbarkOnQuest(){
		Quest mockQuest = mock(Quest.class);
		BraveKnight knight = new BraveKnight(mockQuest);
		knight.embarkOnQuest();
	}

	private Quest mock(Class<Quest> class1) {
		// TODO Auto-generated method stub
		return null;
	}
}
