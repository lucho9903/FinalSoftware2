package co.edu.uco.deviuco.usuarios.domain.ciudad.exceptions;

import co.edu.uco.deviuco.usuarios.crosscutting.exception.RuleDeviUcoException;

public class CiudadIdDoesNotExistsException extends RuleDeviUcoException {
    private static final long serialVersionUID = 1L;
    
    private CiudadIdDoesNotExistsException(String technicalMessage, String userMessage, Exception rootException) {
        super(technicalMessage, userMessage, rootException);
    }
    
    public static final CiudadIdDoesNotExistsException create() {
        var userMessage = "No existe ninguna ciudad con el identificador indicado...";
        return new CiudadIdDoesNotExistsException(userMessage, userMessage, new Exception());
    }
} 