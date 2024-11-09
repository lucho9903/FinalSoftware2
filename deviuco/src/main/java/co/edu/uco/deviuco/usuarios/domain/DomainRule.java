package co.edu.uco.deviuco.usuarios.domain;

public interface DomainRule <T> {
	void validate(T data);

}
