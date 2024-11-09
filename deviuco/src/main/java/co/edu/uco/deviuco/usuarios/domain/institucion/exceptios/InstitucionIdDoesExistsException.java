package co.edu.uco.deviuco.usuarios.domain.institucion.exceptios;

import co.edu.uco.deviuco.usuarios.crosscutting.exception.RuleDeviUcoException;

public class InstitucionIdDoesExistsException extends RuleDeviUcoException {
    private static final long serialVersionUID = 1L;
    
    private InstitucionIdDoesExistsException(String technicalMessage, String userMessage, Exception rootException) {
        super(technicalMessage, userMessage, rootException);
    }
    
    public static final InstitucionIdDoesExistsException create() {
        var userMessage = "La institución ya existe en el sistema...";
        return new InstitucionIdDoesExistsException(userMessage, userMessage, new Exception());
    }
} 