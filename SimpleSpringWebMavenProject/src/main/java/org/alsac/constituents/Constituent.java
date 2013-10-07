package org.alsac.constituents;

import java.util.Set;

import org.alsac.constituents.ConstituentType;
import org.alsac.constituents.EmailAddress;
import org.springframework.hateoas.Identifiable;

public class Constituent  implements Identifiable<Long> {
	private Long id;
	private ConstituentType type;
	private String firstName;
	private String lastName;
	private String address1;
	private String address2;
	private String city;
	private String state;
	private String zipcode;
	private Set<PhoneNumber> phoneNumbers;
	private Set<EmailAddress> emailAddresses;
	
	
	
	
	@Override
	public Long getId() {
		return this.id;
	}




	public ConstituentType getType() {
		return type;
	}




	public void setType(ConstituentType type) {
		this.type = type;
	}




	public String getFirstName() {
		return firstName;
	}




	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}




	public String getLastName() {
		return lastName;
	}




	public void setLastName(String lastName) {
		this.lastName = lastName;
	}




	public String getAddress1() {
		return address1;
	}




	public void setAddress1(String address1) {
		this.address1 = address1;
	}




	public String getAddress2() {
		return address2;
	}




	public void setAddress2(String address2) {
		this.address2 = address2;
	}




	public String getCity() {
		return city;
	}




	public void setCity(String city) {
		this.city = city;
	}




	public String getState() {
		return state;
	}




	public void setState(String state) {
		this.state = state;
	}




	public String getZipcode() {
		return zipcode;
	}




	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}




	public Set<PhoneNumber> getPhoneNumbers() {
		return phoneNumbers;
	}




	public void setPhoneNumbers(Set<PhoneNumber> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}




	public Set<EmailAddress> getEmailAddresses() {
		return emailAddresses;
	}




	public void setEmailAddresses(Set<EmailAddress> emailAddresses) {
		this.emailAddresses = emailAddresses;
	}




	public void setId(Long id) {
		this.id = id;
	}

}
