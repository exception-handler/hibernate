package p1;

import javax.persistence.Embeddable;

@Embeddable
public class Address {

	private String city;
	private String houseNumber;
	private String state;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String city, String houseNumber, String state) {
		super();
		this.city = city;
		this.houseNumber = houseNumber;
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", houseNumber=" + houseNumber + ", state=" + state + "]";
	}
	
	
	
}
