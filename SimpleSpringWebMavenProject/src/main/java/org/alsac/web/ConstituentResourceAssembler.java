package org.alsac.web;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;

import org.alsac.constituents.Constituent;
import org.springframework.hateoas.mvc.ResourceAssemblerSupport;

public class ConstituentResourceAssembler extends
		ResourceAssemblerSupport<Constituent, ConstituentResource> {

	public ConstituentResourceAssembler() {
		super(ConstituentsController.class, ConstituentResource.class);
	}

	@Override
	public ConstituentResource toResource(Constituent constituent) {
		ConstituentResource resource = createResourceWithId(constituent.getId(), constituent);
		resource.constituent = constituent;
		resource.add(linkTo(ConstituentsController.class).slash("phoneNumbers").withRel("phoneNumbers"));
		return resource;
	}

}
