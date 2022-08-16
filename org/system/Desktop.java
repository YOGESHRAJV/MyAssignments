package org.system;

public class Desktop extends Computer {
	public void desktopSize() {
		System.out.println("desktopSize");
		
	}
	public static void main(String[] args) {
		Desktop computerdesk=new Desktop();
		computerdesk.computerModel();
		computerdesk.deviceType();
		computerdesk.desktopSize();

}
}
