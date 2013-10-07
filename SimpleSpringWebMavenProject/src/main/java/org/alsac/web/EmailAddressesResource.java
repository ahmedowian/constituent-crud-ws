package org.alsac.web;

import java.util.*;

import org.springframework.hateoas.ResourceSupport;

public class EmailAddressesResource extends ResourceSupport {
	public Set<EmailAddressResource> emailAddresses = new HashSet<>();
}
