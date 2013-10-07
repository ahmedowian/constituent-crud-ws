package org.alsac.constituents;

public enum InteractionType {
	PHONE_CALL(1),
	EMAIL(2),
	IN_PERSON(3),
	MAILED_LETTER(4),
	OTHER(5);
	
	private int id;
	
	InteractionType(int id) {
		this.id = id;
	}
	
	public int getId() {
		return this.id;
	}
}
