package com.daumsoft.study.service;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComponentEx {
	public ComponentEx() {
		System.out.println("component msg");
	}
	@Autowired()
	public void autowired(){
		System.out.println("@Autowired msg");
	}
	@Inject()
	public void inject(){
		System.out.println("@inject msg");
	}
}
