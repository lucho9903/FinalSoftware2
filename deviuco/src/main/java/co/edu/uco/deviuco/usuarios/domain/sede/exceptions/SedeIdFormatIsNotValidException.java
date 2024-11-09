package co.edu.uco.deviuco.usuarios.domain.sede.exceptions;

import co.edu.uco.deviuco.usuarios.crosscutting.exception.RuleDeviUcoException;

public class SedeIdFormatIsNotValidException extends RuleDeviUcoException {
    private static final long serialVersionUID = 1L;
    
    private SedeIdFormatIsNotValidException(String technicalMessage, String userMessage, Exception rootException) {
        super(technicalMessage, userMessage, rootException);
    }
    
    public static final SedeIdFormatIsNotValidException create() {
        var userMessage = "La sede tiene un identificador con formato no válido correspondiente al valor por defecto...";
        return new SedeIdFormatIsNotValidException(userMessage, userMessage, new Exception());
    }
} 