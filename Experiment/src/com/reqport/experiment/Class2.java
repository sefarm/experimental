package com.reqport.experiment;

public class Class2 implements IClass {

	@Override
	public void doit() {
		System.out.println(this.getClass().getSimpleName() + ".doit()");
	}

}
