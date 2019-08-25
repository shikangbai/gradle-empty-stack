/**
 * 
 */
package factory;

import java.util.Scanner;

/**
 * <P>Description: TODO</P>
 * @ClassName: ScannerFactory
 * @author syf  2019��8��1�� ����5:43:00
 * @see TODO
 */
public class ScannerFactory {
	public static Scanner getScanner() {
		return new Scanner(System.in);
	}
	
}
