package co.edu.uco.deviuco.usuarios.domain.institucion.exceptios;

import co.edu.uco.deviuco.usuarios.crosscutting.exception.RuleDeviUcoException;

public class InstitucionNameIsUniqueException extends RuleDeviUcoException {
    private static final long serialVersionUID = 1L;
    
    private InstitucionNameIsUniqueException(String technicalMessage, String userMessage, Exception rootException) {
        super(technicalMessage, userMessage, rootException);
    }
    
    public static final InstitucionNameIsUniqueException create() {
        var userMessage = "Ya existe una institución con el nombre indicado...";
        return new InstitucionNameIsUniqueException(userMessage, userMessage, new Exception());
    }
} 