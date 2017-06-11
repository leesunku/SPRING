package com.daumsoft.ex1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KnightConfig {
	@Bean
	public Knight knight(){
		return BraveKnight(quest());
	}
	private Knight BraveKnight(Quest quest) {
		return null;
	}
	@Bean Quest quest(){
		//return new SlayDragonQuest(System.out);
		return null;
	}
}
