package org.alsac.constituents;

import org.springframework.hateoas.Identifiable;

public class EmailAddress implements Identifiable<Long>  {
	private Long id;
	private String emailAddress;
	private String type;
	
	@Override
	public Long getId() {
		return this.id;
	}
	
	public String getEmailAddress() {
		return this.emailAddress;
	}
	
	public String getType() {
		return this.type;
	}
}
