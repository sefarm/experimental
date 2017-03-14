/**
 * 
 */
package com.reqport.experiment;

/**
 * @author sef
 *
 */
public class ClassFactory {
	
	public static ClassFactory INSTANCE = new ClassFactory() ;
	
	private Class<?> hack[] ;

	/**
	 * 
	 */
	private ClassFactory() {
		hack = new Class<?>[3] ;
		hack[0] = Class1.class ;
		hack[1] = Class2.class ;
		hack[2] = Class3.class ;
	}

	public IClass create() throws InstantiationException, IllegalAccessException
	{
		int index = (int) (Math.random() * (double)hack.length) ;
		
		return (IClass) hack[index].newInstance() ;
	}
}
