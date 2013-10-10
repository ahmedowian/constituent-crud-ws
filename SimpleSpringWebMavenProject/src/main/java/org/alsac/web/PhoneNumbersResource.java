package org.alsac.web;

import java.util.*;

import org.springframework.hateoas.ResourceSupport;

public class PhoneNumbersResource extends ResourceSupport {
	public Set<PhoneNumberResource> phoneNumbers = new HashSet<PhoneNumberResource>();
}
