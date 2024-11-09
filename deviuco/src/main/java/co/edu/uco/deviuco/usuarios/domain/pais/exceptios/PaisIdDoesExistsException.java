package co.edu.uco.deviuco.usuarios.domain.pais.exceptios;

import co.edu.uco.deviuco.usuarios.crosscutting.exception.RuleDeviUcoException;

public class PaisIdDoesExistsException extends RuleDeviUcoException {
    private static final long serialVersionUID = 1L;
    
    private PaisIdDoesExistsException(String technicalMessage, String userMessage, Exception rootException) {
        super(technicalMessage, userMessage, rootException);
    }
    
    public static final PaisIdDoesExistsException create() {
        var userMessage = "El país ya existe en el sistema...";
        return new PaisIdDoesExistsException(userMessage, userMessage, new Exception());
    }
} 