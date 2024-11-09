package co.edu.uco.deviuco.usuarios.domain.institucion.exceptios;

import co.edu.uco.deviuco.usuarios.crosscutting.exception.RuleDeviUcoException;

public class InstitucionIdIsEmptyException extends RuleDeviUcoException {
    private static final long serialVersionUID = 1L;
    
    private InstitucionIdIsEmptyException(String technicalMessage, String userMessage, Exception rootException) {
        super(technicalMessage, userMessage, rootException);
    }
    
    public static final InstitucionIdIsEmptyException create() {
        var userMessage = "El identificador de la institución está vacío...";
        return new InstitucionIdIsEmptyException(userMessage, userMessage, new Exception());
    }
} 