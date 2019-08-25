package phone;

import factory.ScannerFactory;

public class AndroidPhone extends Mobile {
    public AndroidPhone(String name, String color, String brand) {
        super(name, color, brand);
    }

    public AndroidPhone() {
        super();
    }

    @Override
    public void outMessage() {
        System.out.println("请输入<android>Message：");
        String message = ScannerFactory.getScanner().next();
        System.out.println("<android>"+message);
    }
    
    /* (non-Javadoc)
	 * @see phone.Mobile#call(java.lang.String)
	 */
	@Override
	public void call(String input) {
		// TODO Auto-generated method stub
		if(input.length() > 20) {
			System.out.println("<andriod>消息不能分别发送");
		}else {
			System.out.println("Mobile<android>正在打电话：内容是："+ input);
		}
	}
}
