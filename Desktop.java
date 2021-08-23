package org.system;

public class Desktop extends Computer {

public void desktopSize() {
	
	System.out.println("1366×768");

}	

public static void main(String[] args) {
	

	//obj created for Desktop class
	Desktop desObj = new Desktop();
	System.out.println("*******Call for desktop class***********");
	desObj.desktopSize();
	desObj.computerModel();
	
	
	
}
}

