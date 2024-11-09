package co.edu.uco.deviuco.usuarios.domain.ciudad.exceptions;

import co.edu.uco.deviuco.usuarios.crosscutting.exception.RuleDeviUcoException;

public class CiudadIdIsEmptyException extends RuleDeviUcoException {
    private static final long serialVersionUID = 1L;
    
    private CiudadIdIsEmptyException(String technicalMessage, String userMessage, Exception rootException) {
        super(technicalMessage, userMessage, rootException);
    }
    
    public static final CiudadIdIsEmptyException create() {
        var userMessage = "El identificador de la ciudad está vacío...";
        return new CiudadIdIsEmptyException(userMessage, userMessage, new Exception());
    }
} 