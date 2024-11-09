package co.edu.uco.deviuco.usuarios.domain.ubicacion.exceptions;

import co.edu.uco.deviuco.usuarios.crosscutting.exception.RuleDeviUcoException;

public class UbicacionIdDoesNotExistsException extends RuleDeviUcoException {
    private static final long serialVersionUID = 1L;
    
    private UbicacionIdDoesNotExistsException(String technicalMessage, String userMessage, Exception rootException) {
        super(technicalMessage, userMessage, rootException);
    }
    
    public static final UbicacionIdDoesNotExistsException create() {
        var userMessage = "No existe ninguna ubicación con el identificador indicado...";
        return new UbicacionIdDoesNotExistsException(userMessage, userMessage, new Exception());
    }
} 