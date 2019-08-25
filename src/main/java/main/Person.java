/**
 * 
 */
package main;

import phone.Mobile;

/**
 * <P>Description: TODO</P>
 * @ClassName: Person
 * @author syf  2019年8月23日 上午9:52:34
 * @see TODO
 */
public class Person {
	public String name;
	private Mobile mobile;
	/**
	 * @param name
	 * @param mobile
	 */
	public Person(String name, Mobile mobile) {
		this.name = name;
		this.mobile = mobile;
	}
	
	
	/**
	 * @param name
	 */
	public Person(String name) {
		super();
		this.name = name;
	}


	/**
	 * @return the mobile
	 */
	public Mobile getMobile() {
		return mobile;
	}
	/**
	 * @param mobile the mobile to set
	 */
	public void setMobile(Mobile mobile) {
		this.mobile = mobile;
	}
	
	public void userPhone(String message) {
		this.mobile.call(message);
	}
	
	

}
