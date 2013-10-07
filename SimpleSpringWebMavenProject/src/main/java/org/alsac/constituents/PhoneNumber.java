package org.alsac.constituents;

import org.springframework.hateoas.ResourceSupport;

public class PhoneNumber extends ResourceSupport {
	private Long id;
	private String phoneNumber;
	private String type;
}
