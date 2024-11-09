package co.edu.uco.deviuco.usuarios.domain.ciudad.exceptions;

import co.edu.uco.deviuco.usuarios.crosscutting.exception.RuleDeviUcoException;

public class CiudadIdFormatIsNotValidException extends RuleDeviUcoException {
    private static final long serialVersionUID = 1L;
    
    private CiudadIdFormatIsNotValidException(String technicalMessage, String userMessage, Exception rootException) {
        super(technicalMessage, userMessage, rootException);
    }
    
    public static final CiudadIdFormatIsNotValidException create() {
        var userMessage = "La ciudad tiene un identificador con formato no válido correspondiente al valor por defecto...";
        return new CiudadIdFormatIsNotValidException(userMessage, userMessage, new Exception());
    }
} 