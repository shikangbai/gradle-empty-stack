package phone;

import factory.ScannerFactory;

public class Mobile {
    private String name;
    private String color;
    private String brand;

    public Mobile(String name, String color, String brand) {
        this.name = name;
        this.color = color;
        this.brand = brand;
    }

    public Mobile() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void outMessage() {
        System.out.println("请输入Message");
        String message = ScannerFactory.getScanner().next();
        System.out.println(message);
    }
    
    public void call(String input) {
    	System.out.println("Mobile正在打电话：内容是："+ input);
    }

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Mobile [[名称]：" + name + ", [颜色]：" + color + ", [品牌]：" + brand + "]";
	}
    
}
