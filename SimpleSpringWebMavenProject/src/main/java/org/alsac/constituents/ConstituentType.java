package org.alsac.constituents;

public enum ConstituentType {
	DONOR(1),
	VOLUNTEER(2),
	EVENT_PARTICIPANT(3),
	OTHER(4);
	
	private int id;
	
	ConstituentType(int id) {
		this.id = id;
	}
	
	public int getId() {
		return this.id;
	}
}
