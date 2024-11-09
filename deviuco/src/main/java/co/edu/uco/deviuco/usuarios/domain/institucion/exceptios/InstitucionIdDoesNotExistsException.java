package co.edu.uco.deviuco.usuarios.domain.institucion.exceptios;

import co.edu.uco.deviuco.usuarios.crosscutting.exception.RuleDeviUcoException;

public class InstitucionIdDoesNotExistsException extends RuleDeviUcoException {
    private static final long serialVersionUID = 1L;
    
    private InstitucionIdDoesNotExistsException(String technicalMessage, String userMessage, Exception rootException) {
        super(technicalMessage, userMessage, rootException);
    }
    
    public static final InstitucionIdDoesNotExistsException create() {
        var userMessage = "No existe ninguna institución con el identificador indicado...";
        return new InstitucionIdDoesNotExistsException(userMessage, userMessage, new Exception());
    }
} 