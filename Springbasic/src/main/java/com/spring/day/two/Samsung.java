package com.spring.day.two;

import org.springframework.beans.factory.annotation.Autowired;

public class Samsung {
	
	
	@Autowired
	MobileProcesser cpu;
	
	public MobileProcesser getCpu() {
		return cpu;
	}

	public void setCpu(MobileProcesser cpu) {
		this.cpu = cpu;
	}

	public void config()
	{
		System.out.println("hello samsung");
		cpu.process();
	}

}
