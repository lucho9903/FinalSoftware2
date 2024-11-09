package co.edu.uco.deviuco.usuarios.domain.ciudad.exceptions;

import co.edu.uco.deviuco.usuarios.crosscutting.exception.RuleDeviUcoException;

public class CiudadNameIsUniqueException extends RuleDeviUcoException {
    private static final long serialVersionUID = 1L;
    
    private CiudadNameIsUniqueException(String technicalMessage, String userMessage, Exception rootException) {
        super(technicalMessage, userMessage, rootException);
    }
    
    public static final CiudadNameIsUniqueException create() {
        var userMessage = "Ya existe una ciudad con el nombre indicado...";
        return new CiudadNameIsUniqueException(userMessage, userMessage, new Exception());
    }
} 