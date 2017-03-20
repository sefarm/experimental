/**
 * 
 */
package com.reqport.experiment;

/**
 * @author sef
 *
 */
public class Experiment {

	/**
	 * 
	 */
	public Experiment() {
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		for (int i = 0; i <5; i++) {
			try {
				ClassFactory.INSTANCE.create().doit();
			} catch (InstantiationException | IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		}
	}

}
