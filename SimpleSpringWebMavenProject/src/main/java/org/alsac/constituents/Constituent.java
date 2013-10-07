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
		// TODO Auto-generated method stub
		return null;
	}

}
