package com.daumsoft.study.service;

import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class ComponentScanEx {
	public ComponentScanEx() {
		System.out.println("scan msg");
	}
}
