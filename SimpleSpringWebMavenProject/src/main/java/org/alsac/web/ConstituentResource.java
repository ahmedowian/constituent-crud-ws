package org.alsac.web;

import java.util.Set;

import org.alsac.constituents.ConstituentType;
import org.alsac.constituents.EmailAddress;
import org.springframework.hateoas.ResourceSupport;

public class ConstituentResource extends ResourceSupport {
	public Long id;
	public ConstituentType type;
	public String firstName;
	public String lastName;
	public String address1;
	public String address2;
	public String city;
	public String state;
	public String zipcode;
	
	public Set<PhoneNumber> phoneNumbers;
	public Set<EmailAddress> emailAddresses;
}
