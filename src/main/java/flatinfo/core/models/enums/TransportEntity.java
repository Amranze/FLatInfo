package flatinfo.core.models.enums;

public enum TransportEntity {
	A("RER A"),
	B("RER B"),
	C("RER C"),
	M1("Metro 1"),
	M2("Metro 2"),
	M3("Metro 3"),
	M4("Metro 4"),
	M5("Metro 5"),
	M6("Metro 6"),
	M7("Metro 7"),
	M7B("Metro 7bis"),
	M8("Metro 8"),
	M9("Metro 9"),
	M10("Metro 10"),
	M11("Metro 11"),
	M12("Metro 12"),
	M13("Metro 13"),
	M14("Metro 14"),
	Bus("Bus");
	
	private String transport;
	
	private TransportEntity(String transport) {
		this.transport = transport;
	}

	public String getTransport() {
		return transport;
	}

	public void setTransport(String transport) {
		this.transport = transport;
	}
	
	
}
