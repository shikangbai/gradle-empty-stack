/**
 * 
 */
package main;

import phone.IPhone;
import phone.Mobile;

/**
 * <P>Description: TODO</P>
 * @ClassName: IPhoneRobot
 * @author syf  2019年8月23日 上午10:18:43
 * @see TODO
 */
public class IPhoneRobot extends Person {
	private IPhone ipPhone;

	/**
	 * @param name
	 * @param mobile
	 * @param ipPhone
	 */
	public IPhoneRobot(String name,IPhone ipPhone) {
		super(name);
		this.ipPhone = ipPhone;
	}
	
	public void userPhone(String message) {
		this.ipPhone.call(message);
	}
	
	
	
}
