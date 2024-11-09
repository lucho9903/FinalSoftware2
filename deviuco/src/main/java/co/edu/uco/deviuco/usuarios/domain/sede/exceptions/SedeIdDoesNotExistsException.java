package co.edu.uco.deviuco.usuarios.domain.sede.exceptions;

import co.edu.uco.deviuco.usuarios.crosscutting.exception.RuleDeviUcoException;

public class SedeIdDoesNotExistsException extends RuleDeviUcoException {
    private static final long serialVersionUID = 1L;
    
    private SedeIdDoesNotExistsException(String technicalMessage, String userMessage, Exception rootException) {
        super(technicalMessage, userMessage, rootException);
    }
    
    public static final SedeIdDoesNotExistsException create() {
        var userMessage = "No existe ninguna sede con el identificador indicado...";
        return new SedeIdDoesNotExistsException(userMessage, userMessage, new Exception());
    }
} 