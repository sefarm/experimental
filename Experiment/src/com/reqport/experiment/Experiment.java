/**
 * 
 */
package com.reqport.experiment;

/**
 * @author sef
 *
 */
public class Experiment {
	
	// some change

	/**
	 * 
	 */
	public Experiment() {
	}
	

	public void change6() {}

	public void change5() {}

	public void change4() {}

	public void change3() {}
	
	public void change1() {}
	
	public void change2() {}
	
	public void added()
	{
		
	}
	
	public void added2()
	{
		
	}
	
	
	public void addedInFeature2()
	{
		
	}
	
	int oneMoreChange ;
	
	int f3 ;
	
	int changeFromOtherUser ;

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
