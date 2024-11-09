package co.edu.uco.deviuco.usuarios.domain.pais.exceptios;

import co.edu.uco.deviuco.usuarios.crosscutting.exception.RuleDeviUcoException;

public class PaisNameIsUniqueException extends RuleDeviUcoException {
    private static final long serialVersionUID = 1L;
    
    private PaisNameIsUniqueException(String technicalMessage, String userMessage, Exception rootException) {
        super(technicalMessage, userMessage, rootException);
    }
    
    public static final PaisNameIsUniqueException create() {
        var userMessage = "Ya existe un país con el nombre indicado...";
        return new PaisNameIsUniqueException(userMessage, userMessage, new Exception());
    }
} 