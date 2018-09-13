package p1;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	private int streetNo;
	private String streetName;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(int streetNo, String streetName) {
		super();
		this.streetNo = streetNo;
		this.streetName = streetName;
	}
	public int getStreetNo() {
		return streetNo;
	}
	public void setStreetNo(int streetNo) {
		this.streetNo = streetNo;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	@Override
	public String toString() {
		return "Address [streetNo=" + streetNo + ", streetName=" + streetName + "]";
	}
	
	
	
	
}
