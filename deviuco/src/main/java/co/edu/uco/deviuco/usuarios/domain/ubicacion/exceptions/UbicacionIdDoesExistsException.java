package co.edu.uco.deviuco.usuarios.domain.ubicacion.exceptions;

import co.edu.uco.deviuco.usuarios.crosscutting.exception.RuleDeviUcoException;

public class UbicacionIdDoesExistsException extends RuleDeviUcoException {
    private static final long serialVersionUID = 1L;
    
    private UbicacionIdDoesExistsException(String technicalMessage, String userMessage, Exception rootException) {
        super(technicalMessage, userMessage, rootException);
    }
    
    public static final UbicacionIdDoesExistsException create() {
        var userMessage = "La ubicación ya existe en el sistema...";
        return new UbicacionIdDoesExistsException(userMessage, userMessage, new Exception());
    }
} 