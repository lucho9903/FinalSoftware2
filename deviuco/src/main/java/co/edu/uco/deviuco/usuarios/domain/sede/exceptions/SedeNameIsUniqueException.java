package co.edu.uco.deviuco.usuarios.domain.sede.exceptions;

import co.edu.uco.deviuco.usuarios.crosscutting.exception.RuleDeviUcoException;

public class SedeNameIsUniqueException extends RuleDeviUcoException {
    private static final long serialVersionUID = 1L;
    
    private SedeNameIsUniqueException(String technicalMessage, String userMessage, Exception rootException) {
        super(technicalMessage, userMessage, rootException);
    }
    
    public static final SedeNameIsUniqueException create() {
        var userMessage = "Ya existe una sede con el nombre indicado...";
        return new SedeNameIsUniqueException(userMessage, userMessage, new Exception());
    }
} 