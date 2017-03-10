/**
 * 
 */
package com.reqport.experiment;

/**
 * @author sef
 *
 */
public class Class3 implements IClass {

	/**
	 * 
	 */
	public Class3() {
		// TODO Auto-generated constructor stub
	}

	public void doit()
	{
		System.out.println(this.getClass().getSimpleName() + ".doit()");
	}
}
