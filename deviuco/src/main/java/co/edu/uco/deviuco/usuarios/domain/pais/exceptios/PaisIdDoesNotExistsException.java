package co.edu.uco.deviuco.usuarios.domain.pais.exceptios;

import co.edu.uco.deviuco.usuarios.crosscutting.exception.RuleDeviUcoException;

public class PaisIdDoesNotExistsException extends RuleDeviUcoException {
    private static final long serialVersionUID = 1L;
    
    private PaisIdDoesNotExistsException(String technicalMessage, String userMessage, Exception rootException) {
        super(technicalMessage, userMessage, rootException);
    }
    
    public static final PaisIdDoesNotExistsException create() {
        var userMessage = "No existe ningún país con el identificador indicado...";
        return new PaisIdDoesNotExistsException(userMessage, userMessage, new Exception());
    }
} 