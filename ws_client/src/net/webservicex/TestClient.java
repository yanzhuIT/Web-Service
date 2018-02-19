package net.webservicex;

public class TestClient {
	public static void main(String[] args) {
		ConvertTemperature ct = new ConvertTemperature();
		ConvertTemperatureSoap cts = ct.getConvertTemperatureSoap();
	
		System.out.println(
				cts.convertTemp(100, 
						TemperatureUnit.DEGREE_CELSIUS, 
						TemperatureUnit.DEGREE_FAHRENHEIT));
	}
}
