package phone;

import factory.ScannerFactory;

public class IPhone extends Mobile {
    public IPhone(String name, String color, String brand) {
        super(name, color, brand);
    }

    public IPhone() {
        super();
    }

    @Override
    public void outMessage() {
        System.out.println("请输入<iphone>Message：");
        String message = ScannerFactory.getScanner().next();
        System.out.println("<iphone>"+message);
    }

	/* (non-Javadoc)
	 * @see phone.Mobile#call(java.lang.String)
	 */
	@Override
	public void call(String input) {
		// TODO Auto-generated method stub
		if(input.length() > 10) {
			System.out.println("<iPhone>消息无法发送");
		}else {
			System.out.println("Mobile<iPhone>正在打电话：内容是："+ input);
		}
	}
    
    
}
