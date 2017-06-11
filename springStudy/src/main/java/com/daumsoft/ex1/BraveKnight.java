package com.daumsoft.ex1;

public class BraveKnight {
	private Quest quest;
	public BraveKnight(Quest quest) {
		this.quest = quest;
	}
	public void embarkOnQuest(){
		quest.embark();
	}
}
