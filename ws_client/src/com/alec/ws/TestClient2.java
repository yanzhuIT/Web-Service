package com.alec.ws;

// no dependency
public class TestClient2 {
	public static void main(String[] args) {
		MyServiceImplService msis = new MyServiceImplService();
		// create a proxy object
		IMyService ims = msis.getMyServiceImplPort();
		ims.add(123, 210);
	}
}
