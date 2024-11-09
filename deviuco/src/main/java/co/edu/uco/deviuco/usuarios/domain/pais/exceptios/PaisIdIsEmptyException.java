package co.edu.uco.deviuco.usuarios.domain.pais.exceptios;

import co.edu.uco.deviuco.usuarios.crosscutting.exception.RuleDeviUcoException;

public class PaisIdIsEmptyException extends RuleDeviUcoException {
    private static final long serialVersionUID = 1L;
    
    private PaisIdIsEmptyException(String technicalMessage, String userMessage, Exception rootException) {
        super(technicalMessage, userMessage, rootException);
    }
    
    public static final PaisIdIsEmptyException create() {
        var userMessage = "El identificador del país está vacío...";
        return new PaisIdIsEmptyException(userMessage, userMessage, new Exception());
    }
} 