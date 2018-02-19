package com.alec.ws;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

// original
public class TestClient {
	public static void main(String[] args) throws MalformedURLException {
		URL url = new URL("http://localhost:10001/ns");
		// namespace, localpart from wsdl (xml file)
		QName qName = new QName("http://ws.alec.com/", "MyServiceImplService");
		Service service = Service.create(url, qName);
		
		IMyService msIMyService = service.getPort(IMyService.class);
		msIMyService.add(12, 21);
	}
}
