package co.edu.uco.deviuco.usuarios.domain.sede.exceptions;

import co.edu.uco.deviuco.usuarios.crosscutting.exception.RuleDeviUcoException;

public class SedeIdIsEmptyException extends RuleDeviUcoException {
    private static final long serialVersionUID = 1L;
    
    private SedeIdIsEmptyException(String technicalMessage, String userMessage, Exception rootException) {
        super(technicalMessage, userMessage, rootException);
    }
    
    public static final SedeIdIsEmptyException create() {
        var userMessage = "El identificador de la sede está vacío...";
        return new SedeIdIsEmptyException(userMessage, userMessage, new Exception());
    }
} 