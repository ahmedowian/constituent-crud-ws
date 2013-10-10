package org.alsac.constituents;

import org.springframework.hateoas.Identifiable;

public class PhoneNumber implements Identifiable<Long>   {
	private Long id;
	private String phoneNumber;
	private String type;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
