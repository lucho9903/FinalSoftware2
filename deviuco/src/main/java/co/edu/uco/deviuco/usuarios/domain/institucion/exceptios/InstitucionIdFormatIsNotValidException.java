package co.edu.uco.deviuco.usuarios.domain.institucion.exceptios;

import co.edu.uco.deviuco.usuarios.crosscutting.exception.RuleDeviUcoException;

public class InstitucionIdFormatIsNotValidException extends RuleDeviUcoException {
    private static final long serialVersionUID = 1L;
    
    private InstitucionIdFormatIsNotValidException(String technicalMessage, String userMessage, Exception rootException) {
        super(technicalMessage, userMessage, rootException);
    }
    
    public static final InstitucionIdFormatIsNotValidException create() {
        var userMessage = "La institución tiene un identificador con formato no válido correspondiente al valor por defecto...";
        return new InstitucionIdFormatIsNotValidException(userMessage, userMessage, new Exception());
    }
} 