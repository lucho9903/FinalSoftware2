package co.edu.uco.deviuco.usuarios.domain.ubicacion.exceptions;

import co.edu.uco.deviuco.usuarios.crosscutting.exception.RuleDeviUcoException;

public class UbicacionIdIsEmptyException extends RuleDeviUcoException {
    private static final long serialVersionUID = 1L;
    
    private UbicacionIdIsEmptyException(String technicalMessage, String userMessage, Exception rootException) {
        super(technicalMessage, userMessage, rootException);
    }
    
    public static final UbicacionIdIsEmptyException create() {
        var userMessage = "El identificador de la ubicación está vacío...";
        return new UbicacionIdIsEmptyException(userMessage, userMessage, new Exception());
    }
} 