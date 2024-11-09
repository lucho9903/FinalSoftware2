package co.edu.uco.deviuco.usuarios.domain.pais.exceptios;

import co.edu.uco.deviuco.usuarios.crosscutting.exception.RuleDeviUcoException;

public class PaisIdFormatIsNotValidException extends RuleDeviUcoException {
    private static final long serialVersionUID = 1L;
    
    private PaisIdFormatIsNotValidException(String technicalMessage, String userMessage, Exception rootException) {
        super(technicalMessage, userMessage, rootException);
    }
    
    public static final PaisIdFormatIsNotValidException create() {
        var userMessage = "El país tiene un identificador con formato no válido correspondiente al valor por defecto...";
        return new PaisIdFormatIsNotValidException(userMessage, userMessage, new Exception());
    }
} 