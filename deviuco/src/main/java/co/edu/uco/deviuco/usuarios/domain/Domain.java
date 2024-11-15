package co.edu.uco.deviuco.usuarios.domain;

import java.util.UUID;

import co.edu.uco.deviuco.usuarios.crosscutting.helpers.UUIDHelper;

public class Domain {
private UUID id;
	
	protected Domain(final UUID id) {
		setId(id);		
		
	}

	public UUID getId() {
		return id;
	}

	private void setId( final UUID id) {
		this.id = id;
	} 
	public void generateId() {
		this.id = UUIDHelper.generate();
	}
}
