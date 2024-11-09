package co.edu.uco.deviuco.usuarios.domain.ciudad.exceptions;

import co.edu.uco.deviuco.usuarios.crosscutting.exception.RuleDeviUcoException;

public class CiudadIdDoesExistsException extends RuleDeviUcoException {
    private static final long serialVersionUID = 1L;
    
    private CiudadIdDoesExistsException(String technicalMessage, String userMessage, Exception rootException) {
        super(technicalMessage, userMessage, rootException);
    }
    
    public static final CiudadIdDoesExistsException create() {
        var userMessage = "La ciudad ya existe en el sistema...";
        return new CiudadIdDoesExistsException(userMessage, userMessage, new Exception());
    }
} 