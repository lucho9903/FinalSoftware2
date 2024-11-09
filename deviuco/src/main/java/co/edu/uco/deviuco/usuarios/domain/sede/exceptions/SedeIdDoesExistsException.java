package co.edu.uco.deviuco.usuarios.domain.sede.exceptions;

import co.edu.uco.deviuco.usuarios.crosscutting.exception.RuleDeviUcoException;

public class SedeIdDoesExistsException extends RuleDeviUcoException {
    private static final long serialVersionUID = 1L;
    
    private SedeIdDoesExistsException(String technicalMessage, String userMessage, Exception rootException) {
        super(technicalMessage, userMessage, rootException);
    }
    
    public static final SedeIdDoesExistsException create() {
        var userMessage = "La sede ya existe en el sistema...";
        return new SedeIdDoesExistsException(userMessage, userMessage, new Exception());
    }
} 