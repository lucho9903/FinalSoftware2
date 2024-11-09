package co.edu.uco.deviuco.usuarios.application.usecase;

public interface UseCaseWhitReturn<D,R>{
	R execute(D domain);

}
